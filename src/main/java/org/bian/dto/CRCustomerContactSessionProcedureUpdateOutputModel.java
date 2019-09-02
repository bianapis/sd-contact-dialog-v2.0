package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactSessionProcedureUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactSessionProcedureUpdateOutputModel
 */
public class CRCustomerContactSessionProcedureUpdateOutputModel   {
  private CRCustomerContactSessionProcedureUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String customerContactSessionProcedureUpdateActionTaskReference = null;

  private Object customerContactSessionProcedureUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public CRCustomerContactSessionProcedureUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }

  public void setCRCustomerContactSessionProcedureInstanceRecord(CRCustomerContactSessionProcedureUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerContactSessionProcedureUpdateActionTaskReference
  **/

  public String getCustomerContactSessionProcedureUpdateActionTaskReference() {
    return customerContactSessionProcedureUpdateActionTaskReference;
  }

  public void setCustomerContactSessionProcedureUpdateActionTaskReference(String customerContactSessionProcedureUpdateActionTaskReference) {
    this.customerContactSessionProcedureUpdateActionTaskReference = customerContactSessionProcedureUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerContactSessionProcedureUpdateActionTaskRecord
  **/

  public Object getCustomerContactSessionProcedureUpdateActionTaskRecord() {
    return customerContactSessionProcedureUpdateActionTaskRecord;
  }

  public void setCustomerContactSessionProcedureUpdateActionTaskRecord(Object customerContactSessionProcedureUpdateActionTaskRecord) {
    this.customerContactSessionProcedureUpdateActionTaskRecord = customerContactSessionProcedureUpdateActionTaskRecord;
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

