package kissloryshy.jshop.tradingservice.service;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RabbitmqProducerServiceImpl implements RabbitmqProducerService {
    private final RabbitTemplate rabbitTemplate;

    @Override
    public void sendMessage(String message, String routingKey) {
        rabbitTemplate.convertAndSend("testExchange", routingKey, message);
    }
}
