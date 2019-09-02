package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord;

import javax.validation.Valid;
  
/**
 * BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord
 */
public class BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord contactDialogueRecord = null;


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

