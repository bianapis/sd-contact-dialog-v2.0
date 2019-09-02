/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ContactDialogueApiServiceImpl implements ContactDialogueApiService {

	public SDContactDialogueActivateOutputModel activate(SDContactDialogueActivateInputModel request){
		return JsonReader.read("activate-SDContactDialogueActivateOutputModel.json",new TypeReference<SDContactDialogueActivateOutputModel>(){});
	}
	
	public SDContactDialogueConfigureOutputModel configure(String sdReferenceId, SDContactDialogueConfigureInputModel request){
		return JsonReader.read("configure-SDContactDialogueConfigureOutputModel.json",new TypeReference<SDContactDialogueConfigureOutputModel>(){});
	}
	
	public CRCustomerContactSessionProcedureControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureControlInputModel request){
		return JsonReader.read("control-CRCustomerContactSessionProcedureControlOutputModel.json",new TypeReference<CRCustomerContactSessionProcedureControlOutputModel>(){});
	}
	
	public CRCustomerContactSessionProcedureExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerContactSessionProcedureExchangeOutputModel.json",new TypeReference<CRCustomerContactSessionProcedureExchangeOutputModel>(){});
	}
	
	public CRCustomerContactSessionProcedureExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerContactSessionProcedureExecuteOutputModel.json",new TypeReference<CRCustomerContactSessionProcedureExecuteOutputModel>(){});
	}
	
	public SDContactDialogueFeedbackOutputModel feedback(String sdReferenceId, SDContactDialogueFeedbackInputModel request){
		return JsonReader.read("feedback-SDContactDialogueFeedbackOutputModel.json",new TypeReference<SDContactDialogueFeedbackOutputModel>(){});
	}
	
	public CRCustomerContactSessionProcedureInitiateOutputModel initiate(String sdReferenceId, CRCustomerContactSessionProcedureInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerContactSessionProcedureInitiateOutputModel.json",new TypeReference<CRCustomerContactSessionProcedureInitiateOutputModel>(){});
	}
	
	public BQCaseInitiateOutputModel initiateCase(String sdReferenceId, String crReferenceId, BQCaseInitiateInputModel request){
		return JsonReader.read("initiate-BQCaseInitiateOutputModel.json",new TypeReference<BQCaseInitiateOutputModel>(){});
	}
	
	public BQIntelligenceInitiateOutputModel initiateIntelligence(String sdReferenceId, String crReferenceId, BQIntelligenceInitiateInputModel request){
		return JsonReader.read("initiate-BQIntelligenceInitiateOutputModel.json",new TypeReference<BQIntelligenceInitiateOutputModel>(){});
	}
	
	public BQOfferInitiateOutputModel initiateOffer(String sdReferenceId, String crReferenceId, BQOfferInitiateInputModel request){
		return JsonReader.read("initiate-BQOfferInitiateOutputModel.json",new TypeReference<BQOfferInitiateOutputModel>(){});
	}
	
	public BQOrderInitiateOutputModel initiateOrder(String sdReferenceId, String crReferenceId, BQOrderInitiateInputModel request){
		return JsonReader.read("initiate-BQOrderInitiateOutputModel.json",new TypeReference<BQOrderInitiateOutputModel>(){});
	}
	
	public BQProductServiceInitiateOutputModel initiateProductservice(String sdReferenceId, String crReferenceId, BQProductServiceInitiateInputModel request){
		return JsonReader.read("initiate-BQProductServiceInitiateOutputModel.json",new TypeReference<BQProductServiceInitiateOutputModel>(){});
	}
	
	public BQQueryInitiateOutputModel initiateQuery(String sdReferenceId, String crReferenceId, BQQueryInitiateInputModel request){
		return JsonReader.read("initiate-BQQueryInitiateOutputModel.json",new TypeReference<BQQueryInitiateOutputModel>(){});
	}
	
	public BQSalesInitiateOutputModel initiateSales(String sdReferenceId, String crReferenceId, BQSalesInitiateInputModel request){
		return JsonReader.read("initiate-BQSalesInitiateOutputModel.json",new TypeReference<BQSalesInitiateOutputModel>(){});
	}
	
	public CRCustomerContactSessionProcedureRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureRequestInputModel request){
		return JsonReader.read("request-CRCustomerContactSessionProcedureRequestOutputModel.json",new TypeReference<CRCustomerContactSessionProcedureRequestOutputModel>(){});
	}
	
	public CRCustomerContactSessionProcedureRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerContactSessionProcedureRetrieveOutputModel.json",new TypeReference<CRCustomerContactSessionProcedureRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAuthenticationRetrieveOutputModel retrieveAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAuthenticationRetrieveOutputModel.json",new TypeReference<BQAuthenticationRetrieveOutputModel>(){});
	}
	
	public BQCaseRetrieveOutputModel retrieveCase(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCaseRetrieveOutputModel.json",new TypeReference<BQCaseRetrieveOutputModel>(){});
	}
	
	public BQHistoryRetrieveOutputModel retrieveHistory(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQHistoryRetrieveOutputModel.json",new TypeReference<BQHistoryRetrieveOutputModel>(){});
	}
	
	public BQIntelligenceRetrieveOutputModel retrieveIntelligence(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIntelligenceRetrieveOutputModel.json",new TypeReference<BQIntelligenceRetrieveOutputModel>(){});
	}
	
	public BQOfferRetrieveOutputModel retrieveOffer(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOfferRetrieveOutputModel.json",new TypeReference<BQOfferRetrieveOutputModel>(){});
	}
	
	public BQOrderRetrieveOutputModel retrieveOrder(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOrderRetrieveOutputModel.json",new TypeReference<BQOrderRetrieveOutputModel>(){});
	}
	
	public BQProductServiceRetrieveOutputModel retrieveProductservice(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQProductServiceRetrieveOutputModel.json",new TypeReference<BQProductServiceRetrieveOutputModel>(){});
	}
	
	public BQQueryRetrieveOutputModel retrieveQuery(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQQueryRetrieveOutputModel.json",new TypeReference<BQQueryRetrieveOutputModel>(){});
	}
	
	public BQSalesRetrieveOutputModel retrieveSales(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSalesRetrieveOutputModel.json",new TypeReference<BQSalesRetrieveOutputModel>(){});
	}
	
	public SDContactDialogueRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDContactDialogueRetrieveOutputModel.json",new TypeReference<SDContactDialogueRetrieveOutputModel>(){});
	}
	
	public CRCustomerContactSessionProcedureUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerContactSessionProcedureUpdateInputModel request){
		return JsonReader.read("update-CRCustomerContactSessionProcedureUpdateOutputModel.json",new TypeReference<CRCustomerContactSessionProcedureUpdateOutputModel>(){});
	}
	
	public BQAuthenticationUpdateOutputModel updateAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAuthenticationUpdateInputModel request){
		return JsonReader.read("update-BQAuthenticationUpdateOutputModel.json",new TypeReference<BQAuthenticationUpdateOutputModel>(){});
	}
	
	public BQCaseUpdateOutputModel updateCase(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCaseUpdateInputModel request){
		return JsonReader.read("update-BQCaseUpdateOutputModel.json",new TypeReference<BQCaseUpdateOutputModel>(){});
	}
	
	public BQHistoryUpdateOutputModel updateHistory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHistoryUpdateInputModel request){
		return JsonReader.read("update-BQHistoryUpdateOutputModel.json",new TypeReference<BQHistoryUpdateOutputModel>(){});
	}
	
	public BQIntelligenceUpdateOutputModel updateIntelligence(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIntelligenceUpdateInputModel request){
		return JsonReader.read("update-BQIntelligenceUpdateOutputModel.json",new TypeReference<BQIntelligenceUpdateOutputModel>(){});
	}
	
	public BQOfferUpdateOutputModel updateOffer(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOfferUpdateInputModel request){
		return JsonReader.read("update-BQOfferUpdateOutputModel.json",new TypeReference<BQOfferUpdateOutputModel>(){});
	}
	
	public BQOrderUpdateOutputModel updateOrder(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOrderUpdateInputModel request){
		return JsonReader.read("update-BQOrderUpdateOutputModel.json",new TypeReference<BQOrderUpdateOutputModel>(){});
	}
	
	public BQProductServiceUpdateOutputModel updateProductservice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQProductServiceUpdateInputModel request){
		return JsonReader.read("update-BQProductServiceUpdateOutputModel.json",new TypeReference<BQProductServiceUpdateOutputModel>(){});
	}
	
	public BQQueryUpdateOutputModel updateQuery(String sdReferenceId, String crReferenceId, String bqReferenceId, BQQueryUpdateInputModel request){
		return JsonReader.read("update-BQQueryUpdateOutputModel.json",new TypeReference<BQQueryUpdateOutputModel>(){});
	}
	
	public BQSalesUpdateOutputModel updateSales(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSalesUpdateInputModel request){
		return JsonReader.read("update-BQSalesUpdateOutputModel.json",new TypeReference<BQSalesUpdateOutputModel>(){});
	}
	
}
