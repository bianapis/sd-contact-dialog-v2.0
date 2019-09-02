package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderInitiateInputModelOrderInstanceRecordOrderTaskRecord
 */
public class BQOrderInitiateInputModelOrderInstanceRecordOrderTaskRecord   {
  private String orderTaskWorkProducts = null;

  private String orderTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Forms and actions agreed and registered during the order 
   * @return orderTaskWorkProducts
  **/

  public String getOrderTaskWorkProducts() {
    return orderTaskWorkProducts;
  }

  public void setOrderTaskWorkProducts(String orderTaskWorkProducts) {
    this.orderTaskWorkProducts = orderTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the order task (e.g. order completed, actions pending) 
   * @return orderTaskResult
  **/

  public String getOrderTaskResult() {
    return orderTaskResult;
  }

  public void setOrderTaskResult(String orderTaskResult) {
    this.orderTaskResult = orderTaskResult;
  }


}

