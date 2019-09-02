package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelQueryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQueryUpdateInputModel
 */
public class BQQueryUpdateInputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private String queryInstanceReference = null;

  private BQQueryUpdateInputModelQueryInstanceRecord queryInstanceRecord = null;

  private Object queryUpdateActionTaskRecord = null;

  private String queryUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Query instance 
   * @return queryInstanceReference
  **/

  public String getQueryInstanceReference() {
    return queryInstanceReference;
  }

  public void setQueryInstanceReference(String queryInstanceReference) {
    this.queryInstanceReference = queryInstanceReference;
  }


  /**
   * Get queryInstanceRecord
   * @return queryInstanceRecord
  **/

  public BQQueryUpdateInputModelQueryInstanceRecord getQueryInstanceRecord() {
    return queryInstanceRecord;
  }

  public void setQueryInstanceRecord(BQQueryUpdateInputModelQueryInstanceRecord queryInstanceRecord) {
    this.queryInstanceRecord = queryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return queryUpdateActionTaskRecord
  **/

  public Object getQueryUpdateActionTaskRecord() {
    return queryUpdateActionTaskRecord;
  }

  public void setQueryUpdateActionTaskRecord(Object queryUpdateActionTaskRecord) {
    this.queryUpdateActionTaskRecord = queryUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return queryUpdateActionRequest
  **/

  public String getQueryUpdateActionRequest() {
    return queryUpdateActionRequest;
  }

  public void setQueryUpdateActionRequest(String queryUpdateActionRequest) {
    this.queryUpdateActionRequest = queryUpdateActionRequest;
  }


}

