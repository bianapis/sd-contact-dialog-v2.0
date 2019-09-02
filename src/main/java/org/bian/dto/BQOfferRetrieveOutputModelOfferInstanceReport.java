package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOfferRetrieveOutputModelOfferInstanceReport
 */
public class BQOfferRetrieveOutputModelOfferInstanceReport   {
  private Object offerInstanceReportRecord = null;

  private String offerInstanceReportType = null;

  private String offerInstanceReportParameters = null;

  private Object offerInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return offerInstanceReportRecord
  **/

  public Object getOfferInstanceReportRecord() {
    return offerInstanceReportRecord;
  }

  public void setOfferInstanceReportRecord(Object offerInstanceReportRecord) {
    this.offerInstanceReportRecord = offerInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return offerInstanceReportType
  **/

  public String getOfferInstanceReportType() {
    return offerInstanceReportType;
  }

  public void setOfferInstanceReportType(String offerInstanceReportType) {
    this.offerInstanceReportType = offerInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return offerInstanceReportParameters
  **/

  public String getOfferInstanceReportParameters() {
    return offerInstanceReportParameters;
  }

  public void setOfferInstanceReportParameters(String offerInstanceReportParameters) {
    this.offerInstanceReportParameters = offerInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return offerInstanceReport
  **/

  public Object getOfferInstanceReport() {
    return offerInstanceReport;
  }

  public void setOfferInstanceReport(Object offerInstanceReport) {
    this.offerInstanceReport = offerInstanceReport;
  }


}

