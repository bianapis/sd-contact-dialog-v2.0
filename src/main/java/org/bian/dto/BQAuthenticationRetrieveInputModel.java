package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthenticationRetrieveInputModelAuthenticationInstanceAnalysis;
import org.bian.dto.BQAuthenticationRetrieveInputModelAuthenticationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveInputModel
 */
public class BQAuthenticationRetrieveInputModel   {
  private Object authenticationRetrieveActionTaskRecord = null;

  private String authenticationRetrieveActionRequest = null;

  private BQAuthenticationRetrieveInputModelAuthenticationInstanceReport authenticationInstanceReport = null;

  private BQAuthenticationRetrieveInputModelAuthenticationInstanceAnalysis authenticationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return authenticationRetrieveActionTaskRecord
  **/

  public Object getAuthenticationRetrieveActionTaskRecord() {
    return authenticationRetrieveActionTaskRecord;
  }

  public void setAuthenticationRetrieveActionTaskRecord(Object authenticationRetrieveActionTaskRecord) {
    this.authenticationRetrieveActionTaskRecord = authenticationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return authenticationRetrieveActionRequest
  **/

  public String getAuthenticationRetrieveActionRequest() {
    return authenticationRetrieveActionRequest;
  }

  public void setAuthenticationRetrieveActionRequest(String authenticationRetrieveActionRequest) {
    this.authenticationRetrieveActionRequest = authenticationRetrieveActionRequest;
  }


  /**
   * Get authenticationInstanceReport
   * @return authenticationInstanceReport
  **/

  public BQAuthenticationRetrieveInputModelAuthenticationInstanceReport getAuthenticationInstanceReport() {
    return authenticationInstanceReport;
  }

  public void setAuthenticationInstanceReport(BQAuthenticationRetrieveInputModelAuthenticationInstanceReport authenticationInstanceReport) {
    this.authenticationInstanceReport = authenticationInstanceReport;
  }


  /**
   * Get authenticationInstanceAnalysis
   * @return authenticationInstanceAnalysis
  **/

  public BQAuthenticationRetrieveInputModelAuthenticationInstanceAnalysis getAuthenticationInstanceAnalysis() {
    return authenticationInstanceAnalysis;
  }

  public void setAuthenticationInstanceAnalysis(BQAuthenticationRetrieveInputModelAuthenticationInstanceAnalysis authenticationInstanceAnalysis) {
    this.authenticationInstanceAnalysis = authenticationInstanceAnalysis;
  }


}

