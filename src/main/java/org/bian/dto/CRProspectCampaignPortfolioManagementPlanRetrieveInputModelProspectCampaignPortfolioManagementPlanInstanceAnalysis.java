package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis
 */
public class CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis   {
  private String prospectCampaignPortfolioManagementPlanInstanceAnalysisReference = null;

  private String prospectCampaignPortfolioManagementPlanInstanceAnalysisReportType = null;

  private String prospectCampaignPortfolioManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return prospectCampaignPortfolioManagementPlanInstanceAnalysisReference
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceAnalysisReference() {
    return prospectCampaignPortfolioManagementPlanInstanceAnalysisReference;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceAnalysisReference(String prospectCampaignPortfolioManagementPlanInstanceAnalysisReference) {
    this.prospectCampaignPortfolioManagementPlanInstanceAnalysisReference = prospectCampaignPortfolioManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return prospectCampaignPortfolioManagementPlanInstanceAnalysisReportType
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceAnalysisReportType() {
    return prospectCampaignPortfolioManagementPlanInstanceAnalysisReportType;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceAnalysisReportType(String prospectCampaignPortfolioManagementPlanInstanceAnalysisReportType) {
    this.prospectCampaignPortfolioManagementPlanInstanceAnalysisReportType = prospectCampaignPortfolioManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return prospectCampaignPortfolioManagementPlanInstanceAnalysisParameters
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceAnalysisParameters() {
    return prospectCampaignPortfolioManagementPlanInstanceAnalysisParameters;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceAnalysisParameters(String prospectCampaignPortfolioManagementPlanInstanceAnalysisParameters) {
    this.prospectCampaignPortfolioManagementPlanInstanceAnalysisParameters = prospectCampaignPortfolioManagementPlanInstanceAnalysisParameters;
  }


}

