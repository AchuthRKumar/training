package com.demo.spring_rabbitmq_producer.controller;

import com.demo.spring_rabbitmq_producer.config.MQConfig;
import com.demo.spring_rabbitmq_producer.entity.CustomMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MessagePublisherController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage customMessage){
        customMessage.setMessageId(UUID.randomUUID().toString());
        customMessage.setMessageDate(new Date());
        rabbitTemplate.convertAndSend(MQConfig.EXCHANGE, MQConfig.ROUTING_KEY, customMessage);
        return "Message Published";
    }
}
