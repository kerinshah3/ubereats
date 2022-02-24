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
 * Restaurant
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-23T19:11:12.961Z")


public class Restaurant   {
  @JsonProperty("restaurantId")
  private Long restaurantId = null;

  @JsonProperty("restaurantName")
  private String restaurantName = null;

  @JsonProperty("restaurantDescription")
  private String restaurantDescription = null;

  @JsonProperty("AddressId")
  private Integer addressId = null;

  public Restaurant restaurantId(Long restaurantId) {
    this.restaurantId = restaurantId;
    return this;
  }

  /**
   * Get restaurantId
   * @return restaurantId
  **/
  @ApiModelProperty(value = "")


  public Long getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(Long restaurantId) {
    this.restaurantId = restaurantId;
  }

  public Restaurant restaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
    return this;
  }

  /**
   * Get restaurantName
   * @return restaurantName
  **/
  @ApiModelProperty(value = "")


  public String getRestaurantName() {
    return restaurantName;
  }

  public void setRestaurantName(String restaurantName) {
    this.restaurantName = restaurantName;
  }

  public Restaurant restaurantDescription(String restaurantDescription) {
    this.restaurantDescription = restaurantDescription;
    return this;
  }

  /**
   * Get restaurantDescription
   * @return restaurantDescription
  **/
  @ApiModelProperty(value = "")


  public String getRestaurantDescription() {
    return restaurantDescription;
  }

  public void setRestaurantDescription(String restaurantDescription) {
    this.restaurantDescription = restaurantDescription;
  }

  public Restaurant addressId(Integer addressId) {
    this.addressId = addressId;
    return this;
  }

  /**
   * Get addressId
   * @return addressId
  **/
  @ApiModelProperty(value = "")


  public Integer getAddressId() {
    return addressId;
  }

  public void setAddressId(Integer addressId) {
    this.addressId = addressId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Restaurant restaurant = (Restaurant) o;
    return Objects.equals(this.restaurantId, restaurant.restaurantId) &&
        Objects.equals(this.restaurantName, restaurant.restaurantName) &&
        Objects.equals(this.restaurantDescription, restaurant.restaurantDescription) &&
        Objects.equals(this.addressId, restaurant.addressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restaurantId, restaurantName, restaurantDescription, addressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Restaurant {\n");
    
    sb.append("    restaurantId: ").append(toIndentedString(restaurantId)).append("\n");
    sb.append("    restaurantName: ").append(toIndentedString(restaurantName)).append("\n");
    sb.append("    restaurantDescription: ").append(toIndentedString(restaurantDescription)).append("\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
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

