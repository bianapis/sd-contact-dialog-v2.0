package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductServiceInitiateOutputModelProductServiceInstanceRecord;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductServiceInitiateOutputModel
 */
public class BQProductServiceInitiateOutputModel   {
  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String productServiceInstanceReference = null;

  private String productServiceInitiateActionReference = null;

  private Object productServiceInitiateActionRecord = null;

  private String productServiceInstanceStatus = null;

  private BQProductServiceInitiateOutputModelProductServiceInstanceRecord productServiceInstanceRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ProductService instance 
   * @return productServiceInstanceReference
  **/

  public String getProductServiceInstanceReference() {
    return productServiceInstanceReference;
  }

  public void setProductServiceInstanceReference(String productServiceInstanceReference) {
    this.productServiceInstanceReference = productServiceInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return productServiceInitiateActionReference
  **/

  public String getProductServiceInitiateActionReference() {
    return productServiceInitiateActionReference;
  }

  public void setProductServiceInitiateActionReference(String productServiceInitiateActionReference) {
    this.productServiceInitiateActionReference = productServiceInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return productServiceInitiateActionRecord
  **/

  public Object getProductServiceInitiateActionRecord() {
    return productServiceInitiateActionRecord;
  }

  public void setProductServiceInitiateActionRecord(Object productServiceInitiateActionRecord) {
    this.productServiceInitiateActionRecord = productServiceInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the ProductService instance (e.g. initialised, pending, active) 
   * @return productServiceInstanceStatus
  **/

  public String getProductServiceInstanceStatus() {
    return productServiceInstanceStatus;
  }

  public void setProductServiceInstanceStatus(String productServiceInstanceStatus) {
    this.productServiceInstanceStatus = productServiceInstanceStatus;
  }


  /**
   * Get productServiceInstanceRecord
   * @return productServiceInstanceRecord
  **/

  public BQProductServiceInitiateOutputModelProductServiceInstanceRecord getProductServiceInstanceRecord() {
    return productServiceInstanceRecord;
  }

  public void setProductServiceInstanceRecord(BQProductServiceInitiateOutputModelProductServiceInstanceRecord productServiceInstanceRecord) {
    this.productServiceInstanceRecord = productServiceInstanceRecord;
  }


}

