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
 * Dish
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-23T19:11:12.961Z")


public class Dish   {
  @JsonProperty("dishId")
  private Long dishId = null;

  @JsonProperty("dishName")
  private String dishName = null;

  @JsonProperty("dishDescription")
  private String dishDescription = null;

  @JsonProperty("dishPrice")
  private Integer dishPrice = null;

  @JsonProperty("restaurantId")
  private Integer restaurantId = null;

  public Dish dishId(Long dishId) {
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

  public Dish dishName(String dishName) {
    this.dishName = dishName;
    return this;
  }

  /**
   * Get dishName
   * @return dishName
  **/
  @ApiModelProperty(value = "")


  public String getDishName() {
    return dishName;
  }

  public void setDishName(String dishName) {
    this.dishName = dishName;
  }

  public Dish dishDescription(String dishDescription) {
    this.dishDescription = dishDescription;
    return this;
  }

  /**
   * Get dishDescription
   * @return dishDescription
  **/
  @ApiModelProperty(value = "")


  public String getDishDescription() {
    return dishDescription;
  }

  public void setDishDescription(String dishDescription) {
    this.dishDescription = dishDescription;
  }

  public Dish dishPrice(Integer dishPrice) {
    this.dishPrice = dishPrice;
    return this;
  }

  /**
   * Get dishPrice
   * @return dishPrice
  **/
  @ApiModelProperty(value = "")


  public Integer getDishPrice() {
    return dishPrice;
  }

  public void setDishPrice(Integer dishPrice) {
    this.dishPrice = dishPrice;
  }

  public Dish restaurantId(Integer restaurantId) {
    this.restaurantId = restaurantId;
    return this;
  }

  /**
   * Get restaurantId
   * @return restaurantId
  **/
  @ApiModelProperty(value = "")


  public Integer getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(Integer restaurantId) {
    this.restaurantId = restaurantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dish dish = (Dish) o;
    return Objects.equals(this.dishId, dish.dishId) &&
        Objects.equals(this.dishName, dish.dishName) &&
        Objects.equals(this.dishDescription, dish.dishDescription) &&
        Objects.equals(this.dishPrice, dish.dishPrice) &&
        Objects.equals(this.restaurantId, dish.restaurantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dishId, dishName, dishDescription, dishPrice, restaurantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dish {\n");
    
    sb.append("    dishId: ").append(toIndentedString(dishId)).append("\n");
    sb.append("    dishName: ").append(toIndentedString(dishName)).append("\n");
    sb.append("    dishDescription: ").append(toIndentedString(dishDescription)).append("\n");
    sb.append("    dishPrice: ").append(toIndentedString(dishPrice)).append("\n");
    sb.append("    restaurantId: ").append(toIndentedString(restaurantId)).append("\n");
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

