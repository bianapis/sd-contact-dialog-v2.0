package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAuthenticationRetrieveOutputModelAuthenticationInstanceAnalysis;
import org.bian.dto.BQAuthenticationRetrieveOutputModelAuthenticationInstanceReport;
import org.bian.dto.BQAuthenticationRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQAuthenticationUpdateInputModelAuthenticationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModel
 */
public class BQAuthenticationRetrieveOutputModel   {
  private BQAuthenticationRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQAuthenticationUpdateInputModelAuthenticationInstanceRecord authenticationInstanceRecord = null;

  private String authenticationRetrieveActionTaskReference = null;

  private Object authenticationRetrieveActionTaskRecord = null;

  private String authenticationRetrieveActionResponse = null;

  private BQAuthenticationRetrieveOutputModelAuthenticationInstanceReport authenticationInstanceReport = null;

  private BQAuthenticationRetrieveOutputModelAuthenticationInstanceAnalysis authenticationInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQAuthenticationRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(BQAuthenticationRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Authentication instance retrieve service call 
   * @return authenticationRetrieveActionTaskReference
  **/

  public String getAuthenticationRetrieveActionTaskReference() {
    return authenticationRetrieveActionTaskReference;
  }

  public void setAuthenticationRetrieveActionTaskReference(String authenticationRetrieveActionTaskReference) {
    this.authenticationRetrieveActionTaskReference = authenticationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return authenticationRetrieveActionResponse
  **/

  public String getAuthenticationRetrieveActionResponse() {
    return authenticationRetrieveActionResponse;
  }

  public void setAuthenticationRetrieveActionResponse(String authenticationRetrieveActionResponse) {
    this.authenticationRetrieveActionResponse = authenticationRetrieveActionResponse;
  }


  /**
   * Get authenticationInstanceReport
   * @return authenticationInstanceReport
  **/

  public BQAuthenticationRetrieveOutputModelAuthenticationInstanceReport getAuthenticationInstanceReport() {
    return authenticationInstanceReport;
  }

  public void setAuthenticationInstanceReport(BQAuthenticationRetrieveOutputModelAuthenticationInstanceReport authenticationInstanceReport) {
    this.authenticationInstanceReport = authenticationInstanceReport;
  }


  /**
   * Get authenticationInstanceAnalysis
   * @return authenticationInstanceAnalysis
  **/

  public BQAuthenticationRetrieveOutputModelAuthenticationInstanceAnalysis getAuthenticationInstanceAnalysis() {
    return authenticationInstanceAnalysis;
  }

  public void setAuthenticationInstanceAnalysis(BQAuthenticationRetrieveOutputModelAuthenticationInstanceAnalysis authenticationInstanceAnalysis) {
    this.authenticationInstanceAnalysis = authenticationInstanceAnalysis;
  }


}

