package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthenticationUpdateInputModelAuthenticationInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuthenticationUpdateOutputModel
 */
public class BQAuthenticationUpdateOutputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQAuthenticationUpdateInputModelAuthenticationInstanceRecord authenticationInstanceRecord = null;

  private String authenticationUpdateActionTaskReference = null;

  private Object authenticationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return authenticationUpdateActionTaskReference
  **/

  public String getAuthenticationUpdateActionTaskReference() {
    return authenticationUpdateActionTaskReference;
  }

  public void setAuthenticationUpdateActionTaskReference(String authenticationUpdateActionTaskReference) {
    this.authenticationUpdateActionTaskReference = authenticationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

