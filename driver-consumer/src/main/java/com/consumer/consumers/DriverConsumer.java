package com.consumer.consumers;

import com.consumer.entity.Driver;
import com.consumer.entity.OrderMaster;
import com.consumer.repository.DriverRepository;
import com.consumer.services.DriverService;
import com.consumer.services.OrderMasterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import java.sql.Date;
import java.util.Optional;

@Slf4j
@Component
@EnableJms
public class DriverConsumer {

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private OrderMasterService orderMasterService;

    @Autowired
    private DriverService driverService;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Transactional
    @JmsListener(destination = "delivery_order_queue")
    public void onMessage(Message message) throws JMSException {

        String orderId;
        log.info("Driver Consumer received request {}", message);
        if (message instanceof MapMessage) {
            MapMessage textMessage = (MapMessage) message;
            orderId = textMessage.getString("orderId");
            log.info("Order id is {}", orderId);
            Optional<OrderMaster> orderMaster = orderMasterService.findById(Integer.valueOf(orderId));
            Optional<Driver> driver = driverRepository.findActiveDriver("available");
            if (driver.isPresent()) {
                if (orderMaster.isPresent()) {
                    log.info("driver is available");
                    Driver receivedDriver = driver.get();
                    receivedDriver.setDriverStatus("Delivering");
                    log.info("assigning order to this driver {}", receivedDriver.getId());
                    driverService.save(receivedDriver);
                    OrderMaster receivedOrderMaster = orderMaster.get();
                    receivedOrderMaster.setOrderStatus("On the Way");
                    receivedOrderMaster.setDriver(receivedDriver);
                    receivedOrderMaster.setEstDeliveryTs(new Date(System.currentTimeMillis() + 1000));
                    orderMasterService.save(receivedOrderMaster);
                } else {
                    log.info("Order Id was Wrong from activeMQ");
                }

            } else {
                log.info("no driver is available at this location ");
            }

        } else {
            log.info("fail to convert");
        }
    }
}
