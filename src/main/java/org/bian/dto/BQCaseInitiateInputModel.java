package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQCaseInitiateInputModelCaseInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaseInitiateInputModel
 */
public class BQCaseInitiateInputModel   {
  private BQCaseInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private Object caseInitiateActionRecord = null;

  private BQCaseInitiateInputModelCaseInstanceRecord caseInstanceRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQCaseInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQCaseInitiateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
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
   * @return caseInitiateActionRecord
  **/

  public Object getCaseInitiateActionRecord() {
    return caseInitiateActionRecord;
  }

  public void setCaseInitiateActionRecord(Object caseInitiateActionRecord) {
    this.caseInitiateActionRecord = caseInitiateActionRecord;
  }


  /**
   * Get caseInstanceRecord
   * @return caseInstanceRecord
  **/

  public BQCaseInitiateInputModelCaseInstanceRecord getCaseInstanceRecord() {
    return caseInstanceRecord;
  }

  public void setCaseInstanceRecord(BQCaseInitiateInputModelCaseInstanceRecord caseInstanceRecord) {
    this.caseInstanceRecord = caseInstanceRecord;
  }


}

