package designpattern.structural.adapter;

public interface Adapter {
}

class AmazonCloudAdapter implements ClientBrokerInterface {

    AmazonCloudProvider amazonProvider = new AmazonCloudProvider();

    @Override
    public void start(String id) {
        amazonProvider.startVM(id);
    }

    @Override
    public void stop(String id) {
        amazonProvider.stopVM(id);
    }

    @Override
    public void restart(String id) {
        amazonProvider.rebootVM(id);
    }
}

class AzureCloudAdapter implements ClientBrokerInterface {

    AzureCloudProvider azureProvider = new AzureCloudProvider();

    @Override
    public void start(String id) {
        azureProvider.bootVM(id, "");
    }

    @Override
    public void stop(String id) {
        azureProvider.terminateVM(id, "");
    }

    @Override
    public void restart(String id) {
        azureProvider.rebootVM(id);
    }
}

class GoogleCloudAdapter implements ClientBrokerInterface {

    GoogleCloudProvider googleProvider = new GoogleCloudProvider();

    @Override
    public void start(String id) {
        googleProvider.startVM(id);
    }

    @Override
    public void stop(String id) {
        googleProvider.shutdownVM(id);
    }

    @Override
    public void restart(String id) {
        googleProvider.shutdownVM(id);
        googleProvider.startVM(id);
    }
}
