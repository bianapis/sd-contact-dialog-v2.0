package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIntelligenceUpdateOutputModel
 */
public class BQIntelligenceUpdateOutputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String intelligenceUpdateActionTaskReference = null;

  private Object intelligenceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return intelligenceUpdateActionTaskReference
  **/

  public String getIntelligenceUpdateActionTaskReference() {
    return intelligenceUpdateActionTaskReference;
  }

  public void setIntelligenceUpdateActionTaskReference(String intelligenceUpdateActionTaskReference) {
    this.intelligenceUpdateActionTaskReference = intelligenceUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return intelligenceUpdateActionTaskRecord
  **/

  public Object getIntelligenceUpdateActionTaskRecord() {
    return intelligenceUpdateActionTaskRecord;
  }

  public void setIntelligenceUpdateActionTaskRecord(Object intelligenceUpdateActionTaskRecord) {
    this.intelligenceUpdateActionTaskRecord = intelligenceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

