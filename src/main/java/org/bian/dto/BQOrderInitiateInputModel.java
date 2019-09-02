package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQOrderInitiateInputModelOrderInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOrderInitiateInputModel
 */
public class BQOrderInitiateInputModel   {
  private BQOrderInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private Object orderInitiateActionRecord = null;

  private BQOrderInitiateInputModelOrderInstanceRecord orderInstanceRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQOrderInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQOrderInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
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
   * Get orderInstanceRecord
   * @return orderInstanceRecord
  **/

  public BQOrderInitiateInputModelOrderInstanceRecord getOrderInstanceRecord() {
    return orderInstanceRecord;
  }

  public void setOrderInstanceRecord(BQOrderInitiateInputModelOrderInstanceRecord orderInstanceRecord) {
    this.orderInstanceRecord = orderInstanceRecord;
  }


}

