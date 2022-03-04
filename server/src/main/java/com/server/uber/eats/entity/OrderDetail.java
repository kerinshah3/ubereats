package com.server.uber.eats.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_DETAILS")
@Getter
@Setter
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_DETAILS_ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private OrderMaster orderMaster;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISH_ID")
    private Dish dish;

    @Column(name = "PROD_QTY")
    private Integer prodQty;

    @Column(name = "PROD_TOTAL_AMT")
    private Double prodTotalAmt;
}
