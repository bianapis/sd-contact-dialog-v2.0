package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIntelligenceUpdateInputModel
 */
public class BQIntelligenceUpdateInputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private String intelligenceInstanceReference = null;

  private Object intelligenceUpdateActionTaskRecord = null;

  private String intelligenceUpdateActionRequest = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Contact Session Procedure instance 
   * @return customerContactSessionProcedureInstanceReference
  **/

  public String getCustomerContactSessionProcedureInstanceReference() {
    return customerContactSessionProcedureInstanceReference;
  }

  public void setCustomerContactSessionProcedureInstanceReference(String customerContactSessionProcedureInstanceReference) {
    this.customerContactSessionProcedureInstanceReference = customerContactSessionProcedureInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return intelligenceUpdateActionRequest
  **/

  public String getIntelligenceUpdateActionRequest() {
    return intelligenceUpdateActionRequest;
  }

  public void setIntelligenceUpdateActionRequest(String intelligenceUpdateActionRequest) {
    this.intelligenceUpdateActionRequest = intelligenceUpdateActionRequest;
  }


}

