package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceRetrieveOutputModelProductServiceInstanceAnalysis
 */
public class BQProductServiceRetrieveOutputModelProductServiceInstanceAnalysis   {
  private Object productServiceInstanceAnalysisRecord = null;

  private String productServiceInstanceAnalysisReportType = null;

  private String productServiceInstanceAnalysisParameters = null;

  private Object productServiceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return productServiceInstanceAnalysisRecord
  **/

  public Object getProductServiceInstanceAnalysisRecord() {
    return productServiceInstanceAnalysisRecord;
  }

  public void setProductServiceInstanceAnalysisRecord(Object productServiceInstanceAnalysisRecord) {
    this.productServiceInstanceAnalysisRecord = productServiceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return productServiceInstanceAnalysisReportType
  **/

  public String getProductServiceInstanceAnalysisReportType() {
    return productServiceInstanceAnalysisReportType;
  }

  public void setProductServiceInstanceAnalysisReportType(String productServiceInstanceAnalysisReportType) {
    this.productServiceInstanceAnalysisReportType = productServiceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return productServiceInstanceAnalysisParameters
  **/

  public String getProductServiceInstanceAnalysisParameters() {
    return productServiceInstanceAnalysisParameters;
  }

  public void setProductServiceInstanceAnalysisParameters(String productServiceInstanceAnalysisParameters) {
    this.productServiceInstanceAnalysisParameters = productServiceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return productServiceInstanceAnalysisReport
  **/

  public Object getProductServiceInstanceAnalysisReport() {
    return productServiceInstanceAnalysisReport;
  }

  public void setProductServiceInstanceAnalysisReport(Object productServiceInstanceAnalysisReport) {
    this.productServiceInstanceAnalysisReport = productServiceInstanceAnalysisReport;
  }


}

