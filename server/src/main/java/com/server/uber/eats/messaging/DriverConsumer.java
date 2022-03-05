package com.server.uber.eats.messaging;

import com.server.uber.eats.entity.Driver;
import com.server.uber.eats.repository.DriverRepository;
import com.server.uber.eats.services.DriverService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.*;
import java.util.Optional;

@Slf4j
@Component
@EnableJms
public class DriverConsumer {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private DriverService driverService;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Transactional
    @JmsListener(destination = "delivery_order_queue")
    public void onMessage(Message message) throws JMSException {

        String orderId;
        log.info("Driver Consumer received request {}" , message);
        if(message instanceof MapMessage)
        {
            MapMessage textMessage = (MapMessage) message;
            orderId = textMessage.getString("orderId");
            log.info("Order id is {}" , orderId);

            Optional<Driver> driver = driverRepository.findActiveDriver("available");
            if(driver.isPresent()) {
                log.info("driver is available");
                Driver receivedDriver = driver.get();
                receivedDriver.setDriverStatus("Delivering");
                log.info("assigning order to this driver {}" , receivedDriver.getId());
//                driverRepository.updateDriverStatus(receivedDriver);
                driverService.save(receivedDriver);

            }else {
                log.info("no driver is avaiable at the ");
            }

        } else {
            log.info("fail to convert");
        }
    }
}
