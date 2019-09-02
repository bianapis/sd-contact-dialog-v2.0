package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductServiceInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQProductServiceInitiateInputModelProductServiceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductServiceInitiateInputModel
 */
public class BQProductServiceInitiateInputModel   {
  private BQProductServiceInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private Object productServiceInitiateActionRecord = null;

  private BQProductServiceInitiateInputModelProductServiceInstanceRecord productServiceInstanceRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQProductServiceInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQProductServiceInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
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
   * @return productServiceInitiateActionRecord
  **/

  public Object getProductServiceInitiateActionRecord() {
    return productServiceInitiateActionRecord;
  }

  public void setProductServiceInitiateActionRecord(Object productServiceInitiateActionRecord) {
    this.productServiceInitiateActionRecord = productServiceInitiateActionRecord;
  }


  /**
   * Get productServiceInstanceRecord
   * @return productServiceInstanceRecord
  **/

  public BQProductServiceInitiateInputModelProductServiceInstanceRecord getProductServiceInstanceRecord() {
    return productServiceInstanceRecord;
  }

  public void setProductServiceInstanceRecord(BQProductServiceInitiateInputModelProductServiceInstanceRecord productServiceInstanceRecord) {
    this.productServiceInstanceRecord = productServiceInstanceRecord;
  }


}

