package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cart
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-23T19:11:12.961Z")


public class Cart   {
  @JsonProperty("cartId")
  private Long cartId = null;

  @JsonProperty("dishId")
  private Long dishId = null;

  @JsonProperty("dishQuatity")
  private Integer dishQuatity = null;

  @JsonProperty("orderMasterId")
  private Long orderMasterId = null;

  public Cart cartId(Long cartId) {
    this.cartId = cartId;
    return this;
  }

  /**
   * Get cartId
   * @return cartId
  **/
  @ApiModelProperty(value = "")


  public Long getCartId() {
    return cartId;
  }

  public void setCartId(Long cartId) {
    this.cartId = cartId;
  }

  public Cart dishId(Long dishId) {
    this.dishId = dishId;
    return this;
  }

  /**
   * Get dishId
   * @return dishId
  **/
  @ApiModelProperty(value = "")


  public Long getDishId() {
    return dishId;
  }

  public void setDishId(Long dishId) {
    this.dishId = dishId;
  }

  public Cart dishQuatity(Integer dishQuatity) {
    this.dishQuatity = dishQuatity;
    return this;
  }

  /**
   * Get dishQuatity
   * @return dishQuatity
  **/
  @ApiModelProperty(value = "")


  public Integer getDishQuatity() {
    return dishQuatity;
  }

  public void setDishQuatity(Integer dishQuatity) {
    this.dishQuatity = dishQuatity;
  }

  public Cart orderMasterId(Long orderMasterId) {
    this.orderMasterId = orderMasterId;
    return this;
  }

  /**
   * Get orderMasterId
   * @return orderMasterId
  **/
  @ApiModelProperty(value = "")


  public Long getOrderMasterId() {
    return orderMasterId;
  }

  public void setOrderMasterId(Long orderMasterId) {
    this.orderMasterId = orderMasterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.cartId, cart.cartId) &&
        Objects.equals(this.dishId, cart.dishId) &&
        Objects.equals(this.dishQuatity, cart.dishQuatity) &&
        Objects.equals(this.orderMasterId, cart.orderMasterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartId, dishId, dishQuatity, orderMasterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    dishId: ").append(toIndentedString(dishId)).append("\n");
    sb.append("    dishQuatity: ").append(toIndentedString(dishQuatity)).append("\n");
    sb.append("    orderMasterId: ").append(toIndentedString(orderMasterId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

