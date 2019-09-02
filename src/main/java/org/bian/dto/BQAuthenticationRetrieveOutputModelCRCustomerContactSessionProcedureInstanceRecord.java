package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord
 */
public class BQAuthenticationRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord   {
  private Object customerContactOperatingSessionInstanceRecord = null;

  private String customerReference = null;

  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Reference to the parent contact record 
   * @return customerContactOperatingSessionInstanceRecord
  **/

  public Object getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(Object customerContactOperatingSessionInstanceRecord) {
    this.customerContactOperatingSessionInstanceRecord = customerContactOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer (can be extracted from Contact Record or provided by customer) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * Get contactDialogueRecord
   * @return contactDialogueRecord
  **/

  public BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord getContactDialogueRecord() {
    return contactDialogueRecord;
  }

  public void setContactDialogueRecord(BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord) {
    this.contactDialogueRecord = contactDialogueRecord;
  }


}

