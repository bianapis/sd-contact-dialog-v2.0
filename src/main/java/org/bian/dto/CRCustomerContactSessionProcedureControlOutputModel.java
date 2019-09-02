package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureControlOutputModel
 */
public class CRCustomerContactSessionProcedureControlOutputModel   {
  private String customerContactSessionProcedureControlActionTaskReference = null;

  private Object customerContactSessionProcedureControlActionTaskRecord = null;

  private String customerContactSessionProcedureControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Session Procedure instance control processing service call 
   * @return customerContactSessionProcedureControlActionTaskReference
  **/

  public String getCustomerContactSessionProcedureControlActionTaskReference() {
    return customerContactSessionProcedureControlActionTaskReference;
  }

  public void setCustomerContactSessionProcedureControlActionTaskReference(String customerContactSessionProcedureControlActionTaskReference) {
    this.customerContactSessionProcedureControlActionTaskReference = customerContactSessionProcedureControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerContactSessionProcedureControlActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureControlActionTaskRecord() {
    return customerContactSessionProcedureControlActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureControlActionTaskRecord(Object customerContactSessionProcedureControlActionTaskRecord) {
    this.customerContactSessionProcedureControlActionTaskRecord = customerContactSessionProcedureControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerContactSessionProcedureControlActionResponse
  **/

  public String getCustomerContactSessionProcedureControlActionResponse() {
    return customerContactSessionProcedureControlActionResponse;
  }

  public void setCustomerContactSessionProcedureControlActionResponse(String customerContactSessionProcedureControlActionResponse) {
    this.customerContactSessionProcedureControlActionResponse = customerContactSessionProcedureControlActionResponse;
  }


}

