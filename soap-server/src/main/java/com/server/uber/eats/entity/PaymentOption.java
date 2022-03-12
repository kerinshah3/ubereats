package com.server.uber.eats.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_OPTIONS")
@Getter
@Setter
public class PaymentOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PMT_OPT_ID", nullable = false)
    private Integer id;

    @Column(name = "PMT_OPT", length = 20)
    private String pmtOpt;
}
