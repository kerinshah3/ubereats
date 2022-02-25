package io.swagger.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ADDRESS")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID", nullable = false)
    private Integer id;

    @Column(name = "STREET_NO")
    private Integer streetNo;

    @Column(name = "LINE1", length = 100)
    private String line1;

    @Column(name = "CITY", length = 100)
    private String city;

    @Column(name = "PROVINCE", length = 100)
    private String province;

    @Column(name = "COUNTRY", length = 100)
    private String country;

    @Column(name = "POSTAL_CODE", length = 6)
    private String postalCode;

    @Column(name = "ADDRESS_TYPE", length = 20)
    private String addressType;

    @OneToMany(mappedBy = "address")
    private Set<Customer> customers = new LinkedHashSet<>();

}