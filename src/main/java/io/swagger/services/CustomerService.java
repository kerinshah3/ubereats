package io.swagger.services;

import io.swagger.entity.Customer;
import io.swagger.entity.OrderDetail;
import io.swagger.entity.OrderMaster;
import io.swagger.repository.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class CustomerService implements Service<Customer> {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    DishRepository dishRepository;

    @Autowired
    OrderDetailsRepository orderDetailsRepository;

    @Autowired
    OrderMasterRepository orderMasterRepository;

    public void addDish(Integer id, Long restaurantId, Integer dishId, OrderDetail cart) {
        int i = orderMasterRepository.getOrderForCustomer(id);
        log.info(i + " Mara Order ni value ");
        if(i > 0) {
            OrderMaster orderMaster = orderMasterRepository.getOrderMasterId(id);
            orderDetailsRepository.insertIntoOrderDetails(cart.getProdQty(), dishId,orderMaster.getId());
        }
        else{
            OrderMaster orderMaster = OrderMaster.builder()
                    .customer(customerRepository.getById(id))
                    .orderStatus("cart")
                    .build();

            OrderMaster orderMaster1 = orderMasterRepository.save(orderMaster);
            orderDetailsRepository.insertIntoOrderDetails(cart.getProdQty(), dishId,orderMaster1.getId());
        }
    }

    @Override
    public void save(Customer customer) {
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
