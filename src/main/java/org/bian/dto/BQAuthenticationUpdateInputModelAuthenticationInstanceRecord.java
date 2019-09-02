package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationUpdateInputModelAuthenticationInstanceRecord
 */
public class BQAuthenticationUpdateInputModelAuthenticationInstanceRecord   {
  private String requiredAuthenticationLevel = null;

  private String authenticationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target level of authentication required 
   * @return requiredAuthenticationLevel
  **/

  public String getRequiredAuthenticationLevel() {
    return requiredAuthenticationLevel;
  }

  public void setRequiredAuthenticationLevel(String requiredAuthenticationLevel) {
    this.requiredAuthenticationLevel = requiredAuthenticationLevel;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the authentication request (the request is handles by Contact Handler and Party Authentication service domains 
   * @return authenticationTaskResult
  **/

  public String getAuthenticationTaskResult() {
    return authenticationTaskResult;
  }

  public void setAuthenticationTaskResult(String authenticationTaskResult) {
    this.authenticationTaskResult = authenticationTaskResult;
  }


}

