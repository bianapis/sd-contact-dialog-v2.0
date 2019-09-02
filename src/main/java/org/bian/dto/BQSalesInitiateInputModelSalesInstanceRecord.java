package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSalesInitiateInputModelSalesInstanceRecord
 */
public class BQSalesInitiateInputModelSalesInstanceRecord   {
  private String productServiceType = null;

  private String productServiceProperties = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the type of product of interest (e.g. lending or deposit products) 
   * @return productServiceType
  **/

  public String getProductServiceType() {
    return productServiceType;
  }

  public void setProductServiceType(String productServiceType) {
    this.productServiceType = productServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the selected product's features and options desired 
   * @return productServiceProperties
  **/

  public String getProductServiceProperties() {
    return productServiceProperties;
  }

  public void setProductServiceProperties(String productServiceProperties) {
    this.productServiceProperties = productServiceProperties;
  }


}

