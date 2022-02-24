package io.swagger.entity;

import javax.persistence.*;

@Entity
@Table(name = "RESTAURANT", indexes = {
        @Index(name = "KF", columnList = "ADDRESS_ID")
})
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RESTAURANT_ID", nullable = false)
    private Integer id;

    @Column(name = "NAME", length = 30)
    private String name;

    @Column(name = "DESCRIPTION", length = 100)
    private String description;

    @Column(name = "ADDRESS_ID")
    private Integer addressId;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}