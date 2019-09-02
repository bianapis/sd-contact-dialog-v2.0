package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOfferRetrieveInputModelOfferInstanceAnalysis
 */
public class BQOfferRetrieveInputModelOfferInstanceAnalysis   {
  private String offerInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return offerInstanceAnalysisReference
  **/

  public String getOfferInstanceAnalysisReference() {
    return offerInstanceAnalysisReference;
  }

  public void setOfferInstanceAnalysisReference(String offerInstanceAnalysisReference) {
    this.offerInstanceAnalysisReference = offerInstanceAnalysisReference;
  }


}

