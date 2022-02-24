package io.swagger.entity;

import javax.persistence.*;

@Entity
@Table(name = "DRIVER")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DRIVER_ID", nullable = false)
    private Integer id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "DETAILS", length = 50)
    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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