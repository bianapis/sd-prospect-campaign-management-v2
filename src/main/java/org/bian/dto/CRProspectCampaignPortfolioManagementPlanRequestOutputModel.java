package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRequestInputModelProspectCampaignPortfolio;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanRequestOutputModel
 */
public class CRProspectCampaignPortfolioManagementPlanRequestOutputModel   {
  private CRProspectCampaignPortfolioManagementPlanRequestInputModelProspectCampaignPortfolio prospectCampaignPortfolio = null;

  private String prospectCampaignPortfolioManagementPlanRequestActionTaskReference = null;

  private Object prospectCampaignPortfolioManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Portfolio Management Plan instance request service call 
   * @return prospectCampaignPortfolioManagementPlanRequestActionTaskReference
  **/

  public String getProspectCampaignPortfolioManagementPlanRequestActionTaskReference() {
    return prospectCampaignPortfolioManagementPlanRequestActionTaskReference;
  }

  public void setProspectCampaignPortfolioManagementPlanRequestActionTaskReference(String prospectCampaignPortfolioManagementPlanRequestActionTaskReference) {
    this.prospectCampaignPortfolioManagementPlanRequestActionTaskReference = prospectCampaignPortfolioManagementPlanRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

