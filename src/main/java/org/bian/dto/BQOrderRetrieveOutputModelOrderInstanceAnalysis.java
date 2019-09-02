package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderRetrieveOutputModelOrderInstanceAnalysis
 */
public class BQOrderRetrieveOutputModelOrderInstanceAnalysis   {
  private Object orderInstanceAnalysisRecord = null;

  private String orderInstanceAnalysisReportType = null;

  private String orderInstanceAnalysisParameters = null;

  private Object orderInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return orderInstanceAnalysisRecord
  **/

  public Object getOrderInstanceAnalysisRecord() {
    return orderInstanceAnalysisRecord;
  }

  public void setOrderInstanceAnalysisRecord(Object orderInstanceAnalysisRecord) {
    this.orderInstanceAnalysisRecord = orderInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return orderInstanceAnalysisReportType
  **/

  public String getOrderInstanceAnalysisReportType() {
    return orderInstanceAnalysisReportType;
  }

  public void setOrderInstanceAnalysisReportType(String orderInstanceAnalysisReportType) {
    this.orderInstanceAnalysisReportType = orderInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return orderInstanceAnalysisParameters
  **/

  public String getOrderInstanceAnalysisParameters() {
    return orderInstanceAnalysisParameters;
  }

  public void setOrderInstanceAnalysisParameters(String orderInstanceAnalysisParameters) {
    this.orderInstanceAnalysisParameters = orderInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return orderInstanceAnalysisReport
  **/

  public Object getOrderInstanceAnalysisReport() {
    return orderInstanceAnalysisReport;
  }

  public void setOrderInstanceAnalysisReport(Object orderInstanceAnalysisReport) {
    this.orderInstanceAnalysisReport = orderInstanceAnalysisReport;
  }


}

