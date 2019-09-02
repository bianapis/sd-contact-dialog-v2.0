package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelAuthenticationInstanceReport
 */
public class BQAuthenticationRetrieveOutputModelAuthenticationInstanceReport   {
  private Object authenticationInstanceReportRecord = null;

  private String authenticationInstanceReportType = null;

  private String authenticationInstanceReportParameters = null;

  private Object authenticationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return authenticationInstanceReportRecord
  **/

  public Object getAuthenticationInstanceReportRecord() {
    return authenticationInstanceReportRecord;
  }

  public void setAuthenticationInstanceReportRecord(Object authenticationInstanceReportRecord) {
    this.authenticationInstanceReportRecord = authenticationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return authenticationInstanceReportType
  **/

  public String getAuthenticationInstanceReportType() {
    return authenticationInstanceReportType;
  }

  public void setAuthenticationInstanceReportType(String authenticationInstanceReportType) {
    this.authenticationInstanceReportType = authenticationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return authenticationInstanceReportParameters
  **/

  public String getAuthenticationInstanceReportParameters() {
    return authenticationInstanceReportParameters;
  }

  public void setAuthenticationInstanceReportParameters(String authenticationInstanceReportParameters) {
    this.authenticationInstanceReportParameters = authenticationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return authenticationInstanceReport
  **/

  public Object getAuthenticationInstanceReport() {
    return authenticationInstanceReport;
  }

  public void setAuthenticationInstanceReport(Object authenticationInstanceReport) {
    this.authenticationInstanceReport = authenticationInstanceReport;
  }


}

