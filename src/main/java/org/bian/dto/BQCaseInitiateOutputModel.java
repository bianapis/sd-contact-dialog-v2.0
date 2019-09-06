package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseInitiateOutputModelCaseInstanceRecord;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaseInitiateOutputModel
 */
public class BQCaseInitiateOutputModel   {
  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String caseInstanceReference = null;

  private String caseInitiateActionReference = null;

  private Object caseInitiateActionRecord = null;

  private String caseInstanceStatus = null;

  private BQCaseInitiateOutputModelCaseInstanceRecord caseInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return caseInitiateActionReference
  **/

  public String getCaseInitiateActionReference() {
    return caseInitiateActionReference;
  }

  public void setCaseInitiateActionReference(String caseInitiateActionReference) {
    this.caseInitiateActionReference = caseInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Case instance (e.g. initialised, pending, active) 
   * @return caseInstanceStatus
  **/

  public String getCaseInstanceStatus() {
    return caseInstanceStatus;
  }

  public void setCaseInstanceStatus(String caseInstanceStatus) {
    this.caseInstanceStatus = caseInstanceStatus;
  }


  /**
   * Get caseInstanceRecord
   * @return caseInstanceRecord
  **/

  public BQCaseInitiateOutputModelCaseInstanceRecord getCaseInstanceRecord() {
    return caseInstanceRecord;
  }

  public void setCaseInstanceRecord(BQCaseInitiateOutputModelCaseInstanceRecord caseInstanceRecord) {
    this.caseInstanceRecord = caseInstanceRecord;
  }


}

