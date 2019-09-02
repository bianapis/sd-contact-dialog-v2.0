package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelAuthenticationInstanceAnalysis
 */
public class BQAuthenticationRetrieveOutputModelAuthenticationInstanceAnalysis   {
  private Object authenticationInstanceAnalysisRecord = null;

  private String authenticationInstanceAnalysisReportType = null;

  private String authenticationInstanceAnalysisParameters = null;

  private Object authenticationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return authenticationInstanceAnalysisRecord
  **/

  public Object getAuthenticationInstanceAnalysisRecord() {
    return authenticationInstanceAnalysisRecord;
  }

  public void setAuthenticationInstanceAnalysisRecord(Object authenticationInstanceAnalysisRecord) {
    this.authenticationInstanceAnalysisRecord = authenticationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return authenticationInstanceAnalysisReportType
  **/

  public String getAuthenticationInstanceAnalysisReportType() {
    return authenticationInstanceAnalysisReportType;
  }

  public void setAuthenticationInstanceAnalysisReportType(String authenticationInstanceAnalysisReportType) {
    this.authenticationInstanceAnalysisReportType = authenticationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return authenticationInstanceAnalysisParameters
  **/

  public String getAuthenticationInstanceAnalysisParameters() {
    return authenticationInstanceAnalysisParameters;
  }

  public void setAuthenticationInstanceAnalysisParameters(String authenticationInstanceAnalysisParameters) {
    this.authenticationInstanceAnalysisParameters = authenticationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return authenticationInstanceAnalysisReport
  **/

  public Object getAuthenticationInstanceAnalysisReport() {
    return authenticationInstanceAnalysisReport;
  }

  public void setAuthenticationInstanceAnalysisReport(Object authenticationInstanceAnalysisReport) {
    this.authenticationInstanceAnalysisReport = authenticationInstanceAnalysisReport;
  }


}

