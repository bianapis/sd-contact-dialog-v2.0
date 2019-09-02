package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHistoryRetrieveInputModelHistoryInstanceReport
 */
public class BQHistoryRetrieveInputModelHistoryInstanceReport   {
  private String historyInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return historyInstanceReportReference
  **/

  public String getHistoryInstanceReportReference() {
    return historyInstanceReportReference;
  }

  public void setHistoryInstanceReportReference(String historyInstanceReportReference) {
    this.historyInstanceReportReference = historyInstanceReportReference;
  }


}

