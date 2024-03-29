package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQueryRetrieveInputModelQueryInstanceReport
 */
public class BQQueryRetrieveInputModelQueryInstanceReport   {
  private String queryInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return queryInstanceReportReference
  **/

  public String getQueryInstanceReportReference() {
    return queryInstanceReportReference;
  }

  public void setQueryInstanceReportReference(String queryInstanceReportReference) {
    this.queryInstanceReportReference = queryInstanceReportReference;
  }


}

