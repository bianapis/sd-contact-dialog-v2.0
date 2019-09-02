package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHistoryRetrieveOutputModelHistoryInstanceAnalysis
 */
public class BQHistoryRetrieveOutputModelHistoryInstanceAnalysis   {
  private Object historyInstanceAnalysisRecord = null;

  private String historyInstanceAnalysisReportType = null;

  private String historyInstanceAnalysisParameters = null;

  private Object historyInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return historyInstanceAnalysisRecord
  **/

  public Object getHistoryInstanceAnalysisRecord() {
    return historyInstanceAnalysisRecord;
  }

  public void setHistoryInstanceAnalysisRecord(Object historyInstanceAnalysisRecord) {
    this.historyInstanceAnalysisRecord = historyInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return historyInstanceAnalysisReportType
  **/

  public String getHistoryInstanceAnalysisReportType() {
    return historyInstanceAnalysisReportType;
  }

  public void setHistoryInstanceAnalysisReportType(String historyInstanceAnalysisReportType) {
    this.historyInstanceAnalysisReportType = historyInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return historyInstanceAnalysisParameters
  **/

  public String getHistoryInstanceAnalysisParameters() {
    return historyInstanceAnalysisParameters;
  }

  public void setHistoryInstanceAnalysisParameters(String historyInstanceAnalysisParameters) {
    this.historyInstanceAnalysisParameters = historyInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return historyInstanceAnalysisReport
  **/

  public Object getHistoryInstanceAnalysisReport() {
    return historyInstanceAnalysisReport;
  }

  public void setHistoryInstanceAnalysisReport(Object historyInstanceAnalysisReport) {
    this.historyInstanceAnalysisReport = historyInstanceAnalysisReport;
  }


}

