package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIntelligenceRetrieveInputModelIntelligenceInstanceAnalysis;
import org.bian.dto.BQIntelligenceRetrieveInputModelIntelligenceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIntelligenceRetrieveInputModel
 */
public class BQIntelligenceRetrieveInputModel   {
  private Object intelligenceRetrieveActionTaskRecord = null;

  private String intelligenceRetrieveActionRequest = null;

  private BQIntelligenceRetrieveInputModelIntelligenceInstanceReport intelligenceInstanceReport = null;

  private BQIntelligenceRetrieveInputModelIntelligenceInstanceAnalysis intelligenceInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return intelligenceRetrieveActionTaskRecord
  **/

  public Object getIntelligenceRetrieveActionTaskRecord() {
    return intelligenceRetrieveActionTaskRecord;
  }

  public void setIntelligenceRetrieveActionTaskRecord(Object intelligenceRetrieveActionTaskRecord) {
    this.intelligenceRetrieveActionTaskRecord = intelligenceRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return intelligenceRetrieveActionRequest
  **/

  public String getIntelligenceRetrieveActionRequest() {
    return intelligenceRetrieveActionRequest;
  }

  public void setIntelligenceRetrieveActionRequest(String intelligenceRetrieveActionRequest) {
    this.intelligenceRetrieveActionRequest = intelligenceRetrieveActionRequest;
  }


  /**
   * Get intelligenceInstanceReport
   * @return intelligenceInstanceReport
  **/

  public BQIntelligenceRetrieveInputModelIntelligenceInstanceReport getIntelligenceInstanceReport() {
    return intelligenceInstanceReport;
  }

  public void setIntelligenceInstanceReport(BQIntelligenceRetrieveInputModelIntelligenceInstanceReport intelligenceInstanceReport) {
    this.intelligenceInstanceReport = intelligenceInstanceReport;
  }


  /**
   * Get intelligenceInstanceAnalysis
   * @return intelligenceInstanceAnalysis
  **/

  public BQIntelligenceRetrieveInputModelIntelligenceInstanceAnalysis getIntelligenceInstanceAnalysis() {
    return intelligenceInstanceAnalysis;
  }

  public void setIntelligenceInstanceAnalysis(BQIntelligenceRetrieveInputModelIntelligenceInstanceAnalysis intelligenceInstanceAnalysis) {
    this.intelligenceInstanceAnalysis = intelligenceInstanceAnalysis;
  }


}

