package io.uber.eats.soap;

import io.uber.eats.entity.OrderMaster;
import io.uber.eats.repository.OrderMasterRepository;
import io.uber.eats.ws.ObjectFactory;
import io.uber.eats.ws.OrderStatusUpdatePort;
import io.uber.eats.ws.UpdateOrderStatus;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

@WebService()
public class ChangeOrderStatus implements OrderStatusUpdatePort {

    @Autowired
    OrderMasterRepository orderMasterRepository;

    @Override
    public String changeOrderStatusRequest(UpdateOrderStatus orderUpdateRequest) {

        OrderMaster orderMaster = orderMasterRepository.getOrderMasterId(orderUpdateRequest.getOrderId());

        orderMaster.setOrderStatus(orderUpdateRequest.getOrderStatus());

        orderMasterRepository.save(orderMaster);

        return null;
    }
}
