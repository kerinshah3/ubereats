package com.server.uber.eats.services;

import com.server.uber.eats.entity.OrderMaster;
import com.server.uber.eats.repository.OrderMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

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
