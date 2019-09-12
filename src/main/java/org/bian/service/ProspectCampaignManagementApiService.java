/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ProspectCampaignManagementApiService {

	SDProspectCampaignManagementActivateOutputModel activate(SDProspectCampaignManagementActivateInputModel request);
	
	SDProspectCampaignManagementConfigureOutputModel configure(String sdReferenceId, SDProspectCampaignManagementConfigureInputModel request);
	
	CRProspectCampaignPortfolioManagementPlanCreateOutputModel create(String sdReferenceId, CRProspectCampaignPortfolioManagementPlanCreateInputModel request);
	
	BQCampaignDirectionCreateOutputModel createCampaigndirection(String sdReferenceId, String crReferenceId, BQCampaignDirectionCreateInputModel request);
	
	BQPerformanceAssessmentCreateOutputModel createPerformanceassessment(String sdReferenceId, String crReferenceId, BQPerformanceAssessmentCreateInputModel request);
	
	BQMarketTrackingExecuteOutputModel executeMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingExecuteInputModel request);
	
	BQPerformanceAssessmentExecuteOutputModel executePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentExecuteInputModel request);
	
	SDProspectCampaignManagementFeedbackOutputModel feedback(String sdReferenceId, SDProspectCampaignManagementFeedbackInputModel request);
	
	CRProspectCampaignPortfolioManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRProspectCampaignPortfolioManagementPlanGrantInputModel request);
	
	BQCampaignDirectionRequestOutputModel requestCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionRequestInputModel request);
	
	BQMarketTrackingRequestOutputModel requestMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingRequestInputModel request);
	
	BQPerformanceAssessmentRequestOutputModel requestPerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentRequestInputModel request);
	
	CRProspectCampaignPortfolioManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRProspectCampaignPortfolioManagementPlanRequestInputModel request);
	
	CRProspectCampaignPortfolioManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQCampaignDirectionRetrieveOutputModel retrieveCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMarketTrackingRetrieveOutputModel retrieveMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPerformanceAssessmentRetrieveOutputModel retrievePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDProspectCampaignManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRProspectCampaignPortfolioManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRProspectCampaignPortfolioManagementPlanUpdateInputModel request);
	
	BQCampaignDirectionUpdateOutputModel updateCampaigndirection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCampaignDirectionUpdateInputModel request);
	
	BQMarketTrackingUpdateOutputModel updateMarkettracking(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMarketTrackingUpdateInputModel request);
	
	BQPerformanceAssessmentUpdateOutputModel updatePerformanceassessment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceAssessmentUpdateInputModel request);
	
}
