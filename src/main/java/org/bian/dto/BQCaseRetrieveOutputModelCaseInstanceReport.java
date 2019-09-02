package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseRetrieveOutputModelCaseInstanceReport
 */
public class BQCaseRetrieveOutputModelCaseInstanceReport   {
  private Object caseInstanceReportRecord = null;

  private String caseInstanceReportType = null;

  private String caseInstanceReportParameters = null;

  private Object caseInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return caseInstanceReportRecord
  **/

  public Object getCaseInstanceReportRecord() {
    return caseInstanceReportRecord;
  }

  public void setCaseInstanceReportRecord(Object caseInstanceReportRecord) {
    this.caseInstanceReportRecord = caseInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return caseInstanceReportType
  **/

  public String getCaseInstanceReportType() {
    return caseInstanceReportType;
  }

  public void setCaseInstanceReportType(String caseInstanceReportType) {
    this.caseInstanceReportType = caseInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return caseInstanceReportParameters
  **/

  public String getCaseInstanceReportParameters() {
    return caseInstanceReportParameters;
  }

  public void setCaseInstanceReportParameters(String caseInstanceReportParameters) {
    this.caseInstanceReportParameters = caseInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return caseInstanceReport
  **/

  public Object getCaseInstanceReport() {
    return caseInstanceReport;
  }

  public void setCaseInstanceReport(Object caseInstanceReport) {
    this.caseInstanceReport = caseInstanceReport;
  }


}

