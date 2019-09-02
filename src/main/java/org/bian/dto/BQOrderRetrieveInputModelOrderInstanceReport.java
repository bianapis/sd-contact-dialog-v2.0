package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOrderRetrieveInputModelOrderInstanceReport
 */
public class BQOrderRetrieveInputModelOrderInstanceReport   {
  private String orderInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return orderInstanceReportReference
  **/

  public String getOrderInstanceReportReference() {
    return orderInstanceReportReference;
  }

  public void setOrderInstanceReportReference(String orderInstanceReportReference) {
    this.orderInstanceReportReference = orderInstanceReportReference;
  }


}

