package designpattern.structural.adapter;

public interface ClientBrokerInterface {
    void start(String id);
    void stop(String id);
    void restart(String id);
}
