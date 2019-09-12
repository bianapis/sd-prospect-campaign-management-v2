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
public class ProspectCampaignManagementApiServiceImpl implements ProspectCampaignManagementApiService {

	public SDProspectCampaignManagementActivateOutputModel activate(SDProspectCampaignManagementActivateInputModel request){
		return JsonReader.read("activate-SDProspectCampaignManagementActivateOutputModel.json",new TypeReference<SDProspectCampaignManagementActivateOutputModel>(){});
	}
	
	public SDProspectCampaignManagementConfigureOutputModel configure(String sdReferenceId, SDProspectCampaignManagementConfigureInputModel request){
		return JsonReader.read("configure-SDProspectCampaignManagementConfigureOutputModel.json",new TypeReference<SDProspectCampaignManagementConfigureOutputModel>(){});
	}
	
	public CRProspectCampaignPortfolioManagementPlanCreateOutputModel create(String sdReferenceId, CRProspectCampaignPortfolioManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRProspectCampaignPortfolioManagementPlanCreateOutputModel.json",new TypeReference<CRProspectCampaignPortfolioManagementPlanCreateOutputModel>(){});
	}
	
	public BQCampaignDirectionCreateOutputModel createCampaigndirection(String sdReferenceId, String crReferenceId, BQCampaignDirectionCreateInputModel request){
		return JsonReader.read("create-BQCampaignDirectionCreateOutputModel.json",new TypeReference<BQCampaignDirectionCreateOutputModel>(){});
	}
	
	public BQPerformanceAssessmentCreateOutputModel createPerformanceassessment(String sdReferenceId, String crReferenceId, BQPerformanceAssessmentCreateInputModel request){
		return JsonReader.read("create-BQPerformanceAssessmentCreateOutputModel.json",new TypeReference<BQPerformanceAssessmentCreateOutputModel>(){});
	}
	
	public BQMarketTrackingExecuteOutputModel executeMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingExecuteInputModel request){
		return JsonReader.read("execute-BQMarketTrackingExecuteOutputModel.json",new TypeReference<BQMarketTrackingExecuteOutputModel>(){});
	}
	
	public BQPerformanceAssessmentExecuteOutputModel executePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentExecuteInputModel request){
		return JsonReader.read("execute-BQPerformanceAssessmentExecuteOutputModel.json",new TypeReference<BQPerformanceAssessmentExecuteOutputModel>(){});
	}
	
	public SDProspectCampaignManagementFeedbackOutputModel feedback(String sdReferenceId, SDProspectCampaignManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDProspectCampaignManagementFeedbackOutputModel.json",new TypeReference<SDProspectCampaignManagementFeedbackOutputModel>(){});
	}
	
	public CRProspectCampaignPortfolioManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProspectCampaignPortfolioManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRProspectCampaignPortfolioManagementPlanGrantOutputModel.json",new TypeReference<CRProspectCampaignPortfolioManagementPlanGrantOutputModel>(){});
	}
	
	public BQCampaignDirectionRequestOutputModel requestCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionRequestInputModel request){
		return JsonReader.read("request-BQCampaignDirectionRequestOutputModel.json",new TypeReference<BQCampaignDirectionRequestOutputModel>(){});
	}
	
	public BQMarketTrackingRequestOutputModel requestMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingRequestInputModel request){
		return JsonReader.read("request-BQMarketTrackingRequestOutputModel.json",new TypeReference<BQMarketTrackingRequestOutputModel>(){});
	}
	
	public BQPerformanceAssessmentRequestOutputModel requestPerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentRequestInputModel request){
		return JsonReader.read("request-BQPerformanceAssessmentRequestOutputModel.json",new TypeReference<BQPerformanceAssessmentRequestOutputModel>(){});
	}
	
	public CRProspectCampaignPortfolioManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProspectCampaignPortfolioManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRProspectCampaignPortfolioManagementPlanRequestOutputModel.json",new TypeReference<CRProspectCampaignPortfolioManagementPlanRequestOutputModel>(){});
	}
	
	public CRProspectCampaignPortfolioManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRProspectCampaignPortfolioManagementPlanRetrieveOutputModel.json",new TypeReference<CRProspectCampaignPortfolioManagementPlanRetrieveOutputModel>(){});
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
	
	public BQCampaignDirectionRetrieveOutputModel retrieveCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCampaignDirectionRetrieveOutputModel.json",new TypeReference<BQCampaignDirectionRetrieveOutputModel>(){});
	}
	
	public BQMarketTrackingRetrieveOutputModel retrieveMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMarketTrackingRetrieveOutputModel.json",new TypeReference<BQMarketTrackingRetrieveOutputModel>(){});
	}
	
	public BQPerformanceAssessmentRetrieveOutputModel retrievePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceAssessmentRetrieveOutputModel.json",new TypeReference<BQPerformanceAssessmentRetrieveOutputModel>(){});
	}
	
	public SDProspectCampaignManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDProspectCampaignManagementRetrieveOutputModel.json",new TypeReference<SDProspectCampaignManagementRetrieveOutputModel>(){});
	}
	
	public CRProspectCampaignPortfolioManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProspectCampaignPortfolioManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRProspectCampaignPortfolioManagementPlanUpdateOutputModel.json",new TypeReference<CRProspectCampaignPortfolioManagementPlanUpdateOutputModel>(){});
	}
	
	public BQCampaignDirectionUpdateOutputModel updateCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionUpdateInputModel request){
		return JsonReader.read("update-BQCampaignDirectionUpdateOutputModel.json",new TypeReference<BQCampaignDirectionUpdateOutputModel>(){});
	}
	
	public BQMarketTrackingUpdateOutputModel updateMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingUpdateInputModel request){
		return JsonReader.read("update-BQMarketTrackingUpdateOutputModel.json",new TypeReference<BQMarketTrackingUpdateOutputModel>(){});
	}
	
	public BQPerformanceAssessmentUpdateOutputModel updatePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentUpdateInputModel request){
		return JsonReader.read("update-BQPerformanceAssessmentUpdateOutputModel.json",new TypeReference<BQPerformanceAssessmentUpdateOutputModel>(){});
	}
	
}
