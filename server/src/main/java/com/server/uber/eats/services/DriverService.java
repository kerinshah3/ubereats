package com.server.uber.eats.services;

import com.server.uber.eats.entity.Driver;
import com.server.uber.eats.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public void save(Driver driver){
        driverRepository.save(driver);
    }

}
