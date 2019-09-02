package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveInputModelAuthenticationInstanceReport
 */
public class BQAuthenticationRetrieveInputModelAuthenticationInstanceReport   {
  private String authenticationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return authenticationInstanceReportReference
  **/

  public String getAuthenticationInstanceReportReference() {
    return authenticationInstanceReportReference;
  }

  public void setAuthenticationInstanceReportReference(String authenticationInstanceReportReference) {
    this.authenticationInstanceReportReference = authenticationInstanceReportReference;
  }


}

