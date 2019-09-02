package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceAnalysis;
import org.bian.dto.CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureRetrieveInputModel
 */
public class CRCustomerContactSessionProcedureRetrieveInputModel   {
  private Object customerContactSessionProcedureRetrieveActionTaskRecord = null;

  private String customerContactSessionProcedureRetrieveActionRequest = null;

  private CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceReportRecord customerContactSessionProcedureInstanceReportRecord = null;

  private CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceAnalysis customerContactSessionProcedureInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerContactSessionProcedureRetrieveActionRequest
  **/

  public String getCustomerContactSessionProcedureRetrieveActionRequest() {
    return customerContactSessionProcedureRetrieveActionRequest;
  }

  public void setCustomerContactSessionProcedureRetrieveActionRequest(String customerContactSessionProcedureRetrieveActionRequest) {
    this.customerContactSessionProcedureRetrieveActionRequest = customerContactSessionProcedureRetrieveActionRequest;
  }


  /**
   * Get customerContactSessionProcedureInstanceReportRecord
   * @return customerContactSessionProcedureInstanceReportRecord
  **/

  public CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceReportRecord getCustomerContactSessionProcedureInstanceReportRecord() {
    return customerContactSessionProcedureInstanceReportRecord;
  }

  public void setCustomerContactSessionProcedureInstanceReportRecord(CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceReportRecord customerContactSessionProcedureInstanceReportRecord) {
    this.customerContactSessionProcedureInstanceReportRecord = customerContactSessionProcedureInstanceReportRecord;
  }


  /**
   * Get customerContactSessionProcedureInstanceAnalysis
   * @return customerContactSessionProcedureInstanceAnalysis
  **/

  public CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceAnalysis getCustomerContactSessionProcedureInstanceAnalysis() {
    return customerContactSessionProcedureInstanceAnalysis;
  }

  public void setCustomerContactSessionProcedureInstanceAnalysis(CRCustomerContactSessionProcedureRetrieveInputModelCustomerContactSessionProcedureInstanceAnalysis customerContactSessionProcedureInstanceAnalysis) {
    this.customerContactSessionProcedureInstanceAnalysis = customerContactSessionProcedureInstanceAnalysis;
  }


}

