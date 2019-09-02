package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelQueryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQQueryUpdateOutputModel
 */
public class BQQueryUpdateOutputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQQueryUpdateInputModelQueryInstanceRecord queryInstanceRecord = null;

  private String queryUpdateActionTaskReference = null;

  private Object queryUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * Get queryInstanceRecord
   * @return queryInstanceRecord
  **/

  public BQQueryUpdateInputModelQueryInstanceRecord getQueryInstanceRecord() {
    return queryInstanceRecord;
  }

  public void setQueryInstanceRecord(BQQueryUpdateInputModelQueryInstanceRecord queryInstanceRecord) {
    this.queryInstanceRecord = queryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return queryUpdateActionTaskReference
  **/

  public String getQueryUpdateActionTaskReference() {
    return queryUpdateActionTaskReference;
  }

  public void setQueryUpdateActionTaskReference(String queryUpdateActionTaskReference) {
    this.queryUpdateActionTaskReference = queryUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return queryUpdateActionTaskRecord
  **/

  public Object getQueryUpdateActionTaskRecord() {
    return queryUpdateActionTaskRecord;
  }

  public void setQueryUpdateActionTaskRecord(Object queryUpdateActionTaskRecord) {
    this.queryUpdateActionTaskRecord = queryUpdateActionTaskRecord;
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

