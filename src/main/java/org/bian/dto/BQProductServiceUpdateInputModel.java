package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductServiceUpdateInputModelProductServiceInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductServiceUpdateInputModel
 */
public class BQProductServiceUpdateInputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private String productServiceInstanceReference = null;

  private BQProductServiceUpdateInputModelProductServiceInstanceRecord productServiceInstanceRecord = null;

  private Object productServiceUpdateActionTaskRecord = null;

  private String productServiceUpdateActionRequest = null;


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
   * Get productServiceInstanceRecord
   * @return productServiceInstanceRecord
  **/

  public BQProductServiceUpdateInputModelProductServiceInstanceRecord getProductServiceInstanceRecord() {
    return productServiceInstanceRecord;
  }

  public void setProductServiceInstanceRecord(BQProductServiceUpdateInputModelProductServiceInstanceRecord productServiceInstanceRecord) {
    this.productServiceInstanceRecord = productServiceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return productServiceUpdateActionTaskRecord
  **/

  public Object getProductServiceUpdateActionTaskRecord() {
    return productServiceUpdateActionTaskRecord;
  }

  public void setProductServiceUpdateActionTaskRecord(Object productServiceUpdateActionTaskRecord) {
    this.productServiceUpdateActionTaskRecord = productServiceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return productServiceUpdateActionRequest
  **/

  public String getProductServiceUpdateActionRequest() {
    return productServiceUpdateActionRequest;
  }

  public void setProductServiceUpdateActionRequest(String productServiceUpdateActionRequest) {
    this.productServiceUpdateActionRequest = productServiceUpdateActionRequest;
  }


}

