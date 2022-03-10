package com.server.uber.eats.services;

import com.server.uber.eats.entity.Dish;
import com.server.uber.eats.entity.OrderDetail;
import com.server.uber.eats.entity.OrderMaster;
import com.server.uber.eats.messaging.SendToIncomingOrderQueue;
import com.server.uber.eats.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    DishRepository dishRepository;

    @Autowired
    OrderDetailsRepository orderDetailRepository;

    @Autowired
    SendToIncomingOrderQueue sendToIncomingOrderQueue;

    @Autowired
    OrderMasterRepository orderMasterRepository;
    public void addDish(Integer id, Long restaurantId, Integer dishId, OrderDetail cart) {
        int i = orderMasterRepository.getDishCountForCustomer(id);

        if (i > 0) {
            OrderMaster orderMaster = orderMasterRepository.getOrderMasterId(id);
            updateCartData(dishId, cart, orderMaster);
        } else {
            OrderMaster orderMaster = OrderMaster.builder()
                    .customer(customerRepository.getById(id))
                    .orderStatus("cart")
                    .build();
            OrderMaster orderMaster1 = orderMasterRepository.save(orderMaster);
            updateCartData(dishId, cart, orderMaster1);
        }
    }

    private void updateCartData(Integer dishId, OrderDetail cart, OrderMaster orderMaster) {
        Optional<Dish> dish = dishRepository.findById(dishId);
        Double totalDishAmount = dish.get().getRate() * cart.getProdQty();
        orderDetailRepository.insertIntoOrderDetails(cart.getProdQty(), dishId, orderMaster.getId(), totalDishAmount);
    }
    public void updateOrderStatusToPlaced(Integer id, Integer orderId) {
        Double orderTotalAmt = orderDetailRepository.getSumOfTotalAmountForParticularOrder(orderId);
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        orderMasterRepository.updateOrderMasterStatus(id, orderId, orderTotalAmt, date);
        sendToIncomingOrderQueue.sendOrderId(orderId);
    }
}
