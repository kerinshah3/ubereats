package com.rest.payment.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
@ConditionalOnProperty(name="listener.kafka" , havingValue = "true")
public class SendToPaymentProcessedKafka {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    @Transactional
    public void sendToPaymentProcessed(String orderId){
        log.info("Sending Email for payment Status");
        kafkaTemplate.send("payment_processed_topic",orderId);
    }
}