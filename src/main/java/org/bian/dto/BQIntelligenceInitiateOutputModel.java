package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIntelligenceInitiateOutputModel
 */
public class BQIntelligenceInitiateOutputModel   {
  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String intelligenceInstanceReference = null;

  private String intelligenceInitiateActionReference = null;

  private Object intelligenceInitiateActionRecord = null;

  private String intelligenceInstanceStatus = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Intelligence instance 
   * @return intelligenceInstanceReference
  **/

  public String getIntelligenceInstanceReference() {
    return intelligenceInstanceReference;
  }

  public void setIntelligenceInstanceReference(String intelligenceInstanceReference) {
    this.intelligenceInstanceReference = intelligenceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return intelligenceInitiateActionReference
  **/

  public String getIntelligenceInitiateActionReference() {
    return intelligenceInitiateActionReference;
  }

  public void setIntelligenceInitiateActionReference(String intelligenceInitiateActionReference) {
    this.intelligenceInitiateActionReference = intelligenceInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return intelligenceInitiateActionRecord
  **/

  public Object getIntelligenceInitiateActionRecord() {
    return intelligenceInitiateActionRecord;
  }

  public void setIntelligenceInitiateActionRecord(Object intelligenceInitiateActionRecord) {
    this.intelligenceInitiateActionRecord = intelligenceInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Intelligence instance (e.g. initialised, pending, active) 
   * @return intelligenceInstanceStatus
  **/

  public String getIntelligenceInstanceStatus() {
    return intelligenceInstanceStatus;
  }

  public void setIntelligenceInstanceStatus(String intelligenceInstanceStatus) {
    this.intelligenceInstanceStatus = intelligenceInstanceStatus;
  }


}

