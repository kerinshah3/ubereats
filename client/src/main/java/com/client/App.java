package com.client;

import com.client.client.OrderStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);

        OrderStatus orderStatus = run.getBean(OrderStatus.class);

        System.out.println(orderStatus.updateOrderStatus());
    }
}
