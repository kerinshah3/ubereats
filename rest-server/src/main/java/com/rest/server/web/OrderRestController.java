package com.rest.server.web;

import com.rest.server.entity.OrderDetail;
import com.rest.server.entity.OrderMaster;
import com.rest.server.messaging.SendToIncomingOrderQueue;
import com.rest.server.services.CustomerService;
import com.rest.server.services.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderRestController {

    @Autowired
    OrderMasterService orderMasterService;

    @Autowired
    SendToIncomingOrderQueue sendToIncomingOrderQueue;

    @Autowired
    CustomerService customerService;

    @PostMapping("/order")
    public void saveOrder(@RequestBody OrderMaster orderMaster) {
        orderMasterService.save(orderMaster);
        sendToIncomingOrderQueue.sendOrderId(orderMaster.getId());
    }

    @PostMapping("/customers/{id}/restaurant/{restaurantId}/dish/{dishId}")
    public void addDish(
            @PathVariable Integer id,
            @PathVariable Long restaurantId,
            @PathVariable Integer dishId,
            @RequestBody OrderDetail cart) {
        customerService.addDish(id, restaurantId, dishId, cart);
    }

    @PatchMapping("/customers/{id}/order/{orderId}")
    public ResponseEntity placeOrder(@PathVariable Integer id, @PathVariable Integer orderId) {
        customerService.updateOrderStatusToPlaced(id, orderId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
