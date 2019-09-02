package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureInitiateInputModel
 */
public class CRCustomerContactSessionProcedureInitiateInputModel   {
  private String contactDialogueServicingSessionReference = null;

  private Object customerContactSessionProcedureInitiateActionRecord = null;

  private String customerContactSessionProcedureInstanceStatus = null;

  private CRCustomerContactSessionProcedureInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerContactSessionProcedureInitiateActionRecord
  **/

  public Object getCustomerContactSessionProcedureInitiateActionRecord() {
    return customerContactSessionProcedureInitiateActionRecord;
  }

  public void setCustomerContactSessionProcedureInitiateActionRecord(Object customerContactSessionProcedureInitiateActionRecord) {
    this.customerContactSessionProcedureInitiateActionRecord = customerContactSessionProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Contact Session Procedure instance (e.g. initialised, pending, active) 
   * @return customerContactSessionProcedureInstanceStatus
  **/

  public String getCustomerContactSessionProcedureInstanceStatus() {
    return customerContactSessionProcedureInstanceStatus;
  }

  public void setCustomerContactSessionProcedureInstanceStatus(String customerContactSessionProcedureInstanceStatus) {
    this.customerContactSessionProcedureInstanceStatus = customerContactSessionProcedureInstanceStatus;
  }


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


}

