package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQQueryInitiateInputModelQueryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQueryInitiateInputModel
 */
public class BQQueryInitiateInputModel   {
  private BQQueryInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private Object queryInitiateActionRecord = null;

  private BQQueryInitiateInputModelQueryInstanceRecord queryInstanceRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQQueryInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQQueryInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
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
   * @return queryInitiateActionRecord
  **/

  public Object getQueryInitiateActionRecord() {
    return queryInitiateActionRecord;
  }

  public void setQueryInitiateActionRecord(Object queryInitiateActionRecord) {
    this.queryInitiateActionRecord = queryInitiateActionRecord;
  }


  /**
   * Get queryInstanceRecord
   * @return queryInstanceRecord
  **/

  public BQQueryInitiateInputModelQueryInstanceRecord getQueryInstanceRecord() {
    return queryInstanceRecord;
  }

  public void setQueryInstanceRecord(BQQueryInitiateInputModelQueryInstanceRecord queryInstanceRecord) {
    this.queryInstanceRecord = queryInstanceRecord;
  }


}

