package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanCreateInputModelProspectCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanCreateInputModel
 */
public class CRProspectCampaignPortfolioManagementPlanCreateInputModel   {
  private String prospectCampaignManagementServicingSessionReference = null;

  private Object prospectCampaignPortfolioManagementPlanCreateActionRecord = null;

  private String prospectCampaignPortfolioManagementPlanInstanceStatus = null;

  private CRProspectCampaignPortfolioManagementPlanCreateInputModelProspectCampaignPortfolio prospectCampaignPortfolio = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return prospectCampaignPortfolioManagementPlanCreateActionRecord
  **/

  public Object getProspectCampaignPortfolioManagementPlanCreateActionRecord() {
    return prospectCampaignPortfolioManagementPlanCreateActionRecord;
  }

  public void setProspectCampaignPortfolioManagementPlanCreateActionRecord(Object prospectCampaignPortfolioManagementPlanCreateActionRecord) {
    this.prospectCampaignPortfolioManagementPlanCreateActionRecord = prospectCampaignPortfolioManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Prospect Campaign Portfolio Management Plan instance (e.g. initialised, pending, active) 
   * @return prospectCampaignPortfolioManagementPlanInstanceStatus
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceStatus() {
    return prospectCampaignPortfolioManagementPlanInstanceStatus;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceStatus(String prospectCampaignPortfolioManagementPlanInstanceStatus) {
    this.prospectCampaignPortfolioManagementPlanInstanceStatus = prospectCampaignPortfolioManagementPlanInstanceStatus;
  }


  /**
   * Get prospectCampaignPortfolio
   * @return prospectCampaignPortfolio
  **/

  public CRProspectCampaignPortfolioManagementPlanCreateInputModelProspectCampaignPortfolio getProspectCampaignPortfolio() {
    return prospectCampaignPortfolio;
  }

  public void setProspectCampaignPortfolio(CRProspectCampaignPortfolioManagementPlanCreateInputModelProspectCampaignPortfolio prospectCampaignPortfolio) {
    this.prospectCampaignPortfolio = prospectCampaignPortfolio;
  }


}

