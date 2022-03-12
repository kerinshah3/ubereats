package com.client.config;

import io.uber.eats.ws.OrderStatusUpdatePort;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    @Value("${calculator.service.non-ssl.address}")
    private String calculatorServiceNonSSLAddress;

    @Bean(name = "orderStatusUpdatePort")
    public OrderStatusUpdatePort calculatorProxy() throws Exception {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(OrderStatusUpdatePort.class);

        jaxWsProxyFactoryBean.setAddress(calculatorServiceNonSSLAddress);

        OrderStatusUpdatePort orderStatusUpdatePort = (OrderStatusUpdatePort) jaxWsProxyFactoryBean.create();

        return orderStatusUpdatePort;
    }
}
