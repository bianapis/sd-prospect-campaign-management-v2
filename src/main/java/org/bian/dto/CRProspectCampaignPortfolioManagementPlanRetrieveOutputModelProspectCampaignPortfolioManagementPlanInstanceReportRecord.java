package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord
 */
public class CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord   {
  private String prospectCampaignPortfolioManagementPlanInstanceReportData = null;

  private String prospectCampaignPortfolioManagementPlanInstanceReportType = null;

  private Object prospectCampaignPortfolioManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return prospectCampaignPortfolioManagementPlanInstanceReportData
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceReportData() {
    return prospectCampaignPortfolioManagementPlanInstanceReportData;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReportData(String prospectCampaignPortfolioManagementPlanInstanceReportData) {
    this.prospectCampaignPortfolioManagementPlanInstanceReportData = prospectCampaignPortfolioManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return prospectCampaignPortfolioManagementPlanInstanceReport
  **/

  public Object getProspectCampaignPortfolioManagementPlanInstanceReport() {
    return prospectCampaignPortfolioManagementPlanInstanceReport;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReport(Object prospectCampaignPortfolioManagementPlanInstanceReport) {
    this.prospectCampaignPortfolioManagementPlanInstanceReport = prospectCampaignPortfolioManagementPlanInstanceReport;
  }


}

