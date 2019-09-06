package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseUpdateInputModelCaseInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQCaseUpdateOutputModel
 */
public class BQCaseUpdateOutputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQCaseUpdateInputModelCaseInstanceRecord caseInstanceRecord = null;

  private String caseUpdateActionTaskReference = null;

  private Object caseUpdateActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return caseUpdateActionTaskReference
  **/

  public String getCaseUpdateActionTaskReference() {
    return caseUpdateActionTaskReference;
  }

  public void setCaseUpdateActionTaskReference(String caseUpdateActionTaskReference) {
    this.caseUpdateActionTaskReference = caseUpdateActionTaskReference;
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

