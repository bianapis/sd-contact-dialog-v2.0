package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiateInputModelOrderInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOrderUpdateInputModel
 */
public class BQOrderUpdateInputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private String orderInstanceReference = null;

  private BQOrderInitiateInputModelOrderInstanceRecord orderInstanceRecord = null;

  private Object orderUpdateActionTaskRecord = null;

  private String orderUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Order instance 
   * @return orderInstanceReference
  **/

  public String getOrderInstanceReference() {
    return orderInstanceReference;
  }

  public void setOrderInstanceReference(String orderInstanceReference) {
    this.orderInstanceReference = orderInstanceReference;
  }


  /**
   * Get orderInstanceRecord
   * @return orderInstanceRecord
  **/

  public BQOrderInitiateInputModelOrderInstanceRecord getOrderInstanceRecord() {
    return orderInstanceRecord;
  }

  public void setOrderInstanceRecord(BQOrderInitiateInputModelOrderInstanceRecord orderInstanceRecord) {
    this.orderInstanceRecord = orderInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return orderUpdateActionTaskRecord
  **/

  public Object getOrderUpdateActionTaskRecord() {
    return orderUpdateActionTaskRecord;
  }

  public void setOrderUpdateActionTaskRecord(Object orderUpdateActionTaskRecord) {
    this.orderUpdateActionTaskRecord = orderUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return orderUpdateActionRequest
  **/

  public String getOrderUpdateActionRequest() {
    return orderUpdateActionRequest;
  }

  public void setOrderUpdateActionRequest(String orderUpdateActionRequest) {
    this.orderUpdateActionRequest = orderUpdateActionRequest;
  }


}

