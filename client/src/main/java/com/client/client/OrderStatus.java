package com.client.client;

import io.uber.eats.ws.ObjectFactory;
import io.uber.eats.ws.OrderStatusUpdatePort;
import io.uber.eats.ws.UpdateOrderStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderStatus {

    @Autowired
    OrderStatusUpdatePort orderStatusUpdatePort;

    public String updateOrderStatus(){
        ObjectFactory objectFactory = new ObjectFactory();

        UpdateOrderStatus updateOrderStatus = objectFactory.createUpdateOrderStatus();
        updateOrderStatus.setOrderId(1);
        updateOrderStatus.setOrderStatus("READY");

       return orderStatusUpdatePort.changeOrderStatusRequest(updateOrderStatus);
    }

}
