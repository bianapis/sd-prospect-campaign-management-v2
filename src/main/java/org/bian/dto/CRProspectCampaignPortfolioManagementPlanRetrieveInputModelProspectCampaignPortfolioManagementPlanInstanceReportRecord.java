package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord
 */
public class CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord   {
  private String prospectCampaignPortfolioManagementPlanInstanceReportReference = null;

  private String prospectCampaignPortfolioManagementPlanInstanceReportType = null;

  private String prospectCampaignPortfolioManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return prospectCampaignPortfolioManagementPlanInstanceReportReference
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceReportReference() {
    return prospectCampaignPortfolioManagementPlanInstanceReportReference;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReportReference(String prospectCampaignPortfolioManagementPlanInstanceReportReference) {
    this.prospectCampaignPortfolioManagementPlanInstanceReportReference = prospectCampaignPortfolioManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return prospectCampaignPortfolioManagementPlanInstanceReportType
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceReportType() {
    return prospectCampaignPortfolioManagementPlanInstanceReportType;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReportType(String prospectCampaignPortfolioManagementPlanInstanceReportType) {
    this.prospectCampaignPortfolioManagementPlanInstanceReportType = prospectCampaignPortfolioManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return prospectCampaignPortfolioManagementPlanInstanceReportParameters
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceReportParameters() {
    return prospectCampaignPortfolioManagementPlanInstanceReportParameters;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReportParameters(String prospectCampaignPortfolioManagementPlanInstanceReportParameters) {
    this.prospectCampaignPortfolioManagementPlanInstanceReportParameters = prospectCampaignPortfolioManagementPlanInstanceReportParameters;
  }


}

