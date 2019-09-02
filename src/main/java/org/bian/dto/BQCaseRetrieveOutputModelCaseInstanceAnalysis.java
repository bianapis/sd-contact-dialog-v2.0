package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseRetrieveOutputModelCaseInstanceAnalysis
 */
public class BQCaseRetrieveOutputModelCaseInstanceAnalysis   {
  private Object caseInstanceAnalysisRecord = null;

  private String caseInstanceAnalysisReportType = null;

  private String caseInstanceAnalysisParameters = null;

  private Object caseInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return caseInstanceAnalysisRecord
  **/

  public Object getCaseInstanceAnalysisRecord() {
    return caseInstanceAnalysisRecord;
  }

  public void setCaseInstanceAnalysisRecord(Object caseInstanceAnalysisRecord) {
    this.caseInstanceAnalysisRecord = caseInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return caseInstanceAnalysisReportType
  **/

  public String getCaseInstanceAnalysisReportType() {
    return caseInstanceAnalysisReportType;
  }

  public void setCaseInstanceAnalysisReportType(String caseInstanceAnalysisReportType) {
    this.caseInstanceAnalysisReportType = caseInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return caseInstanceAnalysisParameters
  **/

  public String getCaseInstanceAnalysisParameters() {
    return caseInstanceAnalysisParameters;
  }

  public void setCaseInstanceAnalysisParameters(String caseInstanceAnalysisParameters) {
    this.caseInstanceAnalysisParameters = caseInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return caseInstanceAnalysisReport
  **/

  public Object getCaseInstanceAnalysisReport() {
    return caseInstanceAnalysisReport;
  }

  public void setCaseInstanceAnalysisReport(Object caseInstanceAnalysisReport) {
    this.caseInstanceAnalysisReport = caseInstanceAnalysisReport;
  }


}

