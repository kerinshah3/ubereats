package com.server.uber.eats.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.*;

@Slf4j
@Component
public class SendToDeliveryOrderQueue {

    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Destination destination;

    @Transactional
    public void sendOrderId(int orderId){
        log.info("Sending it to Delivery Queue");

        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                MapMessage mapMessage = session.createMapMessage();
                mapMessage.setInt("orderId",orderId);
                return mapMessage;
            }
        });
    }

}
