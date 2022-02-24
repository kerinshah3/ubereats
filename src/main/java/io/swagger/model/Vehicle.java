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
 * Vehicle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-23T19:11:12.961Z")


public class Vehicle   {
  @JsonProperty("vehicleId")
  private Long vehicleId = null;

  @JsonProperty("licencePlate")
  private String licencePlate = null;

  @JsonProperty("vehicleDetails")
  private String vehicleDetails = null;

  public Vehicle vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

  /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")


  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public Vehicle licencePlate(String licencePlate) {
    this.licencePlate = licencePlate;
    return this;
  }

  /**
   * Get licencePlate
   * @return licencePlate
  **/
  @ApiModelProperty(value = "")


  public String getLicencePlate() {
    return licencePlate;
  }

  public void setLicencePlate(String licencePlate) {
    this.licencePlate = licencePlate;
  }

  public Vehicle vehicleDetails(String vehicleDetails) {
    this.vehicleDetails = vehicleDetails;
    return this;
  }

  /**
   * Get vehicleDetails
   * @return vehicleDetails
  **/
  @ApiModelProperty(value = "")


  public String getVehicleDetails() {
    return vehicleDetails;
  }

  public void setVehicleDetails(String vehicleDetails) {
    this.vehicleDetails = vehicleDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.vehicleId, vehicle.vehicleId) &&
        Objects.equals(this.licencePlate, vehicle.licencePlate) &&
        Objects.equals(this.vehicleDetails, vehicle.vehicleDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vehicleId, licencePlate, vehicleDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    licencePlate: ").append(toIndentedString(licencePlate)).append("\n");
    sb.append("    vehicleDetails: ").append(toIndentedString(vehicleDetails)).append("\n");
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

