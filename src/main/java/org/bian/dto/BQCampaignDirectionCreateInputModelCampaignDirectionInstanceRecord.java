package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord
 */
public class BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord   {
  private String prospectCampaignDevelopmentSchedule = null;

  private String prospectCampaignExecutionSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule of planned and actual prospect campaign design development and refinement activity 
   * @return prospectCampaignDevelopmentSchedule
  **/

  public String getProspectCampaignDevelopmentSchedule() {
    return prospectCampaignDevelopmentSchedule;
  }

  public void setProspectCampaignDevelopmentSchedule(String prospectCampaignDevelopmentSchedule) {
    this.prospectCampaignDevelopmentSchedule = prospectCampaignDevelopmentSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule of planned and actual prospect campaign execution activities 
   * @return prospectCampaignExecutionSchedule
  **/

  public String getProspectCampaignExecutionSchedule() {
    return prospectCampaignExecutionSchedule;
  }

  public void setProspectCampaignExecutionSchedule(String prospectCampaignExecutionSchedule) {
    this.prospectCampaignExecutionSchedule = prospectCampaignExecutionSchedule;
  }


}

