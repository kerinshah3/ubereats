package com.server.uber.eats.messaging;

import com.server.uber.eats.entity.Driver;
import com.server.uber.eats.repository.DriverRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.*;

@Slf4j
@Component
@EnableJms
public class DriverConsumer {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "delivery_order_queue")
    public void onMessage(Message message) throws JMSException {

        String orderId;
        log.info("Driver Consumer received request {}" , message);
        if(message instanceof MapMessage)
        {
            MapMessage textMessage = (MapMessage) message;
            orderId = textMessage.getString("orderId");
            log.info("Order id is {}" , orderId);

            Driver driver = driverRepository.getById(1);

        }
        else
        {
            log.info("fail to convert");
        }


    }
}
