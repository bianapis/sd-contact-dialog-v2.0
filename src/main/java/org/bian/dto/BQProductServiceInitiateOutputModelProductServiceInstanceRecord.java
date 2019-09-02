package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProductServiceInitiateOutputModelProductServiceInstanceRecord
 */
public class BQProductServiceInitiateOutputModelProductServiceInstanceRecord   {
  private String productServiceTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the invoked product or service fulfillment service domain (e.g. balance provided, payment initiated, reference details updated) 
   * @return productServiceTaskResult
  **/

  public String getProductServiceTaskResult() {
    return productServiceTaskResult;
  }

  public void setProductServiceTaskResult(String productServiceTaskResult) {
    this.productServiceTaskResult = productServiceTaskResult;
  }


}

