package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseUpdateInputModelCaseInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaseUpdateInputModel
 */
public class BQCaseUpdateInputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private String caseInstanceReference = null;

  private BQCaseUpdateInputModelCaseInstanceRecord caseInstanceRecord = null;

  private Object caseUpdateActionTaskRecord = null;

  private String caseUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Case instance 
   * @return caseInstanceReference
  **/

  public String getCaseInstanceReference() {
    return caseInstanceReference;
  }

  public void setCaseInstanceReference(String caseInstanceReference) {
    this.caseInstanceReference = caseInstanceReference;
  }


  /**
   * Get caseInstanceRecord
   * @return caseInstanceRecord
  **/

  public BQCaseUpdateInputModelCaseInstanceRecord getCaseInstanceRecord() {
    return caseInstanceRecord;
  }

  public void setCaseInstanceRecord(BQCaseUpdateInputModelCaseInstanceRecord caseInstanceRecord) {
    this.caseInstanceRecord = caseInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return caseUpdateActionTaskRecord
  **/

  public Object getCaseUpdateActionTaskRecord() {
    return caseUpdateActionTaskRecord;
  }

  public void setCaseUpdateActionTaskRecord(Object caseUpdateActionTaskRecord) {
    this.caseUpdateActionTaskRecord = caseUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return caseUpdateActionRequest
  **/

  public String getCaseUpdateActionRequest() {
    return caseUpdateActionRequest;
  }

  public void setCaseUpdateActionRequest(String caseUpdateActionRequest) {
    this.caseUpdateActionRequest = caseUpdateActionRequest;
  }


}

