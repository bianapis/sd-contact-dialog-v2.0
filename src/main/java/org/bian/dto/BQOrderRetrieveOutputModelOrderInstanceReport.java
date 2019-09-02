package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderRetrieveOutputModelOrderInstanceReport
 */
public class BQOrderRetrieveOutputModelOrderInstanceReport   {
  private Object orderInstanceReportRecord = null;

  private String orderInstanceReportType = null;

  private String orderInstanceReportParameters = null;

  private Object orderInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return orderInstanceReportRecord
  **/

  public Object getOrderInstanceReportRecord() {
    return orderInstanceReportRecord;
  }

  public void setOrderInstanceReportRecord(Object orderInstanceReportRecord) {
    this.orderInstanceReportRecord = orderInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return orderInstanceReportType
  **/

  public String getOrderInstanceReportType() {
    return orderInstanceReportType;
  }

  public void setOrderInstanceReportType(String orderInstanceReportType) {
    this.orderInstanceReportType = orderInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return orderInstanceReportParameters
  **/

  public String getOrderInstanceReportParameters() {
    return orderInstanceReportParameters;
  }

  public void setOrderInstanceReportParameters(String orderInstanceReportParameters) {
    this.orderInstanceReportParameters = orderInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return orderInstanceReport
  **/

  public Object getOrderInstanceReport() {
    return orderInstanceReport;
  }

  public void setOrderInstanceReport(Object orderInstanceReport) {
    this.orderInstanceReport = orderInstanceReport;
  }


}

