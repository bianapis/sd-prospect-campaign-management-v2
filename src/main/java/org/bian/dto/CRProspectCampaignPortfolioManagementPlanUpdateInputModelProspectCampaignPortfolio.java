package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignMetrics;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignPerformanceRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolio
 */
public class CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolio   {
  private String prospectCampaignType = null;

  private String prospectCampaignDescription = null;

  private CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignMetrics prospectCampaignMetrics = null;

  private CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignPerformanceRecord prospectCampaignPerformanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type or category of prospect campaign (e.g. mailshot, targeted solicitation, discounted product incentive) 
   * @return prospectCampaignType
  **/

  public String getProspectCampaignType() {
    return prospectCampaignType;
  }

  public void setProspectCampaignType(String prospectCampaignType) {
    this.prospectCampaignType = prospectCampaignType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the campaign that clarifies the intended context/use of the campaign, the mechanisms employed and the intended/anticipated response/impact 
   * @return prospectCampaignDescription
  **/

  public String getProspectCampaignDescription() {
    return prospectCampaignDescription;
  }

  public void setProspectCampaignDescription(String prospectCampaignDescription) {
    this.prospectCampaignDescription = prospectCampaignDescription;
  }


  /**
   * Get prospectCampaignMetrics
   * @return prospectCampaignMetrics
  **/

  public CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignMetrics getProspectCampaignMetrics() {
    return prospectCampaignMetrics;
  }

  public void setProspectCampaignMetrics(CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignMetrics prospectCampaignMetrics) {
    this.prospectCampaignMetrics = prospectCampaignMetrics;
  }


  /**
   * Get prospectCampaignPerformanceRecord
   * @return prospectCampaignPerformanceRecord
  **/

  public CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignPerformanceRecord getProspectCampaignPerformanceRecord() {
    return prospectCampaignPerformanceRecord;
  }

  public void setProspectCampaignPerformanceRecord(CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignPerformanceRecord prospectCampaignPerformanceRecord) {
    this.prospectCampaignPerformanceRecord = prospectCampaignPerformanceRecord;
  }


}

