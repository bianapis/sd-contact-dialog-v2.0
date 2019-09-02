package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOfferUpdateInputModelOfferInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOfferUpdateInputModel
 */
public class BQOfferUpdateInputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private String offerInstanceReference = null;

  private BQOfferUpdateInputModelOfferInstanceRecord offerInstanceRecord = null;

  private Object offerUpdateActionTaskRecord = null;

  private String offerUpdateActionRequest = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Contact Session Procedure instance 
   * @return customerContactSessionProcedureInstanceReference
  **/

  public String getCustomerContactSessionProcedureInstanceReference() {
    return customerContactSessionProcedureInstanceReference;
  }

  public void setCustomerContactSessionProcedureInstanceReference(String customerContactSessionProcedureInstanceReference) {
    this.customerContactSessionProcedureInstanceReference = customerContactSessionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Offer instance 
   * @return offerInstanceReference
  **/

  public String getOfferInstanceReference() {
    return offerInstanceReference;
  }

  public void setOfferInstanceReference(String offerInstanceReference) {
    this.offerInstanceReference = offerInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return offerUpdateActionTaskRecord
  **/

  public Object getOfferUpdateActionTaskRecord() {
    return offerUpdateActionTaskRecord;
  }

  public void setOfferUpdateActionTaskRecord(Object offerUpdateActionTaskRecord) {
    this.offerUpdateActionTaskRecord = offerUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return offerUpdateActionRequest
  **/

  public String getOfferUpdateActionRequest() {
    return offerUpdateActionRequest;
  }

  public void setOfferUpdateActionRequest(String offerUpdateActionRequest) {
    this.offerUpdateActionRequest = offerUpdateActionRequest;
  }


}

