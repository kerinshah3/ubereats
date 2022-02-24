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
 * Driver
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-23T19:11:12.961Z")


public class Driver   {
  @JsonProperty("driverId")
  private Long driverId = null;

  @JsonProperty("driverName")
  private String driverName = null;

  @JsonProperty("driverDetails")
  private String driverDetails = null;

  @JsonProperty("vehicleId")
  private Integer vehicleId = null;

  public Driver driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

  /**
   * Get driverId
   * @return driverId
  **/
  @ApiModelProperty(value = "")


  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public Driver driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

  /**
   * Get driverName
   * @return driverName
  **/
  @ApiModelProperty(value = "")


  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }

  public Driver driverDetails(String driverDetails) {
    this.driverDetails = driverDetails;
    return this;
  }

  /**
   * Get driverDetails
   * @return driverDetails
  **/
  @ApiModelProperty(value = "")


  public String getDriverDetails() {
    return driverDetails;
  }

  public void setDriverDetails(String driverDetails) {
    this.driverDetails = driverDetails;
  }

  public Driver vehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")


  public Integer getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Integer vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Driver driver = (Driver) o;
    return Objects.equals(this.driverId, driver.driverId) &&
        Objects.equals(this.driverName, driver.driverName) &&
        Objects.equals(this.driverDetails, driver.driverDetails) &&
        Objects.equals(this.vehicleId, driver.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverId, driverName, driverDetails, vehicleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Driver {\n");
    
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    driverDetails: ").append(toIndentedString(driverDetails)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
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

