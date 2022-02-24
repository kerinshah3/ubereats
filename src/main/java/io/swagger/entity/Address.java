package io.swagger.entity;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID", nullable = false)
    private Integer id;

    @Column(name = "COUNTRY", length = 50)
    private String country;

    @Column(name = "PROVINCE", length = 50)
    private String province;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STREET_NO")
    private String streetNo;

    @Column(name = "LINE1")
    private String line1;

    @Column(name = "LINE2")
    private String line2;

    @OneToMany(mappedBy = "address")
    private Set<Customer> customers = new LinkedHashSet<>();

    @Column(name = "POSTAL_CODE", length = 10)
    private String postalCode;

    @Column(name = "ADDRESS_TYPE", length = 20)
    private String addressType;

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}