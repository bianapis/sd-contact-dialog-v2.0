package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSalesInitiateOutputModelSalesInstanceRecord;
import org.bian.dto.CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSalesInitiateOutputModel
 */
public class BQSalesInitiateOutputModel   {
  private CRCustomerContactSessionProcedureExecuteOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String salesInstanceReference = null;

  private String salesInitiateActionReference = null;

  private Object salesInitiateActionRecord = null;

  private String salesInstanceStatus = null;

  private BQSalesInitiateOutputModelSalesInstanceRecord salesInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Sales instance 
   * @return salesInstanceReference
  **/

  public String getSalesInstanceReference() {
    return salesInstanceReference;
  }

  public void setSalesInstanceReference(String salesInstanceReference) {
    this.salesInstanceReference = salesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return salesInitiateActionReference
  **/

  public String getSalesInitiateActionReference() {
    return salesInitiateActionReference;
  }

  public void setSalesInitiateActionReference(String salesInitiateActionReference) {
    this.salesInitiateActionReference = salesInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return salesInitiateActionRecord
  **/

  public Object getSalesInitiateActionRecord() {
    return salesInitiateActionRecord;
  }

  public void setSalesInitiateActionRecord(Object salesInitiateActionRecord) {
    this.salesInitiateActionRecord = salesInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Sales instance (e.g. initialised, pending, active) 
   * @return salesInstanceStatus
  **/

  public String getSalesInstanceStatus() {
    return salesInstanceStatus;
  }

  public void setSalesInstanceStatus(String salesInstanceStatus) {
    this.salesInstanceStatus = salesInstanceStatus;
  }


  /**
   * Get salesInstanceRecord
   * @return salesInstanceRecord
  **/

  public BQSalesInitiateOutputModelSalesInstanceRecord getSalesInstanceRecord() {
    return salesInstanceRecord;
  }

  public void setSalesInstanceRecord(BQSalesInitiateOutputModelSalesInstanceRecord salesInstanceRecord) {
    this.salesInstanceRecord = salesInstanceRecord;
  }


}

