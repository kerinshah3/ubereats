package com.rest.payment.consumer;

import com.kerin.uber.orderStatusUpdate;
import com.rest.payment.services.ProcessPayments;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.hibernate.sql.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
@ConditionalOnProperty(name="listener.kafka" , havingValue = "true")
public class PaymentProcessingConsumerKafka {

    @Autowired
    ProcessPayments processPayments;

    @Transactional
    @KafkaListener(topics = "incoming-order-topic-1", groupId = "orderId")
    public void listener(orderStatusUpdate order) {
        log.info(
                "Processing Message Value= {} ",
                order.getOrderId());
        int orderId = (int) order.getOrderId();

        log.info("Payment processing Consumer received new Order : {}", order.getOrderId());

        processPayments.verifyPayment(String.valueOf(orderId));

    }
}
