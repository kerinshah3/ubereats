package com.server.uber.eats.web.soap;


import com.server.uber.eats.entity.OrderMaster;
import com.server.uber.eats.messaging.SendToDeliveryOrderQueue;
import com.server.uber.eats.repository.OrderMasterRepo;
import com.server.uber.eats.repository.OrderMasterRepository;
import io.uber.eats.ws.spring.ObjectFactory;
import io.uber.eats.ws.spring.UpdateOrderStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.Optional;

@Slf4j
@Endpoint
@ConditionalOnProperty(value = "spring.ws.enable" , havingValue = "true")
public class ChangeOrderStatusSpringWs {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private OrderMasterRepo orderMasterRepo;

    @Autowired
    private SendToDeliveryOrderQueue sendToDeliveryOrderQueue;

    @PayloadRoot(
            namespace = "http://spring.ws.eats.uber.io/",
            localPart = "orderUpdateRequest")
    public @ResponsePayload
    JAXBElement<String> changeOrderStatusRequest(@RequestPayload JAXBElement<UpdateOrderStatus> orderUpdateRequest) {
        ObjectFactory factory = new ObjectFactory();

        log.info("{}", orderUpdateRequest.getValue().getOrderId());
        Optional<OrderMaster> orderMaster = orderMasterRepository.findById((int) orderUpdateRequest.getValue().getOrderId());
        if (orderMaster.isPresent()) {
            OrderMaster receivedOrderMaster = orderMaster.get();
            receivedOrderMaster.setOrderStatus(orderUpdateRequest.getValue().getOrderStatus());

            orderMasterRepo.update(receivedOrderMaster.getId(), receivedOrderMaster.getOrderStatus());

            sendToDeliveryOrderQueue.sendOrderId((int) orderUpdateRequest.getValue().getOrderId());
            log.info("DONE");
            return factory.createOrderUpdateResponse("Order Status changed");
        } else {
            return factory.createOrderUpdateResponse("Order Id Not Found");
        }
    }
}
