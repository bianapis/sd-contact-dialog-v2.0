package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceRetrieveInputModelProductServiceInstanceAnalysis
 */
public class BQProductServiceRetrieveInputModelProductServiceInstanceAnalysis   {
  private String productServiceInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return productServiceInstanceAnalysisReference
  **/

  public String getProductServiceInstanceAnalysisReference() {
    return productServiceInstanceAnalysisReference;
  }

  public void setProductServiceInstanceAnalysisReference(String productServiceInstanceAnalysisReference) {
    this.productServiceInstanceAnalysisReference = productServiceInstanceAnalysisReference;
  }


}

