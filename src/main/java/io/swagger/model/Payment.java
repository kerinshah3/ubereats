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
 * Payment
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-02-23T19:11:12.961Z")


public class Payment   {
  @JsonProperty("paymentId")
  private Integer paymentId = null;

  @JsonProperty("paymentDate")
  private String paymentDate = null;

  @JsonProperty("paymentOptionId")
  private Integer paymentOptionId = null;

  @JsonProperty("orderMasterId")
  private Integer orderMasterId = null;

  @JsonProperty("paymentStatus")
  private String paymentStatus = null;

  @JsonProperty("paymentAmount")
  private Integer paymentAmount = null;

  @JsonProperty("paymentCardNumber")
  private String paymentCardNumber = null;

  @JsonProperty("paymentCardExpDate")
  private String paymentCardExpDate = null;

  @JsonProperty("paymentCardCVV")
  private Integer paymentCardCVV = null;

  public Payment paymentId(Integer paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
  **/
  @ApiModelProperty(value = "")


  public Integer getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(Integer paymentId) {
    this.paymentId = paymentId;
  }

  public Payment paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * Get paymentDate
   * @return paymentDate
  **/
  @ApiModelProperty(value = "")


  public String getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  public Payment paymentOptionId(Integer paymentOptionId) {
    this.paymentOptionId = paymentOptionId;
    return this;
  }

  /**
   * Get paymentOptionId
   * @return paymentOptionId
  **/
  @ApiModelProperty(value = "")


  public Integer getPaymentOptionId() {
    return paymentOptionId;
  }

  public void setPaymentOptionId(Integer paymentOptionId) {
    this.paymentOptionId = paymentOptionId;
  }

  public Payment orderMasterId(Integer orderMasterId) {
    this.orderMasterId = orderMasterId;
    return this;
  }

  /**
   * Get orderMasterId
   * @return orderMasterId
  **/
  @ApiModelProperty(value = "")


  public Integer getOrderMasterId() {
    return orderMasterId;
  }

  public void setOrderMasterId(Integer orderMasterId) {
    this.orderMasterId = orderMasterId;
  }

  public Payment paymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * Get paymentStatus
   * @return paymentStatus
  **/
  @ApiModelProperty(value = "")


  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public Payment paymentAmount(Integer paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @ApiModelProperty(value = "")


  public Integer getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(Integer paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public Payment paymentCardNumber(String paymentCardNumber) {
    this.paymentCardNumber = paymentCardNumber;
    return this;
  }

  /**
   * Get paymentCardNumber
   * @return paymentCardNumber
  **/
  @ApiModelProperty(value = "")


  public String getPaymentCardNumber() {
    return paymentCardNumber;
  }

  public void setPaymentCardNumber(String paymentCardNumber) {
    this.paymentCardNumber = paymentCardNumber;
  }

  public Payment paymentCardExpDate(String paymentCardExpDate) {
    this.paymentCardExpDate = paymentCardExpDate;
    return this;
  }

  /**
   * Get paymentCardExpDate
   * @return paymentCardExpDate
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="([0-9]{4})-(?:[0-9]{2})-([0-9]{2})") 
  public String getPaymentCardExpDate() {
    return paymentCardExpDate;
  }

  public void setPaymentCardExpDate(String paymentCardExpDate) {
    this.paymentCardExpDate = paymentCardExpDate;
  }

  public Payment paymentCardCVV(Integer paymentCardCVV) {
    this.paymentCardCVV = paymentCardCVV;
    return this;
  }

  /**
   * Get paymentCardCVV
   * @return paymentCardCVV
  **/
  @ApiModelProperty(value = "")


  public Integer getPaymentCardCVV() {
    return paymentCardCVV;
  }

  public void setPaymentCardCVV(Integer paymentCardCVV) {
    this.paymentCardCVV = paymentCardCVV;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.paymentId, payment.paymentId) &&
        Objects.equals(this.paymentDate, payment.paymentDate) &&
        Objects.equals(this.paymentOptionId, payment.paymentOptionId) &&
        Objects.equals(this.orderMasterId, payment.orderMasterId) &&
        Objects.equals(this.paymentStatus, payment.paymentStatus) &&
        Objects.equals(this.paymentAmount, payment.paymentAmount) &&
        Objects.equals(this.paymentCardNumber, payment.paymentCardNumber) &&
        Objects.equals(this.paymentCardExpDate, payment.paymentCardExpDate) &&
        Objects.equals(this.paymentCardCVV, payment.paymentCardCVV);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, paymentDate, paymentOptionId, orderMasterId, paymentStatus, paymentAmount, paymentCardNumber, paymentCardExpDate, paymentCardCVV);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    paymentOptionId: ").append(toIndentedString(paymentOptionId)).append("\n");
    sb.append("    orderMasterId: ").append(toIndentedString(orderMasterId)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentCardNumber: ").append(toIndentedString(paymentCardNumber)).append("\n");
    sb.append("    paymentCardExpDate: ").append(toIndentedString(paymentCardExpDate)).append("\n");
    sb.append("    paymentCardCVV: ").append(toIndentedString(paymentCardCVV)).append("\n");
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

