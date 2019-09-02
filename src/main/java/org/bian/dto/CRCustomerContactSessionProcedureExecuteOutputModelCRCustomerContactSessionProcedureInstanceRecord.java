package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord
 */
public class CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord   {
  private String sessionStartEndTime = null;

  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord = null;


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

  public CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord getContactDialogueRecord() {
    return contactDialogueRecord;
  }

  public void setContactDialogueRecord(CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord) {
    this.contactDialogueRecord = contactDialogueRecord;
  }


}

