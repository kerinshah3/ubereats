package com.kerin.uber.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@ConditionalOnProperty(name="listener.kafka" , havingValue = "true")
public class PaymentProcessedConsumer {

    @KafkaListener(topics = "payment_processed_topic",groupId = "email-payment-status")
    public void getProcessedPayment(String orderId){
        log.info("Received Order Id : {}" ,orderId);

        // TODO: Call a APi for Sending Email
    }
}