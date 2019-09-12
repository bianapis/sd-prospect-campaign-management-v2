package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRProspectCampaignPortfolioManagementPlanCreateInputModelProspectCampaignPortfolioProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference
 */
public class CRProspectCampaignPortfolioManagementPlanCreateInputModelProspectCampaignPortfolioProspectCampaignPerformanceRecordProspectCampaignProcedureInstanceReference   {
  private String employeeBusinessUnitReference = null;

  private String prospectCampaignProcedureSetup = null;

  private String prospectCampaignProcedureVersionNumber = null;

  private String prospectCampaignProcedureResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the deployment set-up/configuration of the campaign for reference 
   * @return prospectCampaignProcedureSetup
  **/

  public String getProspectCampaignProcedureSetup() {
    return prospectCampaignProcedureSetup;
  }

  public void setProspectCampaignProcedureSetup(String prospectCampaignProcedureSetup) {
    this.prospectCampaignProcedureSetup = prospectCampaignProcedureSetup;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The prospect campaign version number used in the event 
   * @return prospectCampaignProcedureVersionNumber
  **/

  public String getProspectCampaignProcedureVersionNumber() {
    return prospectCampaignProcedureVersionNumber;
  }

  public void setProspectCampaignProcedureVersionNumber(String prospectCampaignProcedureVersionNumber) {
    this.prospectCampaignProcedureVersionNumber = prospectCampaignProcedureVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result/impact of the overall prospect campaign event (that can include multiple identified prospects) 
   * @return prospectCampaignProcedureResult
  **/

  public String getProspectCampaignProcedureResult() {
    return prospectCampaignProcedureResult;
  }

  public void setProspectCampaignProcedureResult(String prospectCampaignProcedureResult) {
    this.prospectCampaignProcedureResult = prospectCampaignProcedureResult;
  }


}

