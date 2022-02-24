package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * OrderMaster
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")

@Builder
public class OrderMaster   {
  @JsonProperty("orderMasterId")
  private Long orderMasterId = null;

  @JsonProperty("orderDate")
  private String orderDate = null;

  @JsonProperty("orderStatus")
  private String orderStatus = null;

  @JsonProperty("driverId")
  private Integer driverId = null;

  @JsonProperty("customerId")
  private Integer customerId = null;

  public OrderMaster orderMasterId(Long orderMasterId) {
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

  public OrderMaster orderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  /**
   * Get orderDate
   * @return orderDate
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="([0-9]{4})-(?:[0-9]{2})-([0-9]{2})") 
  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public OrderMaster orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public OrderMaster driverId(Integer driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * Get driverId
   * @return driverId
  **/
  @ApiModelProperty(value = "")


  public Integer getDriverId() {
    return driverId;
  }

  public void setDriverId(Integer driverId) {
    this.driverId = driverId;
  }

  public OrderMaster customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMaster orderMaster = (OrderMaster) o;
    return Objects.equals(this.orderMasterId, orderMaster.orderMasterId) &&
        Objects.equals(this.orderDate, orderMaster.orderDate) &&
        Objects.equals(this.orderStatus, orderMaster.orderStatus) &&
        Objects.equals(this.driverId, orderMaster.driverId) &&
        Objects.equals(this.customerId, orderMaster.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderMasterId, orderDate, orderStatus, driverId, customerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMaster {\n");
    
    sb.append("    orderMasterId: ").append(toIndentedString(orderMasterId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

