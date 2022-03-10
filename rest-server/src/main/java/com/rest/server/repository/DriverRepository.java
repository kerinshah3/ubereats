package com.rest.server.repository;

import com.rest.server.entity.Driver;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {

    @Query(value = "select * from driver where driver_status =:driverStatus LIMIT 1", nativeQuery = true)
    Optional<Driver> findActiveDriver(@Param("driverStatus") String driverStatus);

    //    void updateDriverStatus(Driver receivedDriver);
}
