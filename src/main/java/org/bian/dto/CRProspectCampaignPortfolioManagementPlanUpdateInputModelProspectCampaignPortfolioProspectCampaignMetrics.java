package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignMetrics
 */
public class CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolioProspectCampaignMetrics   {
  private String prospectCampaignMetricDefinition = null;

  private String prospectCampaignMetricGoal = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the metric, defining how it is to be measured in deployment 
   * @return prospectCampaignMetricDefinition
  **/

  public String getProspectCampaignMetricDefinition() {
    return prospectCampaignMetricDefinition;
  }

  public void setProspectCampaignMetricDefinition(String prospectCampaignMetricDefinition) {
    this.prospectCampaignMetricDefinition = prospectCampaignMetricDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the target performance for the metric that can be defined for different usage scenarios as appropriate 
   * @return prospectCampaignMetricGoal
  **/

  public String getProspectCampaignMetricGoal() {
    return prospectCampaignMetricGoal;
  }

  public void setProspectCampaignMetricGoal(String prospectCampaignMetricGoal) {
    this.prospectCampaignMetricGoal = prospectCampaignMetricGoal;
  }


}

