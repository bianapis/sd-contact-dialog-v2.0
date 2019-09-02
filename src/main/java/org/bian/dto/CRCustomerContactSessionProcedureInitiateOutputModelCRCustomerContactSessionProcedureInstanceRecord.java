package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecord
 */
public class CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecord   {
  private String sessionStartEndTime = null;

  private CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord = null;


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

  public CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord getContactDialogueRecord() {
    return contactDialogueRecord;
  }

  public void setContactDialogueRecord(CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord) {
    this.contactDialogueRecord = contactDialogueRecord;
  }


}

