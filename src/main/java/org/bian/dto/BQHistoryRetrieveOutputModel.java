package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHistoryRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQHistoryRetrieveOutputModelHistoryInstanceAnalysis;
import org.bian.dto.BQHistoryRetrieveOutputModelHistoryInstanceReport;
import org.bian.dto.BQHistoryUpdateInputModelHistoryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQHistoryRetrieveOutputModel
 */
public class BQHistoryRetrieveOutputModel   {
  private BQHistoryRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQHistoryUpdateInputModelHistoryInstanceRecord historyInstanceRecord = null;

  private String historyRetrieveActionTaskReference = null;

  private Object historyRetrieveActionTaskRecord = null;

  private String historyRetrieveActionResponse = null;

  private BQHistoryRetrieveOutputModelHistoryInstanceReport historyInstanceReport = null;

  private BQHistoryRetrieveOutputModelHistoryInstanceAnalysis historyInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQHistoryRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQHistoryRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * Get historyInstanceRecord
   * @return historyInstanceRecord
  **/

  public BQHistoryUpdateInputModelHistoryInstanceRecord getHistoryInstanceRecord() {
    return historyInstanceRecord;
  }

  public void setHistoryInstanceRecord(BQHistoryUpdateInputModelHistoryInstanceRecord historyInstanceRecord) {
    this.historyInstanceRecord = historyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a History instance retrieve service call 
   * @return historyRetrieveActionTaskReference
  **/

  public String getHistoryRetrieveActionTaskReference() {
    return historyRetrieveActionTaskReference;
  }

  public void setHistoryRetrieveActionTaskReference(String historyRetrieveActionTaskReference) {
    this.historyRetrieveActionTaskReference = historyRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return historyRetrieveActionResponse
  **/

  public String getHistoryRetrieveActionResponse() {
    return historyRetrieveActionResponse;
  }

  public void setHistoryRetrieveActionResponse(String historyRetrieveActionResponse) {
    this.historyRetrieveActionResponse = historyRetrieveActionResponse;
  }


  /**
   * Get historyInstanceReport
   * @return historyInstanceReport
  **/

  public BQHistoryRetrieveOutputModelHistoryInstanceReport getHistoryInstanceReport() {
    return historyInstanceReport;
  }

  public void setHistoryInstanceReport(BQHistoryRetrieveOutputModelHistoryInstanceReport historyInstanceReport) {
    this.historyInstanceReport = historyInstanceReport;
  }


  /**
   * Get historyInstanceAnalysis
   * @return historyInstanceAnalysis
  **/

  public BQHistoryRetrieveOutputModelHistoryInstanceAnalysis getHistoryInstanceAnalysis() {
    return historyInstanceAnalysis;
  }

  public void setHistoryInstanceAnalysis(BQHistoryRetrieveOutputModelHistoryInstanceAnalysis historyInstanceAnalysis) {
    this.historyInstanceAnalysis = historyInstanceAnalysis;
  }


}

