package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOfferUpdateInputModelOfferInstanceRecord;
import org.bian.dto.BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOfferUpdateOutputModel
 */
public class BQOfferUpdateOutputModel   {
  private BQQueryUpdateInputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private BQOfferUpdateInputModelOfferInstanceRecord offerInstanceRecord = null;

  private String offerUpdateActionTaskReference = null;

  private Object offerUpdateActionTaskRecord = null;

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
   * Get offerInstanceRecord
   * @return offerInstanceRecord
  **/

  public BQOfferUpdateInputModelOfferInstanceRecord getOfferInstanceRecord() {
    return offerInstanceRecord;
  }

  public void setOfferInstanceRecord(BQOfferUpdateInputModelOfferInstanceRecord offerInstanceRecord) {
    this.offerInstanceRecord = offerInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return offerUpdateActionTaskReference
  **/

  public String getOfferUpdateActionTaskReference() {
    return offerUpdateActionTaskReference;
  }

  public void setOfferUpdateActionTaskReference(String offerUpdateActionTaskReference) {
    this.offerUpdateActionTaskReference = offerUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return offerUpdateActionTaskRecord
  **/

  public Object getOfferUpdateActionTaskRecord() {
    return offerUpdateActionTaskRecord;
  }

  public void setOfferUpdateActionTaskRecord(Object offerUpdateActionTaskRecord) {
    this.offerUpdateActionTaskRecord = offerUpdateActionTaskRecord;
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

