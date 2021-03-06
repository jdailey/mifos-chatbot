/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
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
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;

/**
 * PostTellersTellerIdCashiersCashierIdAllocateRequest
 */

public class PostTellersTellerIdCashiersCashierIdAllocateRequest {
  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("txnAmount")
  private BigDecimal txnAmount = null;

  @SerializedName("txnNote")
  private String txnNote = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("txnDate")
  private OffsetDateTime txnDate = null;

  public PostTellersTellerIdCashiersCashierIdAllocateRequest currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PostTellersTellerIdCashiersCashierIdAllocateRequest txnAmount(BigDecimal txnAmount) {
    this.txnAmount = txnAmount;
    return this;
  }

   /**
   * Get txnAmount
   * @return txnAmount
  **/
  @ApiModelProperty(example = "5000.0", value = "")
  public BigDecimal getTxnAmount() {
    return txnAmount;
  }

  public void setTxnAmount(BigDecimal txnAmount) {
    this.txnAmount = txnAmount;
  }

  public PostTellersTellerIdCashiersCashierIdAllocateRequest txnNote(String txnNote) {
    this.txnNote = txnNote;
    return this;
  }

   /**
   * Get txnNote
   * @return txnNote
  **/
  @ApiModelProperty(example = "allocating cash", value = "")
  public String getTxnNote() {
    return txnNote;
  }

  public void setTxnNote(String txnNote) {
    this.txnNote = txnNote;
  }

  public PostTellersTellerIdCashiersCashierIdAllocateRequest locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(example = "en", value = "")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public PostTellersTellerIdCashiersCashierIdAllocateRequest dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @ApiModelProperty(example = "dd-MM-yyyy", value = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public PostTellersTellerIdCashiersCashierIdAllocateRequest txnDate(OffsetDateTime txnDate) {
    this.txnDate = txnDate;
    return this;
  }

   /**
   * Get txnDate
   * @return txnDate
  **/
  @ApiModelProperty(example = "01 February 2015", value = "")
  public OffsetDateTime getTxnDate() {
    return txnDate;
  }

  public void setTxnDate(OffsetDateTime txnDate) {
    this.txnDate = txnDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTellersTellerIdCashiersCashierIdAllocateRequest postTellersTellerIdCashiersCashierIdAllocateRequest = (PostTellersTellerIdCashiersCashierIdAllocateRequest) o;
    return Objects.equals(this.currencyCode, postTellersTellerIdCashiersCashierIdAllocateRequest.currencyCode) &&
        Objects.equals(this.txnAmount, postTellersTellerIdCashiersCashierIdAllocateRequest.txnAmount) &&
        Objects.equals(this.txnNote, postTellersTellerIdCashiersCashierIdAllocateRequest.txnNote) &&
        Objects.equals(this.locale, postTellersTellerIdCashiersCashierIdAllocateRequest.locale) &&
        Objects.equals(this.dateFormat, postTellersTellerIdCashiersCashierIdAllocateRequest.dateFormat) &&
        Objects.equals(this.txnDate, postTellersTellerIdCashiersCashierIdAllocateRequest.txnDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, txnAmount, txnNote, locale, dateFormat, txnDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTellersTellerIdCashiersCashierIdAllocateRequest {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    txnAmount: ").append(toIndentedString(txnAmount)).append("\n");
    sb.append("    txnNote: ").append(toIndentedString(txnNote)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    txnDate: ").append(toIndentedString(txnDate)).append("\n");
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

