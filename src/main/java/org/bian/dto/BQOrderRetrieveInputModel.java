package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderRetrieveInputModelOrderInstanceAnalysis;
import org.bian.dto.BQOrderRetrieveInputModelOrderInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOrderRetrieveInputModel
 */
public class BQOrderRetrieveInputModel   {
  private Object orderRetrieveActionTaskRecord = null;

  private String orderRetrieveActionRequest = null;

  private BQOrderRetrieveInputModelOrderInstanceReport orderInstanceReport = null;

  private BQOrderRetrieveInputModelOrderInstanceAnalysis orderInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return orderRetrieveActionTaskRecord
  **/

  public Object getOrderRetrieveActionTaskRecord() {
    return orderRetrieveActionTaskRecord;
  }

  public void setOrderRetrieveActionTaskRecord(Object orderRetrieveActionTaskRecord) {
    this.orderRetrieveActionTaskRecord = orderRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return orderRetrieveActionRequest
  **/

  public String getOrderRetrieveActionRequest() {
    return orderRetrieveActionRequest;
  }

  public void setOrderRetrieveActionRequest(String orderRetrieveActionRequest) {
    this.orderRetrieveActionRequest = orderRetrieveActionRequest;
  }


  /**
   * Get orderInstanceReport
   * @return orderInstanceReport
  **/

  public BQOrderRetrieveInputModelOrderInstanceReport getOrderInstanceReport() {
    return orderInstanceReport;
  }

  public void setOrderInstanceReport(BQOrderRetrieveInputModelOrderInstanceReport orderInstanceReport) {
    this.orderInstanceReport = orderInstanceReport;
  }


  /**
   * Get orderInstanceAnalysis
   * @return orderInstanceAnalysis
  **/

  public BQOrderRetrieveInputModelOrderInstanceAnalysis getOrderInstanceAnalysis() {
    return orderInstanceAnalysis;
  }

  public void setOrderInstanceAnalysis(BQOrderRetrieveInputModelOrderInstanceAnalysis orderInstanceAnalysis) {
    this.orderInstanceAnalysis = orderInstanceAnalysis;
  }


}

