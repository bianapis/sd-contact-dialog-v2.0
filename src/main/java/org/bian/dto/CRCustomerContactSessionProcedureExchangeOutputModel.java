package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureExchangeOutputModel
 */
public class CRCustomerContactSessionProcedureExchangeOutputModel   {
  private String customerContactSessionProcedureExchangeActionTaskReference = null;

  private Object customerContactSessionProcedureExchangeActionTaskRecord = null;

  private String customerContactSessionProcedureExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Session Procedure instance exchange service call 
   * @return customerContactSessionProcedureExchangeActionTaskReference
  **/

  public String getCustomerContactSessionProcedureExchangeActionTaskReference() {
    return customerContactSessionProcedureExchangeActionTaskReference;
  }

  public void setCustomerContactSessionProcedureExchangeActionTaskReference(String customerContactSessionProcedureExchangeActionTaskReference) {
    this.customerContactSessionProcedureExchangeActionTaskReference = customerContactSessionProcedureExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerContactSessionProcedureExchangeActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureExchangeActionTaskRecord() {
    return customerContactSessionProcedureExchangeActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureExchangeActionTaskRecord(Object customerContactSessionProcedureExchangeActionTaskRecord) {
    this.customerContactSessionProcedureExchangeActionTaskRecord = customerContactSessionProcedureExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerContactSessionProcedureExchangeActionResponse
  **/

  public String getCustomerContactSessionProcedureExchangeActionResponse() {
    return customerContactSessionProcedureExchangeActionResponse;
  }

  public void setCustomerContactSessionProcedureExchangeActionResponse(String customerContactSessionProcedureExchangeActionResponse) {
    this.customerContactSessionProcedureExchangeActionResponse = customerContactSessionProcedureExchangeActionResponse;
  }


}

