package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis
 */
public class CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis   {
  private String prospectCampaignPortfolioManagementPlanInstanceAnalysisData = null;

  private String prospectCampaignPortfolioManagementPlanInstanceAnalysisReportType = null;

  private Object prospectCampaignPortfolioManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return prospectCampaignPortfolioManagementPlanInstanceAnalysisData
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceAnalysisData() {
    return prospectCampaignPortfolioManagementPlanInstanceAnalysisData;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceAnalysisData(String prospectCampaignPortfolioManagementPlanInstanceAnalysisData) {
    this.prospectCampaignPortfolioManagementPlanInstanceAnalysisData = prospectCampaignPortfolioManagementPlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return prospectCampaignPortfolioManagementPlanInstanceAnalysisReport
  **/

  public Object getProspectCampaignPortfolioManagementPlanInstanceAnalysisReport() {
    return prospectCampaignPortfolioManagementPlanInstanceAnalysisReport;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceAnalysisReport(Object prospectCampaignPortfolioManagementPlanInstanceAnalysisReport) {
    this.prospectCampaignPortfolioManagementPlanInstanceAnalysisReport = prospectCampaignPortfolioManagementPlanInstanceAnalysisReport;
  }


}

