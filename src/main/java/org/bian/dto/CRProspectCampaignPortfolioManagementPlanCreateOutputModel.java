package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanCreateOutputModelProspectCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanCreateOutputModel
 */
public class CRProspectCampaignPortfolioManagementPlanCreateOutputModel   {
  private String prospectCampaignPortfolioManagementPlanInstanceReference = null;

  private String prospectCampaignPortfolioManagementPlanCreateActionReference = null;

  private Object prospectCampaignPortfolioManagementPlanCreateActionRecord = null;

  private String prospectCampaignPortfolioManagementPlanInstanceStatus = null;

  private CRProspectCampaignPortfolioManagementPlanCreateOutputModelProspectCampaignPortfolio prospectCampaignPortfolio = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return prospectCampaignPortfolioManagementPlanCreateActionReference
  **/

  public String getProspectCampaignPortfolioManagementPlanCreateActionReference() {
    return prospectCampaignPortfolioManagementPlanCreateActionReference;
  }

  public void setProspectCampaignPortfolioManagementPlanCreateActionReference(String prospectCampaignPortfolioManagementPlanCreateActionReference) {
    this.prospectCampaignPortfolioManagementPlanCreateActionReference = prospectCampaignPortfolioManagementPlanCreateActionReference;
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

  public CRProspectCampaignPortfolioManagementPlanCreateOutputModelProspectCampaignPortfolio getProspectCampaignPortfolio() {
    return prospectCampaignPortfolio;
  }

  public void setProspectCampaignPortfolio(CRProspectCampaignPortfolioManagementPlanCreateOutputModelProspectCampaignPortfolio prospectCampaignPortfolio) {
    this.prospectCampaignPortfolio = prospectCampaignPortfolio;
  }


}

