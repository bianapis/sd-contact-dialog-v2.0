package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCaseRetrieveInputModelCaseInstanceAnalysis;
import org.bian.dto.BQCaseRetrieveInputModelCaseInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCaseRetrieveInputModel
 */
public class BQCaseRetrieveInputModel   {
  private Object caseRetrieveActionTaskRecord = null;

  private String caseRetrieveActionRequest = null;

  private BQCaseRetrieveInputModelCaseInstanceReport caseInstanceReport = null;

  private BQCaseRetrieveInputModelCaseInstanceAnalysis caseInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return caseRetrieveActionRequest
  **/

  public String getCaseRetrieveActionRequest() {
    return caseRetrieveActionRequest;
  }

  public void setCaseRetrieveActionRequest(String caseRetrieveActionRequest) {
    this.caseRetrieveActionRequest = caseRetrieveActionRequest;
  }


  /**
   * Get caseInstanceReport
   * @return caseInstanceReport
  **/

  public BQCaseRetrieveInputModelCaseInstanceReport getCaseInstanceReport() {
    return caseInstanceReport;
  }

  public void setCaseInstanceReport(BQCaseRetrieveInputModelCaseInstanceReport caseInstanceReport) {
    this.caseInstanceReport = caseInstanceReport;
  }


  /**
   * Get caseInstanceAnalysis
   * @return caseInstanceAnalysis
  **/

  public BQCaseRetrieveInputModelCaseInstanceAnalysis getCaseInstanceAnalysis() {
    return caseInstanceAnalysis;
  }

  public void setCaseInstanceAnalysis(BQCaseRetrieveInputModelCaseInstanceAnalysis caseInstanceAnalysis) {
    this.caseInstanceAnalysis = caseInstanceAnalysis;
  }


}

