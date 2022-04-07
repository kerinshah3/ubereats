package com.kerin.uber.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "DRIVER")
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DRIVER_ID", nullable = false)
    private Integer id;

    @Column(name = "FULL_NAME", length = 30)
    private String fullName;

    @Column(name = "DETAILS", length = 30)
    private String details;

    @Column(name = "Driver_Status", length = 30)
    private String driverStatus;

    @OneToMany(mappedBy = "driver")
    private Set<OrderMaster> orderMasters = new LinkedHashSet<>();
}
