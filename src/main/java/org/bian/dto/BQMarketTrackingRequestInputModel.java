package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingRequestInputModelMarketTrackingInstanceRecord;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingRequestInputModel
 */
public class BQMarketTrackingRequestInputModel   {
  private String prospectCampaignPortfolioManagementPlanInstanceReference = null;

  private String marketTrackingInstanceReference = null;

  private BQMarketTrackingRequestInputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord = null;

  private Object marketTrackingRequestActionTaskRecord = null;

  private CRProspectCampaignPortfolioManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Prospect Campaign Portfolio Management Plan instance 
   * @return prospectCampaignPortfolioManagementPlanInstanceReference
  **/

  public String getProspectCampaignPortfolioManagementPlanInstanceReference() {
    return prospectCampaignPortfolioManagementPlanInstanceReference;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReference(String prospectCampaignPortfolioManagementPlanInstanceReference) {
    this.prospectCampaignPortfolioManagementPlanInstanceReference = prospectCampaignPortfolioManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Market Tracking instance 
   * @return marketTrackingInstanceReference
  **/

  public String getMarketTrackingInstanceReference() {
    return marketTrackingInstanceReference;
  }

  public void setMarketTrackingInstanceReference(String marketTrackingInstanceReference) {
    this.marketTrackingInstanceReference = marketTrackingInstanceReference;
  }


  /**
   * Get marketTrackingInstanceRecord
   * @return marketTrackingInstanceRecord
  **/

  public BQMarketTrackingRequestInputModelMarketTrackingInstanceRecord getMarketTrackingInstanceRecord() {
    return marketTrackingInstanceRecord;
  }

  public void setMarketTrackingInstanceRecord(BQMarketTrackingRequestInputModelMarketTrackingInstanceRecord marketTrackingInstanceRecord) {
    this.marketTrackingInstanceRecord = marketTrackingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return marketTrackingRequestActionTaskRecord
  **/

  public Object getMarketTrackingRequestActionTaskRecord() {
    return marketTrackingRequestActionTaskRecord;
  }

  public void setMarketTrackingRequestActionTaskRecord(Object marketTrackingRequestActionTaskRecord) {
    this.marketTrackingRequestActionTaskRecord = marketTrackingRequestActionTaskRecord;
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

