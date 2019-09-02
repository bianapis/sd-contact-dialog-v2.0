package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQueryRetrieveOutputModelQueryInstanceAnalysis
 */
public class BQQueryRetrieveOutputModelQueryInstanceAnalysis   {
  private Object queryInstanceAnalysisRecord = null;

  private String queryInstanceAnalysisReportType = null;

  private String queryInstanceAnalysisParameters = null;

  private Object queryInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return queryInstanceAnalysisRecord
  **/

  public Object getQueryInstanceAnalysisRecord() {
    return queryInstanceAnalysisRecord;
  }

  public void setQueryInstanceAnalysisRecord(Object queryInstanceAnalysisRecord) {
    this.queryInstanceAnalysisRecord = queryInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return queryInstanceAnalysisReportType
  **/

  public String getQueryInstanceAnalysisReportType() {
    return queryInstanceAnalysisReportType;
  }

  public void setQueryInstanceAnalysisReportType(String queryInstanceAnalysisReportType) {
    this.queryInstanceAnalysisReportType = queryInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return queryInstanceAnalysisParameters
  **/

  public String getQueryInstanceAnalysisParameters() {
    return queryInstanceAnalysisParameters;
  }

  public void setQueryInstanceAnalysisParameters(String queryInstanceAnalysisParameters) {
    this.queryInstanceAnalysisParameters = queryInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return queryInstanceAnalysisReport
  **/

  public Object getQueryInstanceAnalysisReport() {
    return queryInstanceAnalysisReport;
  }

  public void setQueryInstanceAnalysisReport(Object queryInstanceAnalysisReport) {
    this.queryInstanceAnalysisReport = queryInstanceAnalysisReport;
  }


}

