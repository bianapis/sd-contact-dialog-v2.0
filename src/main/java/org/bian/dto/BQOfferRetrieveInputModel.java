package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOfferRetrieveInputModelOfferInstanceAnalysis;
import org.bian.dto.BQOfferRetrieveInputModelOfferInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOfferRetrieveInputModel
 */
public class BQOfferRetrieveInputModel   {
  private Object offerRetrieveActionTaskRecord = null;

  private String offerRetrieveActionRequest = null;

  private BQOfferRetrieveInputModelOfferInstanceReport offerInstanceReport = null;

  private BQOfferRetrieveInputModelOfferInstanceAnalysis offerInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return offerRetrieveActionTaskRecord
  **/

  public Object getOfferRetrieveActionTaskRecord() {
    return offerRetrieveActionTaskRecord;
  }

  public void setOfferRetrieveActionTaskRecord(Object offerRetrieveActionTaskRecord) {
    this.offerRetrieveActionTaskRecord = offerRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return offerRetrieveActionRequest
  **/

  public String getOfferRetrieveActionRequest() {
    return offerRetrieveActionRequest;
  }

  public void setOfferRetrieveActionRequest(String offerRetrieveActionRequest) {
    this.offerRetrieveActionRequest = offerRetrieveActionRequest;
  }


  /**
   * Get offerInstanceReport
   * @return offerInstanceReport
  **/

  public BQOfferRetrieveInputModelOfferInstanceReport getOfferInstanceReport() {
    return offerInstanceReport;
  }

  public void setOfferInstanceReport(BQOfferRetrieveInputModelOfferInstanceReport offerInstanceReport) {
    this.offerInstanceReport = offerInstanceReport;
  }


  /**
   * Get offerInstanceAnalysis
   * @return offerInstanceAnalysis
  **/

  public BQOfferRetrieveInputModelOfferInstanceAnalysis getOfferInstanceAnalysis() {
    return offerInstanceAnalysis;
  }

  public void setOfferInstanceAnalysis(BQOfferRetrieveInputModelOfferInstanceAnalysis offerInstanceAnalysis) {
    this.offerInstanceAnalysis = offerInstanceAnalysis;
  }


}

