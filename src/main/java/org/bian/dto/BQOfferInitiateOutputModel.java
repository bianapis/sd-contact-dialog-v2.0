package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOfferInitiateOutputModelOfferInstanceRecord;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOfferInitiateOutputModel
 */
public class BQOfferInitiateOutputModel   {
  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String offerInstanceReference = null;

  private String offerInitiateActionReference = null;

  private Object offerInitiateActionRecord = null;

  private String offerInstanceStatus = null;

  private BQOfferInitiateOutputModelOfferInstanceRecord offerInstanceRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return offerInitiateActionReference
  **/

  public String getOfferInitiateActionReference() {
    return offerInitiateActionReference;
  }

  public void setOfferInitiateActionReference(String offerInitiateActionReference) {
    this.offerInitiateActionReference = offerInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Offer instance (e.g. initialised, pending, active) 
   * @return offerInstanceStatus
  **/

  public String getOfferInstanceStatus() {
    return offerInstanceStatus;
  }

  public void setOfferInstanceStatus(String offerInstanceStatus) {
    this.offerInstanceStatus = offerInstanceStatus;
  }


  /**
   * Get offerInstanceRecord
   * @return offerInstanceRecord
  **/

  public BQOfferInitiateOutputModelOfferInstanceRecord getOfferInstanceRecord() {
    return offerInstanceRecord;
  }

  public void setOfferInstanceRecord(BQOfferInitiateOutputModelOfferInstanceRecord offerInstanceRecord) {
    this.offerInstanceRecord = offerInstanceRecord;
  }


}

