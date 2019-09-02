package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQueryRetrieveOutputModelQueryInstanceReport
 */
public class BQQueryRetrieveOutputModelQueryInstanceReport   {
  private Object queryInstanceReportRecord = null;

  private String queryInstanceReportType = null;

  private String queryInstanceReportParameters = null;

  private Object queryInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return queryInstanceReportRecord
  **/

  public Object getQueryInstanceReportRecord() {
    return queryInstanceReportRecord;
  }

  public void setQueryInstanceReportRecord(Object queryInstanceReportRecord) {
    this.queryInstanceReportRecord = queryInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return queryInstanceReportType
  **/

  public String getQueryInstanceReportType() {
    return queryInstanceReportType;
  }

  public void setQueryInstanceReportType(String queryInstanceReportType) {
    this.queryInstanceReportType = queryInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return queryInstanceReportParameters
  **/

  public String getQueryInstanceReportParameters() {
    return queryInstanceReportParameters;
  }

  public void setQueryInstanceReportParameters(String queryInstanceReportParameters) {
    this.queryInstanceReportParameters = queryInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return queryInstanceReport
  **/

  public Object getQueryInstanceReport() {
    return queryInstanceReport;
  }

  public void setQueryInstanceReport(Object queryInstanceReport) {
    this.queryInstanceReport = queryInstanceReport;
  }


}

