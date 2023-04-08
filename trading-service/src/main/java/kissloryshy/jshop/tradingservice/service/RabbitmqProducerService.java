package kissloryshy.jshop.tradingservice.service;

public interface RabbitmqProducerService {
    void sendMessage(String message, String routingKey);
}
