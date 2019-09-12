package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanGrantOutputModel
 */
public class CRProspectCampaignPortfolioManagementPlanGrantOutputModel   {
  private String prospectCampaignPortfolioManagementPlanGrantActionTaskReference = null;

  private Object prospectCampaignPortfolioManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRProspectCampaignPortfolioManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Portfolio Management Plan instance grant service call 
   * @return prospectCampaignPortfolioManagementPlanGrantActionTaskReference
  **/

  public String getProspectCampaignPortfolioManagementPlanGrantActionTaskReference() {
    return prospectCampaignPortfolioManagementPlanGrantActionTaskReference;
  }

  public void setProspectCampaignPortfolioManagementPlanGrantActionTaskReference(String prospectCampaignPortfolioManagementPlanGrantActionTaskReference) {
    this.prospectCampaignPortfolioManagementPlanGrantActionTaskReference = prospectCampaignPortfolioManagementPlanGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return prospectCampaignPortfolioManagementPlanGrantActionTaskRecord
  **/

  public Object getProspectCampaignPortfolioManagementPlanGrantActionTaskRecord() {
    return prospectCampaignPortfolioManagementPlanGrantActionTaskRecord;
  }

  public void setProspectCampaignPortfolioManagementPlanGrantActionTaskRecord(Object prospectCampaignPortfolioManagementPlanGrantActionTaskRecord) {
    this.prospectCampaignPortfolioManagementPlanGrantActionTaskRecord = prospectCampaignPortfolioManagementPlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRProspectCampaignPortfolioManagementPlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRProspectCampaignPortfolioManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

