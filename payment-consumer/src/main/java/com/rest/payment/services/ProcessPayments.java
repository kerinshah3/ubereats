package com.rest.payment.services;

import com.rest.payment.entity.OrderMaster;
import com.rest.payment.producer.SendToPaymentProcessedKafka;
import com.rest.payment.repository.OrderMasterRepository;
import com.rest.payment.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
public class ProcessPayments {

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    OrderMasterRepository orderMasterRepository;

    @Autowired
    SendToPaymentProcessedKafka paymentProcessedKafka;

    @Transactional
    public void verifyPayment(String orderId) {
        log.info("inside verify payment");
        // TODO: Stripe API CAll

        Optional<OrderMaster> orderMaster = orderMasterRepository.findById(Integer.valueOf(orderId));
        if(orderMaster.isPresent())
        {
            orderMasterRepository.updateOrderMasterPaymentStatus(orderMaster.get().getId());
            paymentProcessedKafka.sendToPaymentProcessed(orderId);
        }
        else {
            log.info("No such Order Exist {}" ,orderId);
        }
    }
}
