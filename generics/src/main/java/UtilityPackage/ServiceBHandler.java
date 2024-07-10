package UtilityPackage;

public class ServiceBHandler extends ExternalServiceHandler<ServiceBRequest, ServiceBResponse> {

    @Override
    protected boolean isValidRequest(ServiceBRequest request) {
        return request != null && request.isValid();
    }

    @Override
    protected ServiceBResponse interactWithService(ServiceBRequest request) {
        return new ServiceBResponse();
    }

    @Override
    protected boolean isValidResponse(ServiceBResponse response) {
        return response != null && response.isValid();
    }
}
