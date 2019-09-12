package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRequestInputModelProspectCampaignPortfolio;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanRequestInputModel
 */
public class CRProspectCampaignPortfolioManagementPlanRequestInputModel   {
  private String prospectCampaignManagementServicingSessionReference = null;

  private String prospectCampaignPortfolioManagementPlanInstanceReference = null;

  private CRProspectCampaignPortfolioManagementPlanRequestInputModelProspectCampaignPortfolio prospectCampaignPortfolio = null;

  private Object prospectCampaignPortfolioManagementPlanRequestActionTaskRecord = null;

  private CRProspectCampaignPortfolioManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRProspectCampaignPortfolioManagementPlanRequestInputModelProspectCampaignPortfolio getProspectCampaignPortfolio() {
    return prospectCampaignPortfolio;
  }

  public void setProspectCampaignPortfolio(CRProspectCampaignPortfolioManagementPlanRequestInputModelProspectCampaignPortfolio prospectCampaignPortfolio) {
    this.prospectCampaignPortfolio = prospectCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return prospectCampaignPortfolioManagementPlanRequestActionTaskRecord
  **/

  public Object getProspectCampaignPortfolioManagementPlanRequestActionTaskRecord() {
    return prospectCampaignPortfolioManagementPlanRequestActionTaskRecord;
  }

  public void setProspectCampaignPortfolioManagementPlanRequestActionTaskRecord(Object prospectCampaignPortfolioManagementPlanRequestActionTaskRecord) {
    this.prospectCampaignPortfolioManagementPlanRequestActionTaskRecord = prospectCampaignPortfolioManagementPlanRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRProspectCampaignPortfolioManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRProspectCampaignPortfolioManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

