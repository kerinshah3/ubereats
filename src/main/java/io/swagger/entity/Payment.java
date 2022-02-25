package io.swagger.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "PAYMENT")
@Getter
@Setter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PMT_ID", nullable = false)
    private Integer id;

    @Column(name = "PMT_OPT_ID")
    private Integer pmtOptId;

    @Column(name = "ORDER_ID")
    private Integer orderId;

    @Column(name = "CARD_NO", length = 16)
    private String cardNo;

    @Column(name = "EXP_DATE")
    private LocalDate expDate;

    @Column(name = "CVV", length = 3)
    private String cvv;

}