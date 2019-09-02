package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureInitiateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord
 */
public class CRCustomerContactSessionProcedureInitiateInputModelCRCustomerContactSessionProcedureInstanceRecordContactDialogueRecord   {
  private String contactDialogueType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The general type of customer exchange (e.g. verified customer, anonymous contact, topic - used to structure/script dialogue) 
   * @return contactDialogueType
  **/

  public String getContactDialogueType() {
    return contactDialogueType;
  }

  public void setContactDialogueType(String contactDialogueType) {
    this.contactDialogueType = contactDialogueType;
  }


}

