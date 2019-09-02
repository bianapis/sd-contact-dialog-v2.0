package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQueryRetrieveInputModelQueryInstanceAnalysis
 */
public class BQQueryRetrieveInputModelQueryInstanceAnalysis   {
  private String queryInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return queryInstanceAnalysisReference
  **/

  public String getQueryInstanceAnalysisReference() {
    return queryInstanceAnalysisReference;
  }

  public void setQueryInstanceAnalysisReference(String queryInstanceAnalysisReference) {
    this.queryInstanceAnalysisReference = queryInstanceAnalysisReference;
  }


}

