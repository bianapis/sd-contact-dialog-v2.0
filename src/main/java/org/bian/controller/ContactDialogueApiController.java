/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class ContactDialogueApiController {

	@Autowired
	ContactDialogueApiService service;
	
	@Process.Activate
	public BianResponse<SDContactDialogueActivateOutputModel> activate(@RequestBody BianRequest<SDContactDialogueActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Process.Configure
	public BianResponse<SDContactDialogueConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDContactDialogueConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Control
	public BianResponse<CRCustomerContactSessionProcedureControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactSessionProcedureControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Exchange
	public BianResponse<CRCustomerContactSessionProcedureExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactSessionProcedureExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Execute
	public BianResponse<CRCustomerContactSessionProcedureExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactSessionProcedureExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Feedback
	public BianResponse<SDContactDialogueFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDContactDialogueFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Process.Initiate
	public BianResponse<CRCustomerContactSessionProcedureInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerContactSessionProcedureInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("case")
	@Process.Initiate
	public BianResponse<BQCaseInitiateOutputModel> initiateCase(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCaseInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCase(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("intelligence")
	@Process.Initiate
	public BianResponse<BQIntelligenceInitiateOutputModel> initiateIntelligence(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQIntelligenceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateIntelligence(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("offer")
	@Process.Initiate
	public BianResponse<BQOfferInitiateOutputModel> initiateOffer(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOfferInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateOffer(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("order")
	@Process.Initiate
	public BianResponse<BQOrderInitiateOutputModel> initiateOrder(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOrderInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateOrder(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("productservice")
	@Process.Initiate
	public BianResponse<BQProductServiceInitiateOutputModel> initiateProductservice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQProductServiceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateProductservice(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("query")
	@Process.Initiate
	public BianResponse<BQQueryInitiateOutputModel> initiateQuery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQQueryInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateQuery(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales")
	@Process.Initiate
	public BianResponse<BQSalesInitiateOutputModel> initiateSales(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSalesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSales(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Request
	public BianResponse<CRCustomerContactSessionProcedureRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactSessionProcedureRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Process.Retrieve
	public BianResponse<CRCustomerContactSessionProcedureRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("authentication")
	@Process.Retrieve
	public BianResponse<BQAuthenticationRetrieveOutputModel> retrieveAuthentication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthentication(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("case")
	@Process.Retrieve
	public BianResponse<BQCaseRetrieveOutputModel> retrieveCase(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCase(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("history")
	@Process.Retrieve
	public BianResponse<BQHistoryRetrieveOutputModel> retrieveHistory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveHistory(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("intelligence")
	@Process.Retrieve
	public BianResponse<BQIntelligenceRetrieveOutputModel> retrieveIntelligence(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIntelligence(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("offer")
	@Process.Retrieve
	public BianResponse<BQOfferRetrieveOutputModel> retrieveOffer(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOffer(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("order")
	@Process.Retrieve
	public BianResponse<BQOrderRetrieveOutputModel> retrieveOrder(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOrder(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("productservice")
	@Process.Retrieve
	public BianResponse<BQProductServiceRetrieveOutputModel> retrieveProductservice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProductservice(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("query")
	@Process.Retrieve
	public BianResponse<BQQueryRetrieveOutputModel> retrieveQuery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveQuery(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("sales")
	@Process.Retrieve
	public BianResponse<BQSalesRetrieveOutputModel> retrieveSales(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSales(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveSD
	public BianResponse<SDContactDialogueRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Process.Update
	public BianResponse<CRCustomerContactSessionProcedureUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactSessionProcedureUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("authentication")
	@Process.Update
	public BianResponse<BQAuthenticationUpdateOutputModel> updateAuthentication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAuthenticationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAuthentication(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("case")
	@Process.Update
	public BianResponse<BQCaseUpdateOutputModel> updateCase(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCaseUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCase(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("history")
	@Process.Update
	public BianResponse<BQHistoryUpdateOutputModel> updateHistory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQHistoryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateHistory(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("intelligence")
	@Process.Update
	public BianResponse<BQIntelligenceUpdateOutputModel> updateIntelligence(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIntelligenceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateIntelligence(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("offer")
	@Process.Update
	public BianResponse<BQOfferUpdateOutputModel> updateOffer(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOfferUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOffer(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("order")
	@Process.Update
	public BianResponse<BQOrderUpdateOutputModel> updateOrder(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOrderUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOrder(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("productservice")
	@Process.Update
	public BianResponse<BQProductServiceUpdateOutputModel> updateProductservice(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQProductServiceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateProductservice(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("query")
	@Process.Update
	public BianResponse<BQQueryUpdateOutputModel> updateQuery(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQQueryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateQuery(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("sales")
	@Process.Update
	public BianResponse<BQSalesUpdateOutputModel> updateSales(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSalesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSales(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
