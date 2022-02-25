package io.swagger.restcontroller;

import io.swagger.entity.OrderDetail;
import io.swagger.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerRestController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customers/{id}/restaurant/{restaurantId}/dish/{dishId}")
    public void addDish(@PathVariable Integer id , @PathVariable Long restaurantId , @PathVariable Integer dishId, @RequestBody OrderDetail cart) {
        customerService.addDish(id,restaurantId,dishId,cart);
    }

}
