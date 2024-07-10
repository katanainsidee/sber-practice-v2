public abstract class ExternalServiceHandler<Request, Response> {

    public final Response handleRequest(Request request) {
        if (!isValidRequest(request)) {
            throw new IllegalArgumentException("Invalid request");
        }

        Response response = interactWithService(request);

        if (!isValidResponse(response)) {
            throw new IllegalArgumentException("Invalid response");
        }

        return response;
    }

    protected abstract boolean isValidRequest(Request request);
    protected abstract Response interactWithService(Request request);
    protected abstract boolean isValidResponse(Response response);
}