package io.uber.eats.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "DISH")
@Getter
@Setter
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DISH_ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REST_ID")
    private Restaurant restaurant;

    @Column(name = "NAME", length = 15)
    private String name;

    @Column(name = "DESCRIPTION", length = 150)
    private String description;

    @Column(name = "RATE")
    private Double rate;

    @OneToMany(mappedBy = "dish")
    private Set<OrderDetail> orderDetails = new LinkedHashSet<>();

}