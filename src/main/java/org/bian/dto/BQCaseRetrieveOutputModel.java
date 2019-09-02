package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQCaseRetrieveOutputModelCaseInstanceAnalysis;
import org.bian.dto.BQCaseRetrieveOutputModelCaseInstanceRecord;
import org.bian.dto.BQCaseRetrieveOutputModelCaseInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCaseRetrieveOutputModel
 */
public class BQCaseRetrieveOutputModel   {
  private BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQCaseRetrieveOutputModelCaseInstanceRecord caseInstanceRecord = null;

  private String caseRetrieveActionTaskReference = null;

  private Object caseRetrieveActionTaskRecord = null;

  private String caseRetrieveActionResponse = null;

  private BQCaseRetrieveOutputModelCaseInstanceReport caseInstanceReport = null;

  private BQCaseRetrieveOutputModelCaseInstanceAnalysis caseInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQCaseRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * Get caseInstanceRecord
   * @return caseInstanceRecord
  **/

  public BQCaseRetrieveOutputModelCaseInstanceRecord getCaseInstanceRecord() {
    return caseInstanceRecord;
  }

  public void setCaseInstanceRecord(BQCaseRetrieveOutputModelCaseInstanceRecord caseInstanceRecord) {
    this.caseInstanceRecord = caseInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Case instance retrieve service call 
   * @return caseRetrieveActionTaskReference
  **/

  public String getCaseRetrieveActionTaskReference() {
    return caseRetrieveActionTaskReference;
  }

  public void setCaseRetrieveActionTaskReference(String caseRetrieveActionTaskReference) {
    this.caseRetrieveActionTaskReference = caseRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return caseRetrieveActionTaskRecord
  **/

  public Object getCaseRetrieveActionTaskRecord() {
    return caseRetrieveActionTaskRecord;
  }

  public void setCaseRetrieveActionTaskRecord(Object caseRetrieveActionTaskRecord) {
    this.caseRetrieveActionTaskRecord = caseRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return caseRetrieveActionResponse
  **/

  public String getCaseRetrieveActionResponse() {
    return caseRetrieveActionResponse;
  }

  public void setCaseRetrieveActionResponse(String caseRetrieveActionResponse) {
    this.caseRetrieveActionResponse = caseRetrieveActionResponse;
  }


  /**
   * Get caseInstanceReport
   * @return caseInstanceReport
  **/

  public BQCaseRetrieveOutputModelCaseInstanceReport getCaseInstanceReport() {
    return caseInstanceReport;
  }

  public void setCaseInstanceReport(BQCaseRetrieveOutputModelCaseInstanceReport caseInstanceReport) {
    this.caseInstanceReport = caseInstanceReport;
  }


  /**
   * Get caseInstanceAnalysis
   * @return caseInstanceAnalysis
  **/

  public BQCaseRetrieveOutputModelCaseInstanceAnalysis getCaseInstanceAnalysis() {
    return caseInstanceAnalysis;
  }

  public void setCaseInstanceAnalysis(BQCaseRetrieveOutputModelCaseInstanceAnalysis caseInstanceAnalysis) {
    this.caseInstanceAnalysis = caseInstanceAnalysis;
  }


}

