package com.rest.server.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.MapMessage;

@Slf4j
@Component
public class SendToIncomingOrderQueue {

    @Autowired
    JmsTemplate jmsTemplate;

    @Transactional
    public void sendOrderId(int orderId) {
        log.info("Sending to Incoming Order Queue");

        jmsTemplate.send("incoming_order_queue", session -> {
            MapMessage mapMessage = session.createMapMessage();
            mapMessage.setInt("orderId", orderId);
            return mapMessage;
        });
    }
}
