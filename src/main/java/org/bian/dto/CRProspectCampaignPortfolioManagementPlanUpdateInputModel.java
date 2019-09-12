package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanUpdateInputModel
 */
public class CRProspectCampaignPortfolioManagementPlanUpdateInputModel   {
  private String prospectCampaignManagementServicingSessionReference = null;

  private String prospectCampaignPortfolioManagementPlanInstanceReference = null;

  private CRProspectCampaignPortfolioManagementPlanUpdateInputModelProspectCampaignPortfolio prospectCampaignPortfolio = null;

  private Object prospectCampaignPortfolioManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return prospectCampaignManagementServicingSessionReference
  **/

  public String getProspectCampaignManagementServicingSessionReference() {
    return prospectCampaignManagementServicingSessionReference;
  }

  public void setProspectCampaignManagementServicingSessionReference(String prospectCampaignManagementServicingSessionReference) {
    this.prospectCampaignManagementServicingSessionReference = prospectCampaignManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Prospect Campaign Portfolio Management Plan instance 
   * @return prospectCampaignPortfolioManagementPlanInstanceReference
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceReference() {
    return prospectCampaignPortfolioManagementPlanInstanceReference;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReference(String prospectCampaignPortfolioManagementPlanInstanceReference) {
    this.prospectCampaignPortfolioManagementPlanInstanceReference = prospectCampaignPortfolioManagementPlanInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

