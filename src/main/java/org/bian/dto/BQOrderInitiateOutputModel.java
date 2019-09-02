package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiateOutputModelOrderInstanceRecord;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOrderInitiateOutputModel
 */
public class BQOrderInitiateOutputModel   {
  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String orderInstanceReference = null;

  private String orderInitiateActionReference = null;

  private Object orderInitiateActionRecord = null;

  private String orderInstanceStatus = null;

  private BQOrderInitiateOutputModelOrderInstanceRecord orderInstanceRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return orderInitiateActionReference
  **/

  public String getOrderInitiateActionReference() {
    return orderInitiateActionReference;
  }

  public void setOrderInitiateActionReference(String orderInitiateActionReference) {
    this.orderInitiateActionReference = orderInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return orderInitiateActionRecord
  **/

  public Object getOrderInitiateActionRecord() {
    return orderInitiateActionRecord;
  }

  public void setOrderInitiateActionRecord(Object orderInitiateActionRecord) {
    this.orderInitiateActionRecord = orderInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Order instance (e.g. initialised, pending, active) 
   * @return orderInstanceStatus
  **/

  public String getOrderInstanceStatus() {
    return orderInstanceStatus;
  }

  public void setOrderInstanceStatus(String orderInstanceStatus) {
    this.orderInstanceStatus = orderInstanceStatus;
  }


  /**
   * Get orderInstanceRecord
   * @return orderInstanceRecord
  **/

  public BQOrderInitiateOutputModelOrderInstanceRecord getOrderInstanceRecord() {
    return orderInstanceRecord;
  }

  public void setOrderInstanceRecord(BQOrderInitiateOutputModelOrderInstanceRecord orderInstanceRecord) {
    this.orderInstanceRecord = orderInstanceRecord;
  }


}

