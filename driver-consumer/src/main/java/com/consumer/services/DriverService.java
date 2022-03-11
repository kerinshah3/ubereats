package com.consumer.services;

import com.consumer.entity.Driver;
import com.consumer.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public void save(Driver driver) {
        driverRepository.save(driver);
    }
}
