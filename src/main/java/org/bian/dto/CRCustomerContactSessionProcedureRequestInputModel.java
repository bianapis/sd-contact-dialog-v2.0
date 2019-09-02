package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureRequestInputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.CRCustomerContactSessionProcedureRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureRequestInputModel
 */
public class CRCustomerContactSessionProcedureRequestInputModel   {
  private String contactDialogueServicingSessionReference = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private CRCustomerContactSessionProcedureRequestInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private Object customerContactSessionProcedureRequestActionTaskRecord = null;

  private CRCustomerContactSessionProcedureRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerContactSessionProcedureRequestInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureRequestInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerContactSessionProcedureRequestActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureRequestActionTaskRecord() {
    return customerContactSessionProcedureRequestActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureRequestActionTaskRecord(Object customerContactSessionProcedureRequestActionTaskRecord) {
    this.customerContactSessionProcedureRequestActionTaskRecord = customerContactSessionProcedureRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerContactSessionProcedureRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerContactSessionProcedureRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

