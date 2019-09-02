package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHistoryRetrieveOutputModelHistoryInstanceReport
 */
public class BQHistoryRetrieveOutputModelHistoryInstanceReport   {
  private Object historyInstanceReportRecord = null;

  private String historyInstanceReportType = null;

  private String historyInstanceReportParameters = null;

  private Object historyInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return historyInstanceReportRecord
  **/

  public Object getHistoryInstanceReportRecord() {
    return historyInstanceReportRecord;
  }

  public void setHistoryInstanceReportRecord(Object historyInstanceReportRecord) {
    this.historyInstanceReportRecord = historyInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return historyInstanceReportType
  **/

  public String getHistoryInstanceReportType() {
    return historyInstanceReportType;
  }

  public void setHistoryInstanceReportType(String historyInstanceReportType) {
    this.historyInstanceReportType = historyInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return historyInstanceReportParameters
  **/

  public String getHistoryInstanceReportParameters() {
    return historyInstanceReportParameters;
  }

  public void setHistoryInstanceReportParameters(String historyInstanceReportParameters) {
    this.historyInstanceReportParameters = historyInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return historyInstanceReport
  **/

  public Object getHistoryInstanceReport() {
    return historyInstanceReport;
  }

  public void setHistoryInstanceReport(Object historyInstanceReport) {
    this.historyInstanceReport = historyInstanceReport;
  }


}

