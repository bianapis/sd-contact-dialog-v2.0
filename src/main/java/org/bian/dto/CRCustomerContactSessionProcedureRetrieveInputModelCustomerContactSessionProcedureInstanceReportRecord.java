package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceReportRecord
 */
public class CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceReportRecord   {
  private String customerContactSessionProcedureInstanceReportReference = null;

  private String customerContactSessionProcedureInstanceReportType = null;

  private String customerContactSessionProcedureInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerContactSessionProcedureInstanceReportReference
  **/

  public String getCustomerContactSessionProcedureInstanceReportReference() {
    return customerContactSessionProcedureInstanceReportReference;
  }

  public void setCustomerContactSessionProcedureInstanceReportReference(String customerContactSessionProcedureInstanceReportReference) {
    this.customerContactSessionProcedureInstanceReportReference = customerContactSessionProcedureInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerContactSessionProcedureInstanceReportType
  **/

  public String getCustomerContactSessionProcedureInstanceReportType() {
    return customerContactSessionProcedureInstanceReportType;
  }

  public void setCustomerContactSessionProcedureInstanceReportType(String customerContactSessionProcedureInstanceReportType) {
    this.customerContactSessionProcedureInstanceReportType = customerContactSessionProcedureInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerContactSessionProcedureInstanceReportParameters
  **/

  public String getCustomerContactSessionProcedureInstanceReportParameters() {
    return customerContactSessionProcedureInstanceReportParameters;
  }

  public void setCustomerContactSessionProcedureInstanceReportParameters(String customerContactSessionProcedureInstanceReportParameters) {
    this.customerContactSessionProcedureInstanceReportParameters = customerContactSessionProcedureInstanceReportParameters;
  }


}

