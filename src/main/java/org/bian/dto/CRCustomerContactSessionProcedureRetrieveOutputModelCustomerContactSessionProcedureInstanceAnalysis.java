package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceAnalysis
 */
public class CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceAnalysis   {
  private String customerContactSessionProcedureInstanceAnalysisData = null;

  private String customerContactSessionProcedureInstanceAnalysisReportType = null;

  private Object customerContactSessionProcedureInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerContactSessionProcedureInstanceAnalysisData
  **/

  public String getCustomerContactSessionProcedureInstanceAnalysisData() {
    return customerContactSessionProcedureInstanceAnalysisData;
  }

  public void setCustomerContactSessionProcedureInstanceAnalysisData(String customerContactSessionProcedureInstanceAnalysisData) {
    this.customerContactSessionProcedureInstanceAnalysisData = customerContactSessionProcedureInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerContactSessionProcedureInstanceAnalysisReport
  **/

  public Object getCustomerContactSessionProcedureInstanceAnalysisReport() {
    return customerContactSessionProcedureInstanceAnalysisReport;
  }

  public void setCustomerContactSessionProcedureInstanceAnalysisReport(Object customerContactSessionProcedureInstanceAnalysisReport) {
    this.customerContactSessionProcedureInstanceAnalysisReport = customerContactSessionProcedureInstanceAnalysisReport;
  }


}

