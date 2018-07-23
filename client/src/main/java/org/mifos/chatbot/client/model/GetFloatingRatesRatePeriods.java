/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetFloatingRatesRatePeriods
 */

public class GetFloatingRatesRatePeriods {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("fromDate")
  private String fromDate = null;

  @SerializedName("interestRate")
  private Double interestRate = null;

  @SerializedName("isDifferentialToBaseLendingRate")
  private Boolean isDifferentialToBaseLendingRate = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdOn")
  private String createdOn = null;

  @SerializedName("modifiedBy")
  private String modifiedBy = null;

  @SerializedName("modifiedOn")
  private String modifiedOn = null;

  public GetFloatingRatesRatePeriods id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetFloatingRatesRatePeriods fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(example = "Dec 15, 2015", value = "")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public GetFloatingRatesRatePeriods interestRate(Double interestRate) {
    this.interestRate = interestRate;
    return this;
  }

   /**
   * Get interestRate
   * @return interestRate
  **/
  @ApiModelProperty(example = "11.0", value = "")
  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public GetFloatingRatesRatePeriods isDifferentialToBaseLendingRate(Boolean isDifferentialToBaseLendingRate) {
    this.isDifferentialToBaseLendingRate = isDifferentialToBaseLendingRate;
    return this;
  }

   /**
   * Get isDifferentialToBaseLendingRate
   * @return isDifferentialToBaseLendingRate
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isIsDifferentialToBaseLendingRate() {
    return isDifferentialToBaseLendingRate;
  }

  public void setIsDifferentialToBaseLendingRate(Boolean isDifferentialToBaseLendingRate) {
    this.isDifferentialToBaseLendingRate = isDifferentialToBaseLendingRate;
  }

  public GetFloatingRatesRatePeriods isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public GetFloatingRatesRatePeriods createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public GetFloatingRatesRatePeriods createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(example = "Nov 18, 2015", value = "")
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public GetFloatingRatesRatePeriods modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(example = "mifos", value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public GetFloatingRatesRatePeriods modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @ApiModelProperty(example = "Nov 18, 2015", value = "")
  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFloatingRatesRatePeriods getFloatingRatesRatePeriods = (GetFloatingRatesRatePeriods) o;
    return Objects.equals(this.id, getFloatingRatesRatePeriods.id) &&
        Objects.equals(this.fromDate, getFloatingRatesRatePeriods.fromDate) &&
        Objects.equals(this.interestRate, getFloatingRatesRatePeriods.interestRate) &&
        Objects.equals(this.isDifferentialToBaseLendingRate, getFloatingRatesRatePeriods.isDifferentialToBaseLendingRate) &&
        Objects.equals(this.isActive, getFloatingRatesRatePeriods.isActive) &&
        Objects.equals(this.createdBy, getFloatingRatesRatePeriods.createdBy) &&
        Objects.equals(this.createdOn, getFloatingRatesRatePeriods.createdOn) &&
        Objects.equals(this.modifiedBy, getFloatingRatesRatePeriods.modifiedBy) &&
        Objects.equals(this.modifiedOn, getFloatingRatesRatePeriods.modifiedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromDate, interestRate, isDifferentialToBaseLendingRate, isActive, createdBy, createdOn, modifiedBy, modifiedOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFloatingRatesRatePeriods {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    isDifferentialToBaseLendingRate: ").append(toIndentedString(isDifferentialToBaseLendingRate)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
