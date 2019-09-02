package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOfferRetrieveOutputModelOfferInstanceAnalysis
 */
public class BQOfferRetrieveOutputModelOfferInstanceAnalysis   {
  private Object offerInstanceAnalysisRecord = null;

  private String offerInstanceAnalysisReportType = null;

  private String offerInstanceAnalysisParameters = null;

  private Object offerInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return offerInstanceAnalysisRecord
  **/

  public Object getOfferInstanceAnalysisRecord() {
    return offerInstanceAnalysisRecord;
  }

  public void setOfferInstanceAnalysisRecord(Object offerInstanceAnalysisRecord) {
    this.offerInstanceAnalysisRecord = offerInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return offerInstanceAnalysisReportType
  **/

  public String getOfferInstanceAnalysisReportType() {
    return offerInstanceAnalysisReportType;
  }

  public void setOfferInstanceAnalysisReportType(String offerInstanceAnalysisReportType) {
    this.offerInstanceAnalysisReportType = offerInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return offerInstanceAnalysisParameters
  **/

  public String getOfferInstanceAnalysisParameters() {
    return offerInstanceAnalysisParameters;
  }

  public void setOfferInstanceAnalysisParameters(String offerInstanceAnalysisParameters) {
    this.offerInstanceAnalysisParameters = offerInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return offerInstanceAnalysisReport
  **/

  public Object getOfferInstanceAnalysisReport() {
    return offerInstanceAnalysisReport;
  }

  public void setOfferInstanceAnalysisReport(Object offerInstanceAnalysisReport) {
    this.offerInstanceAnalysisReport = offerInstanceAnalysisReport;
  }


}

