package com.rest.server.messaging;

import com.kerin.uber.orderStatusUpdate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.MapMessage;
import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
@Component
public class SendToIncomingOrderQueue {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Environment environment;

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Transactional
    public void sendOrderId(int orderId) {

        if( Arrays.asList(environment.getActiveProfiles()).contains("kafka")){
            sendOrderIdKafka(orderId);
        }else {
            sendOrderIdJMS(orderId);
        }
    }

    public void sendOrderIdJMS(int orderId) {
        log.info("Sending to Incoming Order Queue");

        jmsTemplate.send("incoming_order_queue", session -> {
            MapMessage mapMessage = session.createMapMessage();
            mapMessage.setInt("orderId", orderId);
            return mapMessage;
        });
    }

    public void sendOrderIdKafka(int orderId) {
        log.info("Sending to Incoming Order Queue");
        log.info("Order Id {}",orderId);
        orderStatusUpdate orderStatusUpdate = new orderStatusUpdate((long) orderId);
        log.info("Order Id {}",orderStatusUpdate.getOrderId());

        kafkaTemplate.send("incoming-order-topic-1", orderStatusUpdate.getOrderId(), orderStatusUpdate.getOrderId());
    }
}
