package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesInitiateOutputModelSalesInstanceRecord
 */
public class BQSalesInitiateOutputModelSalesInstanceRecord   {
  private String salesTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the sales attempt (can be an identified lead/opportunity registered for future action or may lead to the invocation of Customer Offer within this dialogue. It may also provide insights into the customer's preferences) 
   * @return salesTaskResult
  **/

  public String getSalesTaskResult() {
    return salesTaskResult;
  }

  public void setSalesTaskResult(String salesTaskResult) {
    this.salesTaskResult = salesTaskResult;
  }


}

