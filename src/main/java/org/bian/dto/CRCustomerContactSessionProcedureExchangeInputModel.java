package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureExchangeInputModelCustomerContactSessionProcedureExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureExchangeInputModel
 */
public class CRCustomerContactSessionProcedureExchangeInputModel   {
  private String contactDialogueServicingSessionReference = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private Object customerContactSessionProcedureExchangeActionTaskRecord = null;

  private CRCustomerContactSessionProcedureExchangeInputModelCustomerContactSessionProcedureExchangeActionRequest customerContactSessionProcedureExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return contactDialogueServicingSessionReference
  **/

  public String getContactDialogueServicingSessionReference() {
    return contactDialogueServicingSessionReference;
  }

  public void setContactDialogueServicingSessionReference(String contactDialogueServicingSessionReference) {
    this.contactDialogueServicingSessionReference = contactDialogueServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Contact Session Procedure instance 
   * @return customerContactSessionProcedureInstanceReference
  **/

  public String getCustomerContactSessionProcedureInstanceReference() {
    return customerContactSessionProcedureInstanceReference;
  }

  public void setCustomerContactSessionProcedureInstanceReference(String customerContactSessionProcedureInstanceReference) {
    this.customerContactSessionProcedureInstanceReference = customerContactSessionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerContactSessionProcedureExchangeActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureExchangeActionTaskRecord() {
    return customerContactSessionProcedureExchangeActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureExchangeActionTaskRecord(Object customerContactSessionProcedureExchangeActionTaskRecord) {
    this.customerContactSessionProcedureExchangeActionTaskRecord = customerContactSessionProcedureExchangeActionTaskRecord;
  }


  /**
   * Get customerContactSessionProcedureExchangeActionRequest
   * @return customerContactSessionProcedureExchangeActionRequest
  **/

  public CRCustomerContactSessionProcedureExchangeInputModelCustomerContactSessionProcedureExchangeActionRequest getCustomerContactSessionProcedureExchangeActionRequest() {
    return customerContactSessionProcedureExchangeActionRequest;
  }

  public void setCustomerContactSessionProcedureExchangeActionRequest(CRCustomerContactSessionProcedureExchangeInputModelCustomerContactSessionProcedureExchangeActionRequest customerContactSessionProcedureExchangeActionRequest) {
    this.customerContactSessionProcedureExchangeActionRequest = customerContactSessionProcedureExchangeActionRequest;
  }


}

