package com.server.uber.eats.messaging;

import com.server.uber.eats.entity.OrderMaster;
import com.server.uber.eats.repository.OrderMasterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import java.util.Optional;

@Component
@Slf4j
public class PaymentProcessingConsumer {

    @Autowired
    OrderMasterRepository orderMasterRepository;

    @Transactional
    @JmsListener(destination = "incoming_order_queue")
    private void onMessage(Message message) throws JMSException {

        String orderId;
        log.info("Payment processing Consumer received new Order : {}",message);
        if(message instanceof MapMessage) {

            MapMessage textMessage = (MapMessage) message;
            orderId = textMessage.getString("orderId");
            Optional<OrderMaster> orderMaster = orderMasterRepository.findById(Integer.valueOf(orderId));
            if(orderMaster.isPresent()) {
                OrderMaster receivedOrderMaster = orderMaster.get();
            }
        }
    }

}
