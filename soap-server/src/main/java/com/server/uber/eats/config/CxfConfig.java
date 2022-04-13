package com.server.uber.eats.config;

import com.server.uber.eats.web.soap.ChangeOrderStatus;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
@ConditionalOnProperty(value = "spring.ws.enable" , havingValue = "false")
public class CxfConfig {

    @Autowired
    ChangeOrderStatus changeOrderStatus;

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, changeOrderStatus);
        endpoint.publish("/orderservice/statuschange");
        return endpoint;
    }

}
