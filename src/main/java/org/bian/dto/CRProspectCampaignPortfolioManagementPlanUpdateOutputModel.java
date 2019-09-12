package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanUpdateOutputModel
 */
public class CRProspectCampaignPortfolioManagementPlanUpdateOutputModel   {
  private CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolio prospectCampaignPortfolio = null;

  private String prospectCampaignPortfolioManagementPlanUpdateActionTaskReference = null;

  private Object prospectCampaignPortfolioManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get prospectCampaignPortfolio
   * @return prospectCampaignPortfolio
  **/

  public CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolio getProspectCampaignPortfolio() {
    return prospectCampaignPortfolio;
  }

  public void setProspectCampaignPortfolio(CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolio prospectCampaignPortfolio) {
    this.prospectCampaignPortfolio = prospectCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return prospectCampaignPortfolioManagementPlanUpdateActionTaskReference
  **/

  public String getProspectCampaignPortfolioManagementPlanUpdateActionTaskReference() {
    return prospectCampaignPortfolioManagementPlanUpdateActionTaskReference;
  }

  public void setProspectCampaignPortfolioManagementPlanUpdateActionTaskReference(String prospectCampaignPortfolioManagementPlanUpdateActionTaskReference) {
    this.prospectCampaignPortfolioManagementPlanUpdateActionTaskReference = prospectCampaignPortfolioManagementPlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return prospectCampaignPortfolioManagementPlanUpdateActionTaskRecord
  **/

  public Object getProspectCampaignPortfolioManagementPlanUpdateActionTaskRecord() {
    return prospectCampaignPortfolioManagementPlanUpdateActionTaskRecord;
  }

  public void setProspectCampaignPortfolioManagementPlanUpdateActionTaskRecord(Object prospectCampaignPortfolioManagementPlanUpdateActionTaskRecord) {
    this.prospectCampaignPortfolioManagementPlanUpdateActionTaskRecord = prospectCampaignPortfolioManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

