package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiateInputModelOrderInstanceRecord;
import org.bian.dto.BQOrderRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQOrderRetrieveOutputModelOrderInstanceAnalysis;
import org.bian.dto.BQOrderRetrieveOutputModelOrderInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOrderRetrieveOutputModel
 */
public class BQOrderRetrieveOutputModel   {
  private BQOrderRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQOrderInitiateInputModelOrderInstanceRecord orderInstanceRecord = null;

  private String orderRetrieveActionTaskReference = null;

  private Object orderRetrieveActionTaskRecord = null;

  private String orderRetrieveActionResponse = null;

  private BQOrderRetrieveOutputModelOrderInstanceReport orderInstanceReport = null;

  private BQOrderRetrieveOutputModelOrderInstanceAnalysis orderInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQOrderRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(BQOrderRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * Get orderInstanceRecord
   * @return orderInstanceRecord
  **/

  public BQOrderInitiateInputModelOrderInstanceRecord getOrderInstanceRecord() {
    return orderInstanceRecord;
  }

  public void setOrderInstanceRecord(BQOrderInitiateInputModelOrderInstanceRecord orderInstanceRecord) {
    this.orderInstanceRecord = orderInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Order instance retrieve service call 
   * @return orderRetrieveActionTaskReference
  **/

  public String getOrderRetrieveActionTaskReference() {
    return orderRetrieveActionTaskReference;
  }

  public void setOrderRetrieveActionTaskReference(String orderRetrieveActionTaskReference) {
    this.orderRetrieveActionTaskReference = orderRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return orderRetrieveActionTaskRecord
  **/

  public Object getOrderRetrieveActionTaskRecord() {
    return orderRetrieveActionTaskRecord;
  }

  public void setOrderRetrieveActionTaskRecord(Object orderRetrieveActionTaskRecord) {
    this.orderRetrieveActionTaskRecord = orderRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return orderRetrieveActionResponse
  **/

  public String getOrderRetrieveActionResponse() {
    return orderRetrieveActionResponse;
  }

  public void setOrderRetrieveActionResponse(String orderRetrieveActionResponse) {
    this.orderRetrieveActionResponse = orderRetrieveActionResponse;
  }


  /**
   * Get orderInstanceReport
   * @return orderInstanceReport
  **/

  public BQOrderRetrieveOutputModelOrderInstanceReport getOrderInstanceReport() {
    return orderInstanceReport;
  }

  public void setOrderInstanceReport(BQOrderRetrieveOutputModelOrderInstanceReport orderInstanceReport) {
    this.orderInstanceReport = orderInstanceReport;
  }


  /**
   * Get orderInstanceAnalysis
   * @return orderInstanceAnalysis
  **/

  public BQOrderRetrieveOutputModelOrderInstanceAnalysis getOrderInstanceAnalysis() {
    return orderInstanceAnalysis;
  }

  public void setOrderInstanceAnalysis(BQOrderRetrieveOutputModelOrderInstanceAnalysis orderInstanceAnalysis) {
    this.orderInstanceAnalysis = orderInstanceAnalysis;
  }


}

