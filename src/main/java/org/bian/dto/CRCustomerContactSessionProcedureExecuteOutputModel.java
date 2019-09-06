package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureExecuteOutputModel
 */
public class CRCustomerContactSessionProcedureExecuteOutputModel   {
  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureExecuteActionTaskReference = null;

  private Object customerContactSessionProcedureExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Session Procedure instance execute service call 
   * @return customerContactSessionProcedureExecuteActionTaskReference
  **/

  public String getCustomerContactSessionProcedureExecuteActionTaskReference() {
    return customerContactSessionProcedureExecuteActionTaskReference;
  }

  public void setCustomerContactSessionProcedureExecuteActionTaskReference(String customerContactSessionProcedureExecuteActionTaskReference) {
    this.customerContactSessionProcedureExecuteActionTaskReference = customerContactSessionProcedureExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerContactSessionProcedureExecuteActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureExecuteActionTaskRecord() {
    return customerContactSessionProcedureExecuteActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureExecuteActionTaskRecord(Object customerContactSessionProcedureExecuteActionTaskRecord) {
    this.customerContactSessionProcedureExecuteActionTaskRecord = customerContactSessionProcedureExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

