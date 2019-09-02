package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureControlInputModelCustomerContactSessionProcedureControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureControlInputModel
 */
public class CRCustomerContactSessionProcedureControlInputModel   {
  private String contactDialogueServicingSessionReference = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private Object customerContactSessionProcedureControlActionTaskRecord = null;

  private CRCustomerContactSessionProcedureControlInputModelCustomerContactSessionProcedureControlActionRequest customerContactSessionProcedureControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerContactSessionProcedureControlActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureControlActionTaskRecord() {
    return customerContactSessionProcedureControlActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureControlActionTaskRecord(Object customerContactSessionProcedureControlActionTaskRecord) {
    this.customerContactSessionProcedureControlActionTaskRecord = customerContactSessionProcedureControlActionTaskRecord;
  }


  /**
   * Get customerContactSessionProcedureControlActionRequest
   * @return customerContactSessionProcedureControlActionRequest
  **/

  public CRCustomerContactSessionProcedureControlInputModelCustomerContactSessionProcedureControlActionRequest getCustomerContactSessionProcedureControlActionRequest() {
    return customerContactSessionProcedureControlActionRequest;
  }

  public void setCustomerContactSessionProcedureControlActionRequest(CRCustomerContactSessionProcedureControlInputModelCustomerContactSessionProcedureControlActionRequest customerContactSessionProcedureControlActionRequest) {
    this.customerContactSessionProcedureControlActionRequest = customerContactSessionProcedureControlActionRequest;
  }


}

