package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureUpdateInputModel
 */
public class CRCustomerContactSessionProcedureUpdateInputModel   {
  private String contactDialogueServicingSessionReference = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private CRCustomerContactSessionProcedureUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private Object customerContactSessionProcedureUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerContactSessionProcedureUpdateActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureUpdateActionTaskRecord() {
    return customerContactSessionProcedureUpdateActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureUpdateActionTaskRecord(Object customerContactSessionProcedureUpdateActionTaskRecord) {
    this.customerContactSessionProcedureUpdateActionTaskRecord = customerContactSessionProcedureUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

