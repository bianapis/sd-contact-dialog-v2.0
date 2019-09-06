package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureRetrieveOutputModel
 */
public class CRCustomerContactSessionProcedureRetrieveOutputModel   {
  private CRCustomerContactSessionProcedureRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureRetrieveActionTaskReference = null;

  private Object customerContactSessionProcedureRetrieveActionTaskRecord = null;

  private String customerContactSessionProcedureRetrieveActionResponse = null;

  private CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceReportRecord customerContactSessionProcedureInstanceReportRecord = null;

  private CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceAnalysis customerContactSessionProcedureInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Session Procedure instance retrieve service call 
   * @return customerContactSessionProcedureRetrieveActionTaskReference
  **/

  public String getCustomerContactSessionProcedureRetrieveActionTaskReference() {
    return customerContactSessionProcedureRetrieveActionTaskReference;
  }

  public void setCustomerContactSessionProcedureRetrieveActionTaskReference(String customerContactSessionProcedureRetrieveActionTaskReference) {
    this.customerContactSessionProcedureRetrieveActionTaskReference = customerContactSessionProcedureRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerContactSessionProcedureRetrieveActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureRetrieveActionTaskRecord() {
    return customerContactSessionProcedureRetrieveActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureRetrieveActionTaskRecord(Object customerContactSessionProcedureRetrieveActionTaskRecord) {
    this.customerContactSessionProcedureRetrieveActionTaskRecord = customerContactSessionProcedureRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerContactSessionProcedureRetrieveActionResponse
  **/

  public String getCustomerContactSessionProcedureRetrieveActionResponse() {
    return customerContactSessionProcedureRetrieveActionResponse;
  }

  public void setCustomerContactSessionProcedureRetrieveActionResponse(String customerContactSessionProcedureRetrieveActionResponse) {
    this.customerContactSessionProcedureRetrieveActionResponse = customerContactSessionProcedureRetrieveActionResponse;
  }


  /**
   * Get customerContactSessionProcedureInstanceReportRecord
   * @return customerContactSessionProcedureInstanceReportRecord
  **/

  public CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceReportRecord getCustomerContactSessionProcedureInstanceReportRecord() {
    return customerContactSessionProcedureInstanceReportRecord;
  }

  public void setCustomerContactSessionProcedureInstanceReportRecord(CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceReportRecord customerContactSessionProcedureInstanceReportRecord) {
    this.customerContactSessionProcedureInstanceReportRecord = customerContactSessionProcedureInstanceReportRecord;
  }


  /**
   * Get customerContactSessionProcedureInstanceAnalysis
   * @return customerContactSessionProcedureInstanceAnalysis
  **/

  public CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceAnalysis getCustomerContactSessionProcedureInstanceAnalysis() {
    return customerContactSessionProcedureInstanceAnalysis;
  }

  public void setCustomerContactSessionProcedureInstanceAnalysis(CRCustomerContactSessionProcedureRetrieveOutputModelCustomerContactSessionProcedureInstanceAnalysis customerContactSessionProcedureInstanceAnalysis) {
    this.customerContactSessionProcedureInstanceAnalysis = customerContactSessionProcedureInstanceAnalysis;
  }


}

