package com.rest.payment.consumer;

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
    @KafkaListener(topics = "incoming_order_queue", groupId = "orderId")
    public void listener(String orderId) {
        log.info(
                "Processing Message Value= {} ",
                orderId);
        int payment;

        log.info("Payment processing Consumer received new Order : {}", orderId);

        processPayments.verifyPayment(orderId);

    }
}
