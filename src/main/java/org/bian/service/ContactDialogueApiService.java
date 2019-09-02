/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ContactDialogueApiService {

	SDContactDialogueActivateOutputModel activate(SDContactDialogueActivateInputModel request);
	
	SDContactDialogueConfigureOutputModel configure(String sdReferenceId, SDContactDialogueConfigureInputModel request);
	
	CRCustomerContactSessionProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureControlInputModel request);
	
	CRCustomerContactSessionProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureExchangeInputModel request);
	
	CRCustomerContactSessionProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureExecuteInputModel request);
	
	SDContactDialogueFeedbackOutputModel feedback(String sdReferenceId, SDContactDialogueFeedbackInputModel request);
	
	CRCustomerContactSessionProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerContactSessionProcedureInitiateInputModel request);
	
	BQCaseInitiateOutputModel initiateCase(String sdReferenceId, String crReferenceId, BQCaseInitiateInputModel request);
	
	BQIntelligenceInitiateOutputModel initiateIntelligence(String sdReferenceId, String crReferenceId, BQIntelligenceInitiateInputModel request);
	
	BQOfferInitiateOutputModel initiateOffer(String sdReferenceId, String crReferenceId, BQOfferInitiateInputModel request);
	
	BQOrderInitiateOutputModel initiateOrder(String sdReferenceId, String crReferenceId, BQOrderInitiateInputModel request);
	
	BQProductServiceInitiateOutputModel initiateProductservice(String sdReferenceId, String crReferenceId, BQProductServiceInitiateInputModel request);
	
	BQQueryInitiateOutputModel initiateQuery(String sdReferenceId, String crReferenceId, BQQueryInitiateInputModel request);
	
	BQSalesInitiateOutputModel initiateSales(String sdReferenceId, String crReferenceId, BQSalesInitiateInputModel request);
	
	CRCustomerContactSessionProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureRequestInputModel request);
	
	CRCustomerContactSessionProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAuthenticationRetrieveOutputModel retrieveAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQCaseRetrieveOutputModel retrieveCase(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQHistoryRetrieveOutputModel retrieveHistory(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIntelligenceRetrieveOutputModel retrieveIntelligence(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOfferRetrieveOutputModel retrieveOffer(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOrderRetrieveOutputModel retrieveOrder(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQProductServiceRetrieveOutputModel retrieveProductservice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQQueryRetrieveOutputModel retrieveQuery(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSalesRetrieveOutputModel retrieveSales(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDContactDialogueRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerContactSessionProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureUpdateInputModel request);
	
	BQAuthenticationUpdateOutputModel updateAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuthenticationUpdateInputModel request);
	
	BQCaseUpdateOutputModel updateCase(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaseUpdateInputModel request);
	
	BQHistoryUpdateOutputModel updateHistory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHistoryUpdateInputModel request);
	
	BQIntelligenceUpdateOutputModel updateIntelligence(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIntelligenceUpdateInputModel request);
	
	BQOfferUpdateOutputModel updateOffer(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOfferUpdateInputModel request);
	
	BQOrderUpdateOutputModel updateOrder(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrderUpdateInputModel request);
	
	BQProductServiceUpdateOutputModel updateProductservice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductServiceUpdateInputModel request);
	
	BQQueryUpdateOutputModel updateQuery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQueryUpdateInputModel request);
	
	BQSalesUpdateOutputModel updateSales(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesUpdateInputModel request);
	
}
