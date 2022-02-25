package io.swagger.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE")
@Getter
@Setter
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VEHICLE_ID", nullable = false)
    private Integer id;

    @Column(name = "DRIVER_ID")
    private Integer driverId;

    @Column(name = "CAR_DETAILS", length = 30)
    private String carDetails;

    @Column(name = "LICENCE_PLATE", length = 10)
    private String licencePlate;

}