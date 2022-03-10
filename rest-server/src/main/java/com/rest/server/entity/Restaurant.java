package com.rest.server.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "RESTAURANT")
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REST_ID", nullable = false)
    private Integer id;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "DESCRIPTION", length = 100)
    private String description;

    @Column(name = "ADDRESS_ID")
    private Integer addressId;

    @OneToMany(mappedBy = "restaurant")
    private Set<Dish> dishes = new LinkedHashSet<>();
}
