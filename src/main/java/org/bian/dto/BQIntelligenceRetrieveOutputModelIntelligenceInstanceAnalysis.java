package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIntelligenceRetrieveOutputModelIntelligenceInstanceAnalysis
 */
public class BQIntelligenceRetrieveOutputModelIntelligenceInstanceAnalysis   {
  private Object intelligenceInstanceAnalysisRecord = null;

  private String intelligenceInstanceAnalysisReportType = null;

  private String intelligenceInstanceAnalysisParameters = null;

  private Object intelligenceInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return intelligenceInstanceAnalysisRecord
  **/

  public Object getIntelligenceInstanceAnalysisRecord() {
    return intelligenceInstanceAnalysisRecord;
  }

  public void setIntelligenceInstanceAnalysisRecord(Object intelligenceInstanceAnalysisRecord) {
    this.intelligenceInstanceAnalysisRecord = intelligenceInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return intelligenceInstanceAnalysisReportType
  **/

  public String getIntelligenceInstanceAnalysisReportType() {
    return intelligenceInstanceAnalysisReportType;
  }

  public void setIntelligenceInstanceAnalysisReportType(String intelligenceInstanceAnalysisReportType) {
    this.intelligenceInstanceAnalysisReportType = intelligenceInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return intelligenceInstanceAnalysisParameters
  **/

  public String getIntelligenceInstanceAnalysisParameters() {
    return intelligenceInstanceAnalysisParameters;
  }

  public void setIntelligenceInstanceAnalysisParameters(String intelligenceInstanceAnalysisParameters) {
    this.intelligenceInstanceAnalysisParameters = intelligenceInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return intelligenceInstanceAnalysisReport
  **/

  public Object getIntelligenceInstanceAnalysisReport() {
    return intelligenceInstanceAnalysisReport;
  }

  public void setIntelligenceInstanceAnalysisReport(Object intelligenceInstanceAnalysisReport) {
    this.intelligenceInstanceAnalysisReport = intelligenceInstanceAnalysisReport;
  }


}

