package com.rest.payment.consumer;

import com.rest.payment.services.ProcessPayments;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Profile("kafka")
public class PaymentProcessingConsumerKafka {

    @Autowired
    ProcessPayments processPayments;

    @KafkaListener(topics = "incoming_order_queue", groupId = "orderId")
    public void listener(String record) {
        log.info(
                "Processing Message Value= {} ",
                record);
        int payment;

        String orderId = "1";
        log.info("Payment processing Consumer received new Order : {}", record);
        orderId = record.toString();
        log.info("Payment processing Consumer received new Order : {}", orderId);

        processPayments.verifyPayment(orderId);
    }
}
