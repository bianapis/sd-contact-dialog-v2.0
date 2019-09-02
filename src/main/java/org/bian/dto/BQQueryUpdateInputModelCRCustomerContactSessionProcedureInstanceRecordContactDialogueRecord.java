package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord
 */
public class BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord   {
  private String contactDialogueLog = null;

  private String contactDialogueResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The dialogue log, used for training and root cause analysis etc. (e.g. click-stream, video/audio recording) 
   * @return contactDialogueLog
  **/

  public String getContactDialogueLog() {
    return contactDialogueLog;
  }

  public void setContactDialogueLog(String contactDialogueLog) {
    this.contactDialogueLog = contactDialogueLog;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcome of the dialogue (e.g. customer satisfied, on-ward routing, hang-up) 
   * @return contactDialogueResult
  **/

  public String getContactDialogueResult() {
    return contactDialogueResult;
  }

  public void setContactDialogueResult(String contactDialogueResult) {
    this.contactDialogueResult = contactDialogueResult;
  }


}

