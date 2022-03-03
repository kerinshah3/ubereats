package com.server.uber.eats.config;

import com.atomikos.jms.AtomikosConnectionFactoryBean;
import org.apache.activemq.ActiveMQXAConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.ConnectionFactory;

/**
 * Initialize Atomikos enabled connection factory  by wrapping it in AtomikosConnectionFactoryBean
 */
@Configuration
public class JmsConfiguration {

    @Value("${jms.broker.url}")
    private String brokerUrl;

    @Bean
    public ConnectionFactory connectionFactory() {
        ActiveMQXAConnectionFactory activeMQXAConnectionFactory = new ActiveMQXAConnectionFactory();
        activeMQXAConnectionFactory.setBrokerURL(brokerUrl);

        //
        AtomikosConnectionFactoryBean atomikosConnectionFactoryBean = new AtomikosConnectionFactoryBean();
        atomikosConnectionFactoryBean.setUniqueResourceName("xamq");
        atomikosConnectionFactoryBean.setLocalTransactionMode(false);
        atomikosConnectionFactoryBean.setXaConnectionFactory(activeMQXAConnectionFactory);
        return atomikosConnectionFactoryBean;
    }

    @Bean
    public JmsTemplate jmsTemplate(@Autowired ConnectionFactory connectionFactory) {
        JmsTemplate jmsTemplate = new JmsTemplate(connectionFactory);
        return jmsTemplate;
    }


}
