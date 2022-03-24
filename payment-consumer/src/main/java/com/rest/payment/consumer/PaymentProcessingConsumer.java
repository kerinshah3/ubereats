package com.rest.payment.consumer;

import com.rest.payment.entity.OrderMaster;
import com.rest.payment.repository.OrderMasterRepository;
import com.rest.payment.services.ProcessPayments;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import java.util.Optional;

@Component
@Slf4j
@Profile("jms")
public class PaymentProcessingConsumer {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private ProcessPayments processPayments;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @JmsListener(destination = "incoming_order_queue")
    private void onMessage(Message message) {
        int payment;

        String orderId="1";
        log.info("Payment processing Consumer received new Order : {}", message);
        if (message instanceof MapMessage) {
            MapMessage textMessage = (MapMessage) message;
            try {
                orderId = textMessage.getString("orderId");
            } catch (JMSException e) {
                log.info(e.getLocalizedMessage());
            }
            log.info("Payment processing Consumer received new Order : {}", orderId);

                processPayments.verifyPayment(orderId);
        }
    }
}
