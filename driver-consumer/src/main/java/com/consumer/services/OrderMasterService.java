package com.consumer.services;

import com.consumer.entity.OrderMaster;
import com.consumer.repository.OrderMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderMasterService {

    @Autowired
    OrderMasterRepository orderMasterRepository;

    public void save(OrderMaster orderMaster) {
        orderMasterRepository.save(orderMaster);
    }

    public Optional<OrderMaster> findById(Integer orderId) {
        return orderMasterRepository.findById(orderId);
    }
}
