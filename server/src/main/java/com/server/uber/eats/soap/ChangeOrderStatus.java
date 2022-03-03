package com.server.uber.eats.soap;

import com.server.uber.eats.entity.OrderMaster;
import com.server.uber.eats.repository.OrderMasterRepository;
import io.uber.eats.ws.OrderStatusUpdatePort;
import io.uber.eats.ws.UpdateOrderStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.jws.WebService;
import java.util.Optional;

@WebService(serviceName = "OrderStatusService" ,
        portName = "OrderServicePortType",
        targetNamespace = "http://ws.eats.uber.io/" ,
        endpointInterface = "io.uber.eats.ws.OrderStatusUpdatePort")
@Slf4j
@Component
public class ChangeOrderStatus implements OrderStatusUpdatePort {

    @Autowired
    OrderMasterRepository orderMasterRepository;


    @Override
    public String changeOrderStatusRequest(UpdateOrderStatus orderUpdateRequest) {
        log.info("{}",orderUpdateRequest.getOrderId());
        Optional<OrderMaster> orderMaster = orderMasterRepository.findById((int) orderUpdateRequest.getOrderId());
        if(orderMaster.isPresent()) {
            OrderMaster receivedOrderMaster = orderMaster.get();
            log.info("{}",receivedOrderMaster.getOrderStatus());
            log.info("{}",receivedOrderMaster.getOrderAmt());
            log.info("{}",receivedOrderMaster.getCustomer());
            receivedOrderMaster.setOrderStatus("Ready For Pick Up");
            orderMasterRepository.updateReadyStatus(orderUpdateRequest.getOrderStatus(),(int) orderUpdateRequest.getOrderId());
            return "Order Status Updated";
        }
        else {
            return "Order Id Not Found";
        }
    }
}
