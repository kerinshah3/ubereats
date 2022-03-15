package com.server.uber.eats;

import com.server.uber.eats.web.soap.ChangeOrderStatus;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
// @EnableJpaRepositories(transactionManagerRef = "platformTransactionManager")
public class UberEatsApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(UberEatsApp.class);

        Bus bus = context.getBean(Bus.class);
        ChangeOrderStatus changeOrderStatus = context.getBean(ChangeOrderStatus.class);

        EndpointImpl endpoint = new EndpointImpl(bus, changeOrderStatus);
        endpoint.publish("/orderservice");
    }
}
