package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductServiceUpdateInputModelProductServiceInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQProductServiceUpdateOutputModel
 */
public class BQProductServiceUpdateOutputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQProductServiceUpdateInputModelProductServiceInstanceRecord productServiceInstanceRecord = null;

  private String productServiceUpdateActionTaskReference = null;

  private Object productServiceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return productServiceUpdateActionTaskReference
  **/

  public String getProductServiceUpdateActionTaskReference() {
    return productServiceUpdateActionTaskReference;
  }

  public void setProductServiceUpdateActionTaskReference(String productServiceUpdateActionTaskReference) {
    this.productServiceUpdateActionTaskReference = productServiceUpdateActionTaskReference;
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

