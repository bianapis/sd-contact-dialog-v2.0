package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureInitiateOutputModel
 */
public class CRCustomerContactSessionProcedureInitiateOutputModel   {
  private String customerContactSessionProcedureInstanceReference = null;

  private String customerContactSessionProcedureInitiateActionReference = null;

  private Object customerContactSessionProcedureInitiateActionRecord = null;

  private String customerContactSessionProcedureInstanceStatus = null;

  private CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Contact Session Procedure instance 
   * @return customerContactSessionProcedureInstanceReference
  **/

  public String getCustomerContactSessionProcedureInstanceReference() {
    return customerContactSessionProcedureInstanceReference;
  }

  public void setCustomerContactSessionProcedureInstanceReference(String customerContactSessionProcedureInstanceReference) {
    this.customerContactSessionProcedureInstanceReference = customerContactSessionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerContactSessionProcedureInitiateActionReference
  **/

  public String getCustomerContactSessionProcedureInitiateActionReference() {
    return customerContactSessionProcedureInitiateActionReference;
  }

  public void setCustomerContactSessionProcedureInitiateActionReference(String customerContactSessionProcedureInitiateActionReference) {
    this.customerContactSessionProcedureInitiateActionReference = customerContactSessionProcedureInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerContactSessionProcedureInitiateActionRecord
  **/

  public Object getCustomerContactSessionProcedureInitiateActionRecord() {
    return customerContactSessionProcedureInitiateActionRecord;
  }

  public void setCustomerContactSessionProcedureInitiateActionRecord(Object customerContactSessionProcedureInitiateActionRecord) {
    this.customerContactSessionProcedureInitiateActionRecord = customerContactSessionProcedureInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Contact Session Procedure instance (e.g. initialised, pending, active) 
   * @return customerContactSessionProcedureInstanceStatus
  **/

  public String getCustomerContactSessionProcedureInstanceStatus() {
    return customerContactSessionProcedureInstanceStatus;
  }

  public void setCustomerContactSessionProcedureInstanceStatus(String customerContactSessionProcedureInstanceStatus) {
    this.customerContactSessionProcedureInstanceStatus = customerContactSessionProcedureInstanceStatus;
  }


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureInitiateOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


}

