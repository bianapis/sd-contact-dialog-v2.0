package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOfferRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQOfferRetrieveOutputModelOfferInstanceAnalysis;
import org.bian.dto.BQOfferRetrieveOutputModelOfferInstanceReport;
import org.bian.dto.BQOfferUpdateInputModelOfferInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOfferRetrieveOutputModel
 */
public class BQOfferRetrieveOutputModel   {
  private BQOfferRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQOfferUpdateInputModelOfferInstanceRecord offerInstanceRecord = null;

  private String offerRetrieveActionTaskReference = null;

  private Object offerRetrieveActionTaskRecord = null;

  private String offerRetrieveActionResponse = null;

  private BQOfferRetrieveOutputModelOfferInstanceReport offerInstanceReport = null;

  private BQOfferRetrieveOutputModelOfferInstanceAnalysis offerInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQOfferRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(BQOfferRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * Get offerInstanceRecord
   * @return offerInstanceRecord
  **/

  public BQOfferUpdateInputModelOfferInstanceRecord getOfferInstanceRecord() {
    return offerInstanceRecord;
  }

  public void setOfferInstanceRecord(BQOfferUpdateInputModelOfferInstanceRecord offerInstanceRecord) {
    this.offerInstanceRecord = offerInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Offer instance retrieve service call 
   * @return offerRetrieveActionTaskReference
  **/

  public String getOfferRetrieveActionTaskReference() {
    return offerRetrieveActionTaskReference;
  }

  public void setOfferRetrieveActionTaskReference(String offerRetrieveActionTaskReference) {
    this.offerRetrieveActionTaskReference = offerRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return offerRetrieveActionResponse
  **/

  public String getOfferRetrieveActionResponse() {
    return offerRetrieveActionResponse;
  }

  public void setOfferRetrieveActionResponse(String offerRetrieveActionResponse) {
    this.offerRetrieveActionResponse = offerRetrieveActionResponse;
  }


  /**
   * Get offerInstanceReport
   * @return offerInstanceReport
  **/

  public BQOfferRetrieveOutputModelOfferInstanceReport getOfferInstanceReport() {
    return offerInstanceReport;
  }

  public void setOfferInstanceReport(BQOfferRetrieveOutputModelOfferInstanceReport offerInstanceReport) {
    this.offerInstanceReport = offerInstanceReport;
  }


  /**
   * Get offerInstanceAnalysis
   * @return offerInstanceAnalysis
  **/

  public BQOfferRetrieveOutputModelOfferInstanceAnalysis getOfferInstanceAnalysis() {
    return offerInstanceAnalysis;
  }

  public void setOfferInstanceAnalysis(BQOfferRetrieveOutputModelOfferInstanceAnalysis offerInstanceAnalysis) {
    this.offerInstanceAnalysis = offerInstanceAnalysis;
  }


}

