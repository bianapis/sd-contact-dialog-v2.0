package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOrderInitiateInputModelOrderInstanceRecordOrderTaskRecord;

import javax.validation.Valid;
  
/**
 * BQOrderInitiateOutputModelOrderInstanceRecord
 */
public class BQOrderInitiateOutputModelOrderInstanceRecord   {
  private BQOrderInitiateInputModelOrderInstanceRecordOrderTaskRecord orderTaskRecord = null;


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

