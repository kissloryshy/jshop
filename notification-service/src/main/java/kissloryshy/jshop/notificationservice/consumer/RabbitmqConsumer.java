package kissloryshy.jshop.notificationservice.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@Slf4j
public class RabbitmqConsumer {
    @RabbitListener(queues = "queue1")
    public void processMyQueue(String message) {
        log.warn("Received from queue1 : " + new String(message.getBytes()));
    }
}
