package io.swagger.entity;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_OPTIONS")
public class PaymentOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PMT_OPN_ID", nullable = false)
    private Integer id;

    @Column(name = "OPTIONS", length = 50)
    private String options;

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}