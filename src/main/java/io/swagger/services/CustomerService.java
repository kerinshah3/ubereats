package io.swagger.services;

import io.swagger.entity.Cart;
import io.swagger.entity.Order;
import io.swagger.model.Customer;
import io.swagger.model.OrderMaster;
import io.swagger.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.time.Instant;

@Component
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    DishRepository dishRepository;

    @Autowired
    CartRepository cartRepository;

    @Autowired
    OrderMasterRepository orderMasterRepository;

    public void addDish(Integer id, Long restaurantId, Long dishId, Cart cart) {


        Order orderMaster = Order.builder()
                .customer(customerRepository.getById(id))
                .orderTs(new Date(2022,24,10))
                .orderStatus("Cart")
                .build();

        orderMasterRepository.save(orderMaster);
        cartRepository.save(cart);

    }
}
