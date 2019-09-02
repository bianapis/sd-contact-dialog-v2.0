package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHistoryRetrieveInputModelHistoryInstanceAnalysis;
import org.bian.dto.BQHistoryRetrieveInputModelHistoryInstanceReport;

import javax.validation.Valid;
  
/**
 * BQHistoryRetrieveInputModel
 */
public class BQHistoryRetrieveInputModel   {
  private Object historyRetrieveActionTaskRecord = null;

  private String historyRetrieveActionRequest = null;

  private BQHistoryRetrieveInputModelHistoryInstanceReport historyInstanceReport = null;

  private BQHistoryRetrieveInputModelHistoryInstanceAnalysis historyInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return historyRetrieveActionTaskRecord
  **/

  public Object getHistoryRetrieveActionTaskRecord() {
    return historyRetrieveActionTaskRecord;
  }

  public void setHistoryRetrieveActionTaskRecord(Object historyRetrieveActionTaskRecord) {
    this.historyRetrieveActionTaskRecord = historyRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return historyRetrieveActionRequest
  **/

  public String getHistoryRetrieveActionRequest() {
    return historyRetrieveActionRequest;
  }

  public void setHistoryRetrieveActionRequest(String historyRetrieveActionRequest) {
    this.historyRetrieveActionRequest = historyRetrieveActionRequest;
  }


  /**
   * Get historyInstanceReport
   * @return historyInstanceReport
  **/

  public BQHistoryRetrieveInputModelHistoryInstanceReport getHistoryInstanceReport() {
    return historyInstanceReport;
  }

  public void setHistoryInstanceReport(BQHistoryRetrieveInputModelHistoryInstanceReport historyInstanceReport) {
    this.historyInstanceReport = historyInstanceReport;
  }


  /**
   * Get historyInstanceAnalysis
   * @return historyInstanceAnalysis
  **/

  public BQHistoryRetrieveInputModelHistoryInstanceAnalysis getHistoryInstanceAnalysis() {
    return historyInstanceAnalysis;
  }

  public void setHistoryInstanceAnalysis(BQHistoryRetrieveInputModelHistoryInstanceAnalysis historyInstanceAnalysis) {
    this.historyInstanceAnalysis = historyInstanceAnalysis;
  }


}

