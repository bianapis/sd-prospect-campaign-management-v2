package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolio;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanRetrieveOutputModel
 */
public class CRProspectCampaignPortfolioManagementPlanRetrieveOutputModel   {
  private CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolio prospectCampaignPortfolio = null;

  private String prospectCampaignPortfolioManagementPlanRetrieveActionTaskReference = null;

  private Object prospectCampaignPortfolioManagementPlanRetrieveActionTaskRecord = null;

  private String prospectCampaignPortfolioManagementPlanRetrieveActionResponse = null;

  private CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord prospectCampaignPortfolioManagementPlanInstanceReportRecord = null;

  private CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis prospectCampaignPortfolioManagementPlanInstanceAnalysis = null;


  /**
   * Get prospectCampaignPortfolio
   * @return prospectCampaignPortfolio
  **/

  public CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolio getProspectCampaignPortfolio() {
    return prospectCampaignPortfolio;
  }

  public void setProspectCampaignPortfolio(CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolio prospectCampaignPortfolio) {
    this.prospectCampaignPortfolio = prospectCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Prospect Campaign Portfolio Management Plan instance retrieve service call 
   * @return prospectCampaignPortfolioManagementPlanRetrieveActionTaskReference
  **/

  public String getProspectCampaignPortfolioManagementPlanRetrieveActionTaskReference() {
    return prospectCampaignPortfolioManagementPlanRetrieveActionTaskReference;
  }

  public void setProspectCampaignPortfolioManagementPlanRetrieveActionTaskReference(String prospectCampaignPortfolioManagementPlanRetrieveActionTaskReference) {
    this.prospectCampaignPortfolioManagementPlanRetrieveActionTaskReference = prospectCampaignPortfolioManagementPlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return prospectCampaignPortfolioManagementPlanRetrieveActionTaskRecord
  **/

  public Object getProspectCampaignPortfolioManagementPlanRetrieveActionTaskRecord() {
    return prospectCampaignPortfolioManagementPlanRetrieveActionTaskRecord;
  }

  public void setProspectCampaignPortfolioManagementPlanRetrieveActionTaskRecord(Object prospectCampaignPortfolioManagementPlanRetrieveActionTaskRecord) {
    this.prospectCampaignPortfolioManagementPlanRetrieveActionTaskRecord = prospectCampaignPortfolioManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return prospectCampaignPortfolioManagementPlanRetrieveActionResponse
  **/

  public String getProspectCampaignPortfolioManagementPlanRetrieveActionResponse() {
    return prospectCampaignPortfolioManagementPlanRetrieveActionResponse;
  }

  public void setProspectCampaignPortfolioManagementPlanRetrieveActionResponse(String prospectCampaignPortfolioManagementPlanRetrieveActionResponse) {
    this.prospectCampaignPortfolioManagementPlanRetrieveActionResponse = prospectCampaignPortfolioManagementPlanRetrieveActionResponse;
  }


  /**
   * Get prospectCampaignPortfolioManagementPlanInstanceReportRecord
   * @return prospectCampaignPortfolioManagementPlanInstanceReportRecord
  **/

  public CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord getProspectCampaignPortfolioManagementPlanInstanceReportRecord() {
    return prospectCampaignPortfolioManagementPlanInstanceReportRecord;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReportRecord(CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord prospectCampaignPortfolioManagementPlanInstanceReportRecord) {
    this.prospectCampaignPortfolioManagementPlanInstanceReportRecord = prospectCampaignPortfolioManagementPlanInstanceReportRecord;
  }


  /**
   * Get prospectCampaignPortfolioManagementPlanInstanceAnalysis
   * @return prospectCampaignPortfolioManagementPlanInstanceAnalysis
  **/

  public CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis getProspectCampaignPortfolioManagementPlanInstanceAnalysis() {
    return prospectCampaignPortfolioManagementPlanInstanceAnalysis;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceAnalysis(CRProspectCampaignPortfolioManagementPlanRetrieveOutputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis prospectCampaignPortfolioManagementPlanInstanceAnalysis) {
    this.prospectCampaignPortfolioManagementPlanInstanceAnalysis = prospectCampaignPortfolioManagementPlanInstanceAnalysis;
  }


}

