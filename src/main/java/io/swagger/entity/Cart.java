package io.swagger.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart", indexes = {
        @Index(name = "ORDER_ID", columnList = "ORDER_ID"),
        @Index(name = "DISH_ID", columnList = "DISH_ID")
})
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_DETAIL_ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order orders;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISH_ID", referencedColumnName = "RESTAURANT_ID")
    private Dish dish;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "DISH_AMOUNT")
    private Double dishAmount;

    public Double getDishAmount() {
        return dishAmount;
    }

    public void setDishAmount(Double dishAmount) {
        this.dishAmount = dishAmount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}