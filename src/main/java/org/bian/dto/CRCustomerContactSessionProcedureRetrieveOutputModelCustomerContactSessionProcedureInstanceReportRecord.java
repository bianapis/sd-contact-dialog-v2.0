package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceReportRecord
 */
public class CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceReportRecord   {
  private String customerContactSessionProcedureInstanceReportData = null;

  private String customerContactSessionProcedureInstanceReportType = null;

  private Object customerContactSessionProcedureInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerContactSessionProcedureInstanceReportData
  **/

  public String getCustomerContactSessionProcedureInstanceReportData() {
    return customerContactSessionProcedureInstanceReportData;
  }

  public void setCustomerContactSessionProcedureInstanceReportData(String customerContactSessionProcedureInstanceReportData) {
    this.customerContactSessionProcedureInstanceReportData = customerContactSessionProcedureInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerContactSessionProcedureInstanceReport
  **/

  public Object getCustomerContactSessionProcedureInstanceReport() {
    return customerContactSessionProcedureInstanceReport;
  }

  public void setCustomerContactSessionProcedureInstanceReport(Object customerContactSessionProcedureInstanceReport) {
    this.customerContactSessionProcedureInstanceReport = customerContactSessionProcedureInstanceReport;
  }


}

