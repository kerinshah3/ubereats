package com.rest.payment.entity;

import lombok.*;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ORDER_MASTER")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUST_ID")
    private Customer customer;

    @Column(name = "ORDER_TS")
    private java.util.Date orderTs;

    @Column(name = "ORDER_AMT")
    private Double orderAmt;

    @Column(name = "ORDER_STATUS", length = 15)
    private String orderStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DRIVER_ID")
    private Driver driver;

    @Column(name = "EST_DELIVERY_TS")
    private java.util.Date estDeliveryTs;

    @OneToMany(mappedBy = "orderMaster")
    private Set<OrderDetail> orderDetails = new LinkedHashSet<>();
}
