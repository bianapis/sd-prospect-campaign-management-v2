package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRequestInputModel
 */
public class BQCampaignDirectionRequestInputModel   {
  private String prospectCampaignPortfolioManagementPlanInstanceReference = null;

  private String campaignDirectionInstanceReference = null;

  private BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord = null;

  private Object campaignDirectionRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Campaign Direction instance 
   * @return campaignDirectionInstanceReference
  **/

  public String getCampaignDirectionInstanceReference() {
    return campaignDirectionInstanceReference;
  }

  public void setCampaignDirectionInstanceReference(String campaignDirectionInstanceReference) {
    this.campaignDirectionInstanceReference = campaignDirectionInstanceReference;
  }


  /**
   * Get campaignDirectionInstanceRecord
   * @return campaignDirectionInstanceRecord
  **/

  public BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord getCampaignDirectionInstanceRecord() {
    return campaignDirectionInstanceRecord;
  }

  public void setCampaignDirectionInstanceRecord(BQCampaignDirectionCreateInputModelCampaignDirectionInstanceRecord campaignDirectionInstanceRecord) {
    this.campaignDirectionInstanceRecord = campaignDirectionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return campaignDirectionRequestActionTaskRecord
  **/

  public Object getCampaignDirectionRequestActionTaskRecord() {
    return campaignDirectionRequestActionTaskRecord;
  }

  public void setCampaignDirectionRequestActionTaskRecord(Object campaignDirectionRequestActionTaskRecord) {
    this.campaignDirectionRequestActionTaskRecord = campaignDirectionRequestActionTaskRecord;
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

