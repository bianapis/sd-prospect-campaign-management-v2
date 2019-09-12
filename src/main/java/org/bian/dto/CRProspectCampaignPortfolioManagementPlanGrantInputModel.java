package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanGrantInputModel
 */
public class CRProspectCampaignPortfolioManagementPlanGrantInputModel   {
  private String prospectCampaignManagementServicingSessionReference = null;

  private String prospectCampaignPortfolioManagementPlanInstanceReference = null;

  private Object prospectCampaignPortfolioManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRProspectCampaignPortfolioManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRProspectCampaignPortfolioManagementPlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRProspectCampaignPortfolioManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

