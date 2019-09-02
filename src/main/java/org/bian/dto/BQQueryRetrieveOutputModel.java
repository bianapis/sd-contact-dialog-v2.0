package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQQueryRetrieveOutputModelQueryInstanceAnalysis;
import org.bian.dto.BQQueryRetrieveOutputModelQueryInstanceReport;
import org.bian.dto.BQQueryUpdateInputModelQueryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQueryRetrieveOutputModel
 */
public class BQQueryRetrieveOutputModel   {
  private BQQueryRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQQueryUpdateInputModelQueryInstanceRecord queryInstanceRecord = null;

  private String queryRetrieveActionTaskReference = null;

  private Object queryRetrieveActionTaskRecord = null;

  private String queryRetrieveActionResponse = null;

  private BQQueryRetrieveOutputModelQueryInstanceReport queryInstanceReport = null;

  private BQQueryRetrieveOutputModelQueryInstanceAnalysis queryInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQQueryRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQQueryRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * Get queryInstanceRecord
   * @return queryInstanceRecord
  **/

  public BQQueryUpdateInputModelQueryInstanceRecord getQueryInstanceRecord() {
    return queryInstanceRecord;
  }

  public void setQueryInstanceRecord(BQQueryUpdateInputModelQueryInstanceRecord queryInstanceRecord) {
    this.queryInstanceRecord = queryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Query instance retrieve service call 
   * @return queryRetrieveActionTaskReference
  **/

  public String getQueryRetrieveActionTaskReference() {
    return queryRetrieveActionTaskReference;
  }

  public void setQueryRetrieveActionTaskReference(String queryRetrieveActionTaskReference) {
    this.queryRetrieveActionTaskReference = queryRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return queryRetrieveActionTaskRecord
  **/

  public Object getQueryRetrieveActionTaskRecord() {
    return queryRetrieveActionTaskRecord;
  }

  public void setQueryRetrieveActionTaskRecord(Object queryRetrieveActionTaskRecord) {
    this.queryRetrieveActionTaskRecord = queryRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return queryRetrieveActionResponse
  **/

  public String getQueryRetrieveActionResponse() {
    return queryRetrieveActionResponse;
  }

  public void setQueryRetrieveActionResponse(String queryRetrieveActionResponse) {
    this.queryRetrieveActionResponse = queryRetrieveActionResponse;
  }


  /**
   * Get queryInstanceReport
   * @return queryInstanceReport
  **/

  public BQQueryRetrieveOutputModelQueryInstanceReport getQueryInstanceReport() {
    return queryInstanceReport;
  }

  public void setQueryInstanceReport(BQQueryRetrieveOutputModelQueryInstanceReport queryInstanceReport) {
    this.queryInstanceReport = queryInstanceReport;
  }


  /**
   * Get queryInstanceAnalysis
   * @return queryInstanceAnalysis
  **/

  public BQQueryRetrieveOutputModelQueryInstanceAnalysis getQueryInstanceAnalysis() {
    return queryInstanceAnalysis;
  }

  public void setQueryInstanceAnalysis(BQQueryRetrieveOutputModelQueryInstanceAnalysis queryInstanceAnalysis) {
    this.queryInstanceAnalysis = queryInstanceAnalysis;
  }


}

