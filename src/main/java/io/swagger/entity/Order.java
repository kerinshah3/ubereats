package io.swagger.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders", indexes = {
        @Index(name = "DRIVER_ID", columnList = "DRIVER_ID"),
        @Index(name = "KF", columnList = "CUSTOMER_ID")
})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @Column(name = "ORDER_TS")
    private Date orderTs;

    @Column(name = "ORDER_AMOUNT")
    private Double orderAmount;

    @Column(name = "ORDER_STATUS", length = 25)
    private String orderStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DRIVER_ID")
    private Driver driver;

    @Column(name = "DELIVERY_TS")
    private Instant deliveryTs;

    public Instant getDeliveryTs() {
        return deliveryTs;
    }

    public void setDeliveryTs(Instant deliveryTs) {
        this.deliveryTs = deliveryTs;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Date getOrderTs() {
        return orderTs;
    }

    public void setOrderTs(Date orderTs) {
        this.orderTs = orderTs;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}