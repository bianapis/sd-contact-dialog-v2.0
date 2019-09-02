package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseRetrieveInputModelCaseInstanceAnalysis
 */
public class BQCaseRetrieveInputModelCaseInstanceAnalysis   {
  private String caseInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return caseInstanceAnalysisReference
  **/

  public String getCaseInstanceAnalysisReference() {
    return caseInstanceAnalysisReference;
  }

  public void setCaseInstanceAnalysisReference(String caseInstanceAnalysisReference) {
    this.caseInstanceAnalysisReference = caseInstanceAnalysisReference;
  }


}

