package com.rest.payment.services;

import com.rest.payment.entity.OrderMaster;
import com.rest.payment.repository.OrderMasterRepository;
import com.rest.payment.repository.PaymentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ProcessPayments {

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    OrderMasterRepository orderMasterRepository;


    public void verifyPayment(String orderId) {
        log.info("inside verify payment");
        // TODO: Stripe API CAll

        Optional<OrderMaster> orderMaster = orderMasterRepository.findById(Integer.valueOf(orderId));
        if(orderMaster.isPresent())
        {
            orderMasterRepository.updateOrderMasterPaymentStatus(orderMaster.get().getId());
        }
    }
}
