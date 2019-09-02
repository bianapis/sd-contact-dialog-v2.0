package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryRetrieveInputModelQueryInstanceAnalysis;
import org.bian.dto.BQQueryRetrieveInputModelQueryInstanceReport;

import javax.validation.Valid;
  
/**
 * BQQueryRetrieveInputModel
 */
public class BQQueryRetrieveInputModel   {
  private Object queryRetrieveActionTaskRecord = null;

  private String queryRetrieveActionRequest = null;

  private BQQueryRetrieveInputModelQueryInstanceReport queryInstanceReport = null;

  private BQQueryRetrieveInputModelQueryInstanceAnalysis queryInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return queryRetrieveActionRequest
  **/

  public String getQueryRetrieveActionRequest() {
    return queryRetrieveActionRequest;
  }

  public void setQueryRetrieveActionRequest(String queryRetrieveActionRequest) {
    this.queryRetrieveActionRequest = queryRetrieveActionRequest;
  }


  /**
   * Get queryInstanceReport
   * @return queryInstanceReport
  **/

  public BQQueryRetrieveInputModelQueryInstanceReport getQueryInstanceReport() {
    return queryInstanceReport;
  }

  public void setQueryInstanceReport(BQQueryRetrieveInputModelQueryInstanceReport queryInstanceReport) {
    this.queryInstanceReport = queryInstanceReport;
  }


  /**
   * Get queryInstanceAnalysis
   * @return queryInstanceAnalysis
  **/

  public BQQueryRetrieveInputModelQueryInstanceAnalysis getQueryInstanceAnalysis() {
    return queryInstanceAnalysis;
  }

  public void setQueryInstanceAnalysis(BQQueryRetrieveInputModelQueryInstanceAnalysis queryInstanceAnalysis) {
    this.queryInstanceAnalysis = queryInstanceAnalysis;
  }


}

