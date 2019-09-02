package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthenticationUpdateInputModelAuthenticationInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuthenticationUpdateInputModel
 */
public class BQAuthenticationUpdateInputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureInstanceReference = null;

  private String authenticationInstanceReference = null;

  private BQAuthenticationUpdateInputModelAuthenticationInstanceRecord authenticationInstanceRecord = null;

  private Object authenticationUpdateActionTaskRecord = null;

  private String authenticationUpdateActionRequest = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Contact Session Procedure instance 
   * @return customerContactSessionProcedureInstanceReference
  **/

  public String getCustomerContactSessionProcedureInstanceReference() {
    return customerContactSessionProcedureInstanceReference;
  }

  public void setCustomerContactSessionProcedureInstanceReference(String customerContactSessionProcedureInstanceReference) {
    this.customerContactSessionProcedureInstanceReference = customerContactSessionProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Authentication instance 
   * @return authenticationInstanceReference
  **/

  public String getAuthenticationInstanceReference() {
    return authenticationInstanceReference;
  }

  public void setAuthenticationInstanceReference(String authenticationInstanceReference) {
    this.authenticationInstanceReference = authenticationInstanceReference;
  }


  /**
   * Get authenticationInstanceRecord
   * @return authenticationInstanceRecord
  **/

  public BQAuthenticationUpdateInputModelAuthenticationInstanceRecord getAuthenticationInstanceRecord() {
    return authenticationInstanceRecord;
  }

  public void setAuthenticationInstanceRecord(BQAuthenticationUpdateInputModelAuthenticationInstanceRecord authenticationInstanceRecord) {
    this.authenticationInstanceRecord = authenticationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return authenticationUpdateActionTaskRecord
  **/

  public Object getAuthenticationUpdateActionTaskRecord() {
    return authenticationUpdateActionTaskRecord;
  }

  public void setAuthenticationUpdateActionTaskRecord(Object authenticationUpdateActionTaskRecord) {
    this.authenticationUpdateActionTaskRecord = authenticationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return authenticationUpdateActionRequest
  **/

  public String getAuthenticationUpdateActionRequest() {
    return authenticationUpdateActionRequest;
  }

  public void setAuthenticationUpdateActionRequest(String authenticationUpdateActionRequest) {
    this.authenticationUpdateActionRequest = authenticationUpdateActionRequest;
  }


}

