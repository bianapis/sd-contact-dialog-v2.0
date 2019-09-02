package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceAnalysis
 */
public class CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceAnalysis   {
  private String customerContactSessionProcedureInstanceAnalysisReference = null;

  private String customerContactSessionProcedureInstanceAnalysisReportType = null;

  private String customerContactSessionProcedureInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerContactSessionProcedureInstanceAnalysisReference
  **/

  public String getCustomerContactSessionProcedureInstanceAnalysisReference() {
    return customerContactSessionProcedureInstanceAnalysisReference;
  }

  public void setCustomerContactSessionProcedureInstanceAnalysisReference(String customerContactSessionProcedureInstanceAnalysisReference) {
    this.customerContactSessionProcedureInstanceAnalysisReference = customerContactSessionProcedureInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerContactSessionProcedureInstanceAnalysisReportType
  **/

  public String getCustomerContactSessionProcedureInstanceAnalysisReportType() {
    return customerContactSessionProcedureInstanceAnalysisReportType;
  }

  public void setCustomerContactSessionProcedureInstanceAnalysisReportType(String customerContactSessionProcedureInstanceAnalysisReportType) {
    this.customerContactSessionProcedureInstanceAnalysisReportType = customerContactSessionProcedureInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerContactSessionProcedureInstanceAnalysisParameters
  **/

  public String getCustomerContactSessionProcedureInstanceAnalysisParameters() {
    return customerContactSessionProcedureInstanceAnalysisParameters;
  }

  public void setCustomerContactSessionProcedureInstanceAnalysisParameters(String customerContactSessionProcedureInstanceAnalysisParameters) {
    this.customerContactSessionProcedureInstanceAnalysisParameters = customerContactSessionProcedureInstanceAnalysisParameters;
  }


}

