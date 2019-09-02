package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOfferInitiateOutputModelOfferInstanceRecord
 */
public class BQOfferInitiateOutputModelOfferInstanceRecord   {
  private String offerTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the invoked offer procedure (e.g. abandoned, in process/pending, offer accepted) 
   * @return offerTaskResult
  **/

  public String getOfferTaskResult() {
    return offerTaskResult;
  }

  public void setOfferTaskResult(String offerTaskResult) {
    this.offerTaskResult = offerTaskResult;
  }


}

