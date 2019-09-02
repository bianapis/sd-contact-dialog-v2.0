package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductServiceRetrieveInputModelProductServiceInstanceAnalysis;
import org.bian.dto.BQProductServiceRetrieveInputModelProductServiceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductServiceRetrieveInputModel
 */
public class BQProductServiceRetrieveInputModel   {
  private Object productServiceRetrieveActionTaskRecord = null;

  private String productServiceRetrieveActionRequest = null;

  private BQProductServiceRetrieveInputModelProductServiceInstanceReport productServiceInstanceReport = null;

  private BQProductServiceRetrieveInputModelProductServiceInstanceAnalysis productServiceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productServiceRetrieveActionTaskRecord
  **/

  public Object getProductServiceRetrieveActionTaskRecord() {
    return productServiceRetrieveActionTaskRecord;
  }

  public void setProductServiceRetrieveActionTaskRecord(Object productServiceRetrieveActionTaskRecord) {
    this.productServiceRetrieveActionTaskRecord = productServiceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return productServiceRetrieveActionRequest
  **/

  public String getProductServiceRetrieveActionRequest() {
    return productServiceRetrieveActionRequest;
  }

  public void setProductServiceRetrieveActionRequest(String productServiceRetrieveActionRequest) {
    this.productServiceRetrieveActionRequest = productServiceRetrieveActionRequest;
  }


  /**
   * Get productServiceInstanceReport
   * @return productServiceInstanceReport
  **/

  public BQProductServiceRetrieveInputModelProductServiceInstanceReport getProductServiceInstanceReport() {
    return productServiceInstanceReport;
  }

  public void setProductServiceInstanceReport(BQProductServiceRetrieveInputModelProductServiceInstanceReport productServiceInstanceReport) {
    this.productServiceInstanceReport = productServiceInstanceReport;
  }


  /**
   * Get productServiceInstanceAnalysis
   * @return productServiceInstanceAnalysis
  **/

  public BQProductServiceRetrieveInputModelProductServiceInstanceAnalysis getProductServiceInstanceAnalysis() {
    return productServiceInstanceAnalysis;
  }

  public void setProductServiceInstanceAnalysis(BQProductServiceRetrieveInputModelProductServiceInstanceAnalysis productServiceInstanceAnalysis) {
    this.productServiceInstanceAnalysis = productServiceInstanceAnalysis;
  }


}

