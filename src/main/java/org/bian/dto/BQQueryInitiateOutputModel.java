package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryInitiateOutputModelQueryInstanceRecord;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQueryInitiateOutputModel
 */
public class BQQueryInitiateOutputModel   {
  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String queryInstanceReference = null;

  private String queryInitiateActionReference = null;

  private Object queryInitiateActionRecord = null;

  private String queryInstanceStatus = null;

  private BQQueryInitiateOutputModelQueryInstanceRecord queryInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return queryInitiateActionReference
  **/

  public String getQueryInitiateActionReference() {
    return queryInitiateActionReference;
  }

  public void setQueryInitiateActionReference(String queryInitiateActionReference) {
    this.queryInitiateActionReference = queryInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Query instance (e.g. initialised, pending, active) 
   * @return queryInstanceStatus
  **/

  public String getQueryInstanceStatus() {
    return queryInstanceStatus;
  }

  public void setQueryInstanceStatus(String queryInstanceStatus) {
    this.queryInstanceStatus = queryInstanceStatus;
  }


  /**
   * Get queryInstanceRecord
   * @return queryInstanceRecord
  **/

  public BQQueryInitiateOutputModelQueryInstanceRecord getQueryInstanceRecord() {
    return queryInstanceRecord;
  }

  public void setQueryInstanceRecord(BQQueryInitiateOutputModelQueryInstanceRecord queryInstanceRecord) {
    this.queryInstanceRecord = queryInstanceRecord;
  }


}

