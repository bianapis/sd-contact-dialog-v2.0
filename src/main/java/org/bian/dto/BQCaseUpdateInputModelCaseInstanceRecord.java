package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCaseUpdateInputModelCaseInstanceRecord
 */
public class BQCaseUpdateInputModelCaseInstanceRecord   {
  private String productInstanceReference = null;

  private String customerCaseType = null;

  private String caseTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a specific product instance provided by the customer 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of case being processed including any supporting narrative (e.g. disputed charges, suspected account fraud, stolen device, change of status) 
   * @return customerCaseType
  **/

  public String getCustomerCaseType() {
    return customerCaseType;
  }

  public void setCustomerCaseType(String customerCaseType) {
    this.customerCaseType = customerCaseType;
  }


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

