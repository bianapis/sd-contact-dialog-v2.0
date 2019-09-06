package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProductServiceRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQProductServiceRetrieveOutputModelProductServiceInstanceAnalysis;
import org.bian.dto.BQProductServiceRetrieveOutputModelProductServiceInstanceRecord;
import org.bian.dto.BQProductServiceRetrieveOutputModelProductServiceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProductServiceRetrieveOutputModel
 */
public class BQProductServiceRetrieveOutputModel   {
  private BQProductServiceRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQProductServiceRetrieveOutputModelProductServiceInstanceRecord productServiceInstanceRecord = null;

  private String productServiceRetrieveActionTaskReference = null;

  private Object productServiceRetrieveActionTaskRecord = null;

  private String productServiceRetrieveActionResponse = null;

  private BQProductServiceRetrieveOutputModelProductServiceInstanceReport productServiceInstanceReport = null;

  private BQProductServiceRetrieveOutputModelProductServiceInstanceAnalysis productServiceInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQProductServiceRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(BQProductServiceRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * Get productServiceInstanceRecord
   * @return productServiceInstanceRecord
  **/

  public BQProductServiceRetrieveOutputModelProductServiceInstanceRecord getProductServiceInstanceRecord() {
    return productServiceInstanceRecord;
  }

  public void setProductServiceInstanceRecord(BQProductServiceRetrieveOutputModelProductServiceInstanceRecord productServiceInstanceRecord) {
    this.productServiceInstanceRecord = productServiceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ProductService instance retrieve service call 
   * @return productServiceRetrieveActionTaskReference
  **/

  public String getProductServiceRetrieveActionTaskReference() {
    return productServiceRetrieveActionTaskReference;
  }

  public void setProductServiceRetrieveActionTaskReference(String productServiceRetrieveActionTaskReference) {
    this.productServiceRetrieveActionTaskReference = productServiceRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return productServiceRetrieveActionTaskRecord
  **/

  public Object getProductServiceRetrieveActionTaskRecord() {
    return productServiceRetrieveActionTaskRecord;
  }

  public void setProductServiceRetrieveActionTaskRecord(Object productServiceRetrieveActionTaskRecord) {
    this.productServiceRetrieveActionTaskRecord = productServiceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return productServiceRetrieveActionResponse
  **/

  public String getProductServiceRetrieveActionResponse() {
    return productServiceRetrieveActionResponse;
  }

  public void setProductServiceRetrieveActionResponse(String productServiceRetrieveActionResponse) {
    this.productServiceRetrieveActionResponse = productServiceRetrieveActionResponse;
  }


  /**
   * Get productServiceInstanceReport
   * @return productServiceInstanceReport
  **/

  public BQProductServiceRetrieveOutputModelProductServiceInstanceReport getProductServiceInstanceReport() {
    return productServiceInstanceReport;
  }

  public void setProductServiceInstanceReport(BQProductServiceRetrieveOutputModelProductServiceInstanceReport productServiceInstanceReport) {
    this.productServiceInstanceReport = productServiceInstanceReport;
  }


  /**
   * Get productServiceInstanceAnalysis
   * @return productServiceInstanceAnalysis
  **/

  public BQProductServiceRetrieveOutputModelProductServiceInstanceAnalysis getProductServiceInstanceAnalysis() {
    return productServiceInstanceAnalysis;
  }

  public void setProductServiceInstanceAnalysis(BQProductServiceRetrieveOutputModelProductServiceInstanceAnalysis productServiceInstanceAnalysis) {
    this.productServiceInstanceAnalysis = productServiceInstanceAnalysis;
  }


}

