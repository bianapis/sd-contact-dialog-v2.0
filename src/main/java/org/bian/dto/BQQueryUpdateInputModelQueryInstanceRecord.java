package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQQueryUpdateInputModelQueryInstanceRecord
 */
public class BQQueryUpdateInputModelQueryInstanceRecord   {
  private String queryType = null;

  private String queryTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of question/answer addressed in the session - e.g. branch location/hours 
   * @return queryType
  **/

  public String getQueryType() {
    return queryType;
  }

  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the response and any customer reaction 
   * @return queryTaskResult
  **/

  public String getQueryTaskResult() {
    return queryTaskResult;
  }

  public void setQueryTaskResult(String queryTaskResult) {
    this.queryTaskResult = queryTaskResult;
  }


}

