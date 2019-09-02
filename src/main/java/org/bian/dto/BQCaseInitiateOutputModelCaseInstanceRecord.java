package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseInitiateOutputModelCaseInstanceRecord
 */
public class BQCaseInitiateOutputModelCaseInstanceRecord   {
  private String caseTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the invocation (e.g. case active) 
   * @return caseTaskResult
  **/

  public String getCaseTaskResult() {
    return caseTaskResult;
  }

  public void setCaseTaskResult(String caseTaskResult) {
    this.caseTaskResult = caseTaskResult;
  }


}

