package UtilityPackage;

public class ServiceAHandler extends ExternalServiceHandler<ServiceARequest, ServiceAResponse> {

    @Override
    protected boolean isValidRequest(ServiceARequest request) {
        return request != null && request.isValid();
    }

    @Override
    protected ServiceAResponse interactWithService(ServiceARequest request) {
        return new ServiceAResponse();
    }

    @Override
    protected boolean isValidResponse(ServiceAResponse response) {
        return response != null && response.isValid();
    }
}
