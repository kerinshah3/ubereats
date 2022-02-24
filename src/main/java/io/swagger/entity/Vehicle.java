package io.swagger.entity;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VEHICLE_ID", nullable = false)
    private Integer id;

    @Column(name = "DRIVER_ID")
    private Integer driverId;

    @Column(name = "CAR_DETAILS", length = 50)
    private String carDetails;

    @Column(name = "LICENCE_PLATE", length = 50)
    private String licencePlate;

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}