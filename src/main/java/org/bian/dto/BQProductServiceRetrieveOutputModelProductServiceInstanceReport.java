package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceRetrieveOutputModelProductServiceInstanceReport
 */
public class BQProductServiceRetrieveOutputModelProductServiceInstanceReport   {
  private Object productServiceInstanceReportRecord = null;

  private String productServiceInstanceReportType = null;

  private String productServiceInstanceReportParameters = null;

  private Object productServiceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return productServiceInstanceReportRecord
  **/

  public Object getProductServiceInstanceReportRecord() {
    return productServiceInstanceReportRecord;
  }

  public void setProductServiceInstanceReportRecord(Object productServiceInstanceReportRecord) {
    this.productServiceInstanceReportRecord = productServiceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return productServiceInstanceReportType
  **/

  public String getProductServiceInstanceReportType() {
    return productServiceInstanceReportType;
  }

  public void setProductServiceInstanceReportType(String productServiceInstanceReportType) {
    this.productServiceInstanceReportType = productServiceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return productServiceInstanceReportParameters
  **/

  public String getProductServiceInstanceReportParameters() {
    return productServiceInstanceReportParameters;
  }

  public void setProductServiceInstanceReportParameters(String productServiceInstanceReportParameters) {
    this.productServiceInstanceReportParameters = productServiceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return productServiceInstanceReport
  **/

  public Object getProductServiceInstanceReport() {
    return productServiceInstanceReport;
  }

  public void setProductServiceInstanceReport(Object productServiceInstanceReport) {
    this.productServiceInstanceReport = productServiceInstanceReport;
  }


}

