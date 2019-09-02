package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIntelligenceRetrieveOutputModelIntelligenceInstanceReport
 */
public class BQIntelligenceRetrieveOutputModelIntelligenceInstanceReport   {
  private Object intelligenceInstanceReportRecord = null;

  private String intelligenceInstanceReportType = null;

  private String intelligenceInstanceReportParameters = null;

  private Object intelligenceInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return intelligenceInstanceReportRecord
  **/

  public Object getIntelligenceInstanceReportRecord() {
    return intelligenceInstanceReportRecord;
  }

  public void setIntelligenceInstanceReportRecord(Object intelligenceInstanceReportRecord) {
    this.intelligenceInstanceReportRecord = intelligenceInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return intelligenceInstanceReportType
  **/

  public String getIntelligenceInstanceReportType() {
    return intelligenceInstanceReportType;
  }

  public void setIntelligenceInstanceReportType(String intelligenceInstanceReportType) {
    this.intelligenceInstanceReportType = intelligenceInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return intelligenceInstanceReportParameters
  **/

  public String getIntelligenceInstanceReportParameters() {
    return intelligenceInstanceReportParameters;
  }

  public void setIntelligenceInstanceReportParameters(String intelligenceInstanceReportParameters) {
    this.intelligenceInstanceReportParameters = intelligenceInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return intelligenceInstanceReport
  **/

  public Object getIntelligenceInstanceReport() {
    return intelligenceInstanceReport;
  }

  public void setIntelligenceInstanceReport(Object intelligenceInstanceReport) {
    this.intelligenceInstanceReport = intelligenceInstanceReport;
  }


}

