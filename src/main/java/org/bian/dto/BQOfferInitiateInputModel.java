package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOfferInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQOfferInitiateInputModelOfferInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOfferInitiateInputModel
 */
public class BQOfferInitiateInputModel   {
  private BQOfferInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private Object offerInitiateActionRecord = null;

  private BQOfferInitiateInputModelOfferInstanceRecord offerInstanceRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQOfferInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQOfferInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return offerInitiateActionRecord
  **/

  public Object getOfferInitiateActionRecord() {
    return offerInitiateActionRecord;
  }

  public void setOfferInitiateActionRecord(Object offerInitiateActionRecord) {
    this.offerInitiateActionRecord = offerInitiateActionRecord;
  }


  /**
   * Get offerInstanceRecord
   * @return offerInstanceRecord
  **/

  public BQOfferInitiateInputModelOfferInstanceRecord getOfferInstanceRecord() {
    return offerInstanceRecord;
  }

  public void setOfferInstanceRecord(BQOfferInitiateInputModelOfferInstanceRecord offerInstanceRecord) {
    this.offerInstanceRecord = offerInstanceRecord;
  }


}

