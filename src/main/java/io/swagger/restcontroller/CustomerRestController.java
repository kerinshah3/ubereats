package io.swagger.restcontroller;

import io.swagger.entity.Cart;
import io.swagger.models.auth.In;
import io.swagger.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CustomerRestController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customers/{id}/restaurant/{restaurantId}/dish/{dishId}")
    public void addDish(@PathVariable Integer id , @PathVariable Long restaurantId , @PathVariable Long dishId, @RequestBody Cart cart) {
        customerService.addDish(id,restaurantId,dishId,cart);
    }

}
