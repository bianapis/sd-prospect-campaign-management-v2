package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis;
import org.bian.dto.CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanRetrieveInputModel
 */
public class CRProspectCampaignPortfolioManagementPlanRetrieveInputModel   {
  private Object prospectCampaignPortfolioManagementPlanRetrieveActionTaskRecord = null;

  private String prospectCampaignPortfolioManagementPlanRetrieveActionRequest = null;

  private CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord prospectCampaignPortfolioManagementPlanInstanceReportRecord = null;

  private CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis prospectCampaignPortfolioManagementPlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return prospectCampaignPortfolioManagementPlanRetrieveActionRequest
  **/

  public String getProspectCampaignPortfolioManagementPlanRetrieveActionRequest() {
    return prospectCampaignPortfolioManagementPlanRetrieveActionRequest;
  }

  public void setProspectCampaignPortfolioManagementPlanRetrieveActionRequest(String prospectCampaignPortfolioManagementPlanRetrieveActionRequest) {
    this.prospectCampaignPortfolioManagementPlanRetrieveActionRequest = prospectCampaignPortfolioManagementPlanRetrieveActionRequest;
  }


  /**
   * Get prospectCampaignPortfolioManagementPlanInstanceReportRecord
   * @return prospectCampaignPortfolioManagementPlanInstanceReportRecord
  **/

  public CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord getProspectCampaignPortfolioManagementPlanInstanceReportRecord() {
    return prospectCampaignPortfolioManagementPlanInstanceReportRecord;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceReportRecord(CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceReportRecord prospectCampaignPortfolioManagementPlanInstanceReportRecord) {
    this.prospectCampaignPortfolioManagementPlanInstanceReportRecord = prospectCampaignPortfolioManagementPlanInstanceReportRecord;
  }


  /**
   * Get prospectCampaignPortfolioManagementPlanInstanceAnalysis
   * @return prospectCampaignPortfolioManagementPlanInstanceAnalysis
  **/

  public CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis getProspectCampaignPortfolioManagementPlanInstanceAnalysis() {
    return prospectCampaignPortfolioManagementPlanInstanceAnalysis;
  }

  public void setProspectCampaignPortfolioManagementPlanInstanceAnalysis(CRProspectCampaignPortfolioManagementPlanRetrieveInputModelProspectCampaignPortfolioManagementPlanInstanceAnalysis prospectCampaignPortfolioManagementPlanInstanceAnalysis) {
    this.prospectCampaignPortfolioManagementPlanInstanceAnalysis = prospectCampaignPortfolioManagementPlanInstanceAnalysis;
  }


}

