package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiateInputModelOrderInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOrderUpdateOutputModel
 */
public class BQOrderUpdateOutputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQOrderInitiateInputModelOrderInstanceRecord orderInstanceRecord = null;

  private String orderUpdateActionTaskReference = null;

  private Object orderUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return orderUpdateActionTaskReference
  **/

  public String getOrderUpdateActionTaskReference() {
    return orderUpdateActionTaskReference;
  }

  public void setOrderUpdateActionTaskReference(String orderUpdateActionTaskReference) {
    this.orderUpdateActionTaskReference = orderUpdateActionTaskReference;
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

