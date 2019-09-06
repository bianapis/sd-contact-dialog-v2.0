package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIntelligenceRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord;
import org.bian.dto.BQIntelligenceRetrieveOutputModelIntelligenceInstanceAnalysis;
import org.bian.dto.BQIntelligenceRetrieveOutputModelIntelligenceInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIntelligenceRetrieveOutputModel
 */
public class BQIntelligenceRetrieveOutputModel   {
  private BQIntelligenceRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord = null;

  private String intelligenceRetrieveActionTaskReference = null;

  private Object intelligenceRetrieveActionTaskRecord = null;

  private String intelligenceRetrieveActionResponse = null;

  private BQIntelligenceRetrieveOutputModelIntelligenceInstanceReport intelligenceInstanceReport = null;

  private BQIntelligenceRetrieveOutputModelIntelligenceInstanceAnalysis intelligenceInstanceAnalysis = null;


  /**
   * Get cRCustomerContactSessionProcedureInstanceRecord
   * @return cRCustomerContactSessionProcedureInstanceRecord
  **/

  public BQIntelligenceRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord getCRCustomerContactSessionProcedureInstanceRecord() {
    return cRCustomerContactSessionProcedureInstanceRecord;
  }
  @JsonProperty("cRCustomerContactSessionProcedureInstanceRecord")
  public void setCRCustomerContactSessionProcedureInstanceRecord(BQIntelligenceRetrieveOutputModelCRCustomerContactSessionProcedureInstanceRecord cRCustomerContactSessionProcedureInstanceRecord) {
    this.cRCustomerContactSessionProcedureInstanceRecord = cRCustomerContactSessionProcedureInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Intelligence instance retrieve service call 
   * @return intelligenceRetrieveActionTaskReference
  **/

  public String getIntelligenceRetrieveActionTaskReference() {
    return intelligenceRetrieveActionTaskReference;
  }

  public void setIntelligenceRetrieveActionTaskReference(String intelligenceRetrieveActionTaskReference) {
    this.intelligenceRetrieveActionTaskReference = intelligenceRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return intelligenceRetrieveActionResponse
  **/

  public String getIntelligenceRetrieveActionResponse() {
    return intelligenceRetrieveActionResponse;
  }

  public void setIntelligenceRetrieveActionResponse(String intelligenceRetrieveActionResponse) {
    this.intelligenceRetrieveActionResponse = intelligenceRetrieveActionResponse;
  }


  /**
   * Get intelligenceInstanceReport
   * @return intelligenceInstanceReport
  **/

  public BQIntelligenceRetrieveOutputModelIntelligenceInstanceReport getIntelligenceInstanceReport() {
    return intelligenceInstanceReport;
  }

  public void setIntelligenceInstanceReport(BQIntelligenceRetrieveOutputModelIntelligenceInstanceReport intelligenceInstanceReport) {
    this.intelligenceInstanceReport = intelligenceInstanceReport;
  }


  /**
   * Get intelligenceInstanceAnalysis
   * @return intelligenceInstanceAnalysis
  **/

  public BQIntelligenceRetrieveOutputModelIntelligenceInstanceAnalysis getIntelligenceInstanceAnalysis() {
    return intelligenceInstanceAnalysis;
  }

  public void setIntelligenceInstanceAnalysis(BQIntelligenceRetrieveOutputModelIntelligenceInstanceAnalysis intelligenceInstanceAnalysis) {
    this.intelligenceInstanceAnalysis = intelligenceInstanceAnalysis;
  }


}

