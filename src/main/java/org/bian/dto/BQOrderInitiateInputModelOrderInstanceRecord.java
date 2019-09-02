package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiateInputModelOrderInstanceRecordOrderTaskRecord;

import javax.validation.Valid;
  
/**
 * BQOrderInitiateInputModelOrderInstanceRecord
 */
public class BQOrderInitiateInputModelOrderInstanceRecord   {
  private String orderType = null;

  private BQOrderInitiateInputModelOrderInstanceRecordOrderTaskRecord orderTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to a specific type of customer order (e.g. consolidated balance, change of address, simple ProductService guidance) 
   * @return orderType
  **/

  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  /**
   * Get orderTaskRecord
   * @return orderTaskRecord
  **/

  public BQOrderInitiateInputModelOrderInstanceRecordOrderTaskRecord getOrderTaskRecord() {
    return orderTaskRecord;
  }

  public void setOrderTaskRecord(BQOrderInitiateInputModelOrderInstanceRecordOrderTaskRecord orderTaskRecord) {
    this.orderTaskRecord = orderTaskRecord;
  }


}

