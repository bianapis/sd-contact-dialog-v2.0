package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord;

import javax.validation.Valid;
  
/**
 * BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord
 */
public class BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord   {
  private Object customerContactOperatingSessionInstanceRecord = null;

  private String customerReference = null;

  private String employeeReference = null;

  private String servicingPositionReference = null;

  private String sessionMechanism = null;

  private String sessionStartEndTime = null;

  private BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the servicing agent 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the servicing location/desk for assisted customer exchanges 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of channel device involved in the session exchange (e.g. web, phone, chat, video, VOIP, face to face at a branch - note there can be concurrent sessions within a single customer contact) 
   * @return sessionMechanism
  **/

  public String getSessionMechanism() {
    return sessionMechanism;
  }

  public void setSessionMechanism(String sessionMechanism) {
    this.sessionMechanism = sessionMechanism;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The start and duration of the dialogue 
   * @return sessionStartEndTime
  **/

  public String getSessionStartEndTime() {
    return sessionStartEndTime;
  }

  public void setSessionStartEndTime(String sessionStartEndTime) {
    this.sessionStartEndTime = sessionStartEndTime;
  }


  /**
   * Get contactDialogueRecord
   * @return contactDialogueRecord
  **/

  public BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord getContactDialogueRecord() {
    return contactDialogueRecord;
  }

  public void setContactDialogueRecord(BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord) {
    this.contactDialogueRecord = contactDialogueRecord;
  }


}

