package com.demo.spring_rabbitmq_consumer;

import com.demo.spring_rabbitmq_consumer.config.MQConfig;
import com.demo.spring_rabbitmq_consumer.entity.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage customMessage){
        System.out.println(customMessage);
    }
}
