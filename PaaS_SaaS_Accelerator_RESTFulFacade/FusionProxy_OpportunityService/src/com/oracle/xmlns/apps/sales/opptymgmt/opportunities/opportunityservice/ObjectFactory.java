
package com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.oracle.xmlns.adf.svc.types.AmountType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OpportunityReference_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityReference");
    private final static QName _OpportunitySource_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunitySource");
    private final static QName _OpportunityLead_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityLead");
    private final static QName _OpportunityResponse_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityResponse");
    private final static QName _OpportunityCompetitor_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityCompetitor");
    private final static QName _Opportunity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunity");
    private final static QName _OpportunityContact_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityContact");
    private final static QName _OpportunityResource_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityResource");
    private final static QName _OpportunityCompetitorPartyUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartyUniqueName");
    private final static QName _OpportunityCompetitorThreatLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ThreatLevelCode");
    private final static QName _OpportunityCompetitorRevnAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevnAmount");
    private final static QName _OpportunityCompetitorPrimaryFlg_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryFlg");
    private final static QName _OpportunityCompetitorPartyUniqueName1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartyUniqueName1");
    private final static QName _OpportunityCompetitorComments_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comments");
    private final static QName _OpportunityCompetitorAnnualRevenueAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AnnualRevenueAmount");
    private final static QName _OpportunityCompetitorWinProb_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "WinProb");
    private final static QName _OpportunityCompetitorEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EffectiveDate");
    private final static QName _OpportunityLeadPrDealPartOrgPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrDealPartOrgPartyId");
    private final static QName _OpportunityLeadLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdateLogin");
    private final static QName _OpportunityLeadRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RegistrationNumber");
    private final static QName _OpportunityLeadPartnerTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartnerTypeCd");
    private final static QName _OpportunityLeadDealPartProgramId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealPartProgramId");
    private final static QName _OpportunityLeadUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UserLastUpdateDate");
    private final static QName _OpportunityLeadDealExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealExpirationDate");
    private final static QName _OpportunityLeadPrDealPartResourcePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrDealPartResourcePartyId");
    private final static QName _OpportunityLeadDealEstimatedCloseDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealEstimatedCloseDate");
    private final static QName _OpportunityLeadDealType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealType");
    private final static QName _OpportunityResourceOwnerFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OwnerFlag");
    private final static QName _OpportunityResourceAsgnTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AsgnTerritoryVersionId");
    private final static QName _OpportunityResourcePersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PersonFirstName");
    private final static QName _OpportunityResourceRoleName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RoleName");
    private final static QName _OpportunityResourcePartnerOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartnerOrgId");
    private final static QName _OpportunityResourceOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OrgTreeCode");
    private final static QName _OpportunityResourceMemberFunctionCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MemberFunctionCode");
    private final static QName _OpportunityResourceDealProtected_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealProtected");
    private final static QName _OpportunityResourceResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ResourceOrgId");
    private final static QName _OpportunityResourceEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmailAddress");
    private final static QName _OpportunityResourceOrgTreeStructureCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OrgTreeStructureCode");
    private final static QName _OpportunityResourceAccessLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AccessLevelCode");
    private final static QName _OpportunityResourceMgrResourceId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MgrResourceId");
    private final static QName _OpportunityResourceLockAssignmentFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LockAssignmentFlag");
    private final static QName _OpportunityResourceFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedPhoneNumber");
    private final static QName _OpportunityResourceDealProtectedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealProtectedDate");
    private final static QName _OpportunityResourceAssignmentType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AssignmentType");
    private final static QName _OpportunityResourcePersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PersonLastName");
    private final static QName _OpportunityReferenceCustomerContactRelationId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CustomerContactRelationId");
    private final static QName _OpportunityReferenceComments1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comments1");
    private final static QName _OpportunityReferenceDUNSNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DUNSNumberC");
    private final static QName _OpportunityReferenceIntContactPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "IntContactPartyId");
    private final static QName _OpportunityReferenceReferenceRankNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ReferenceRankNumber");
    private final static QName _OpportunityContactFormattedMultilineAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedMultilineAddress");
    private final static QName _OpportunityContactSalesAffinityCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesAffinityCode");
    private final static QName _OpportunityContactJobTitle_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobTitle");
    private final static QName _OpportunityContactContactedFlg_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContactedFlg");
    private final static QName _OpportunityContactAffinityLvlCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AffinityLvlCd");
    private final static QName _OpportunityContactSalesBuyingRoleCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesBuyingRoleCode");
    private final static QName _OpportunityContactEmailPreferenceExistsFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmailPreferenceExistsFlag");
    private final static QName _OpportunityContactPreferredContactMethod_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PreferredContactMethod");
    private final static QName _OpportunityContactRawPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RawPhoneNumber");
    private final static QName _OpportunityContactTargetPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TargetPartyId");
    private final static QName _OpportunityContactFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedAddress");
    private final static QName _OpportunityContactInfluenceLvlCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "InfluenceLvlCd");
    private final static QName _OpportunityContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RelationshipId");
    private final static QName _OpportunityContactSalesInfluenceLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesInfluenceLevelCode");
    private final static QName _OpportunityContactPhonePreferenceExistsFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PhonePreferenceExistsFlag");
    private final static QName _OpportunityContactRoleCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RoleCd");
    private final static QName _OpportunityOpportunityName2C_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityName2_c");
    private final static QName _OpportunityDUNSNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DUNSNumber");
    private final static QName _OpportunityConsumerLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConsumerLastName");
    private final static QName _OpportunityDecisionLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DecisionLevelCode");
    private final static QName _OpportunityDescriptionText_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DescriptionText");
    private final static QName _OpportunitySalesMethod_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesMethod");
    private final static QName _OpportunityPrimaryCompetitorId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryCompetitorId");
    private final static QName _OpportunityCrmRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CrmRevenue");
    private final static QName _OpportunityStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StatusCode");
    private final static QName _OpportunityPrimaryOrganizationId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryOrganizationId");
    private final static QName _OpportunitySalesStageId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesStageId");
    private final static QName _OpportunityPreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PreferredFunctionalCurrency");
    private final static QName _OpportunityPrimaryRevenueId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryRevenueId");
    private final static QName _OpportunityRevenueType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevenueType");
    private final static QName _OpportunityPrimaryContactEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactEmailAddress");
    private final static QName _OpportunityBdgtAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BdgtAmount");
    private final static QName _OpportunityPrimaryContactFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactFirstName");
    private final static QName _OpportunityRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Revenue");
    private final static QName _OpportunityOptyCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyCreationDate");
    private final static QName _OpportunityBudgetedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BudgetedFlag");
    private final static QName _OpportunityAccountNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AccountNumber");
    private final static QName _OpportunityCustomerAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CustomerAccountId");
    private final static QName _OpportunityRiskLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RiskLevelCode");
    private final static QName _OpportunityCrmConversionRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CrmConversionRate");
    private final static QName _OpportunityAverageDaysAtStage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AverageDaysAtStage");
    private final static QName _OpportunityPrConRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrConRelationshipId");
    private final static QName _OpportunityStrategicLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StrategicLevelCode");
    private final static QName _OpportunityUpsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UpsideAmount");
    private final static QName _OpportunityLastAssignedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastAssignedDate");
    private final static QName _OpportunityPrimaryContactFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactFormattedPhoneNumber");
    private final static QName _OpportunityEmployeesTotal_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmployeesTotal");
    private final static QName _OpportunityLookupCategory_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LookupCategory");
    private final static QName _OpportunityConsumerFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConsumerFirstName");
    private final static QName _OpportunityOptyLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyLastUpdateDate");
    private final static QName _OpportunityPrSrcNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrSrcNumber");
    private final static QName _OpportunityKeyContactId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "KeyContactId");
    private final static QName _OpportunityReasonWonLostCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ReasonWonLostCode");
    private final static QName _OpportunitySalesMethodId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesMethodId");
    private final static QName _OpportunityState_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "State");
    private final static QName _OpportunityCurrentFyPotentialRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurrentFyPotentialRevenue");
    private final static QName _OpportunityPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PostalCode");
    private final static QName _OpportunityRcmndWinProb_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RcmndWinProb");
    private final static QName _OpportunityDealHorizonCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealHorizonCode");
    private final static QName _OpportunitySalesChannelCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesChannelCd");
    private final static QName _OpportunityLineOfBusinessCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LineOfBusinessCode");
    private final static QName _OpportunityOptyLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyLastUpdatedBy");
    private final static QName _OpportunityStageStatusCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StageStatusCd");
    private final static QName _OpportunityDescription_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Description");
    private final static QName _OpportunityDownsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DownsideAmount");
    private final static QName _OpportunityExpectAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExpectAmount");
    private final static QName _OpportunityMaximumDaysInStage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MaximumDaysInStage");
    private final static QName _OpportunityBudgetAvailableDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BudgetAvailableDate");
    private final static QName _OpportunityCity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "City");
    private final static QName _OpportunityRevnLineSetEnabledFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevnLineSetEnabledFlag");
    private final static QName _OpportunityPrimaryContactLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactLastName");
    private final static QName _OpportunityOptyCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyCreatedBy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.sales.opptymgmt.opportunities.opportunityservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OpportunityContact }
     * 
     */
    public OpportunityContact createOpportunityContact() {
        return new OpportunityContact();
    }

    /**
     * Create an instance of {@link Opportunity }
     * 
     */
    public Opportunity createOpportunity() {
        return new Opportunity();
    }

    /**
     * Create an instance of {@link OpportunityResponse }
     * 
     */
    public OpportunityResponse createOpportunityResponse() {
        return new OpportunityResponse();
    }

    /**
     * Create an instance of {@link OpportunityLead }
     * 
     */
    public OpportunityLead createOpportunityLead() {
        return new OpportunityLead();
    }

    /**
     * Create an instance of {@link OpportunityReference }
     * 
     */
    public OpportunityReference createOpportunityReference() {
        return new OpportunityReference();
    }

    /**
     * Create an instance of {@link OpportunityCompetitor }
     * 
     */
    public OpportunityCompetitor createOpportunityCompetitor() {
        return new OpportunityCompetitor();
    }

    /**
     * Create an instance of {@link OpportunitySource }
     * 
     */
    public OpportunitySource createOpportunitySource() {
        return new OpportunitySource();
    }

    /**
     * Create an instance of {@link OpportunityResource }
     * 
     */
    public OpportunityResource createOpportunityResource() {
        return new OpportunityResource();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityReference")
    public JAXBElement<OpportunityReference> createOpportunityReference(OpportunityReference value) {
        return new JAXBElement<OpportunityReference>(_OpportunityReference_QNAME, OpportunityReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunitySource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunitySource")
    public JAXBElement<OpportunitySource> createOpportunitySource(OpportunitySource value) {
        return new JAXBElement<OpportunitySource>(_OpportunitySource_QNAME, OpportunitySource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityLead")
    public JAXBElement<OpportunityLead> createOpportunityLead(OpportunityLead value) {
        return new JAXBElement<OpportunityLead>(_OpportunityLead_QNAME, OpportunityLead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityResponse")
    public JAXBElement<OpportunityResponse> createOpportunityResponse(OpportunityResponse value) {
        return new JAXBElement<OpportunityResponse>(_OpportunityResponse_QNAME, OpportunityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityCompetitor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityCompetitor")
    public JAXBElement<OpportunityCompetitor> createOpportunityCompetitor(OpportunityCompetitor value) {
        return new JAXBElement<OpportunityCompetitor>(_OpportunityCompetitor_QNAME, OpportunityCompetitor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Opportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunity")
    public JAXBElement<Opportunity> createOpportunity(Opportunity value) {
        return new JAXBElement<Opportunity>(_Opportunity_QNAME, Opportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityContact")
    public JAXBElement<OpportunityContact> createOpportunityContact(OpportunityContact value) {
        return new JAXBElement<OpportunityContact>(_OpportunityContact_QNAME, OpportunityContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityResource")
    public JAXBElement<OpportunityResource> createOpportunityResource(OpportunityResource value) {
        return new JAXBElement<OpportunityResource>(_OpportunityResource_QNAME, OpportunityResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPartyUniqueName_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ThreatLevelCode", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorThreatLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorThreatLevelCode_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnAmount", scope = OpportunityCompetitor.class)
    public JAXBElement<AmountType> createOpportunityCompetitorRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityCompetitorRevnAmount_QNAME, AmountType.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryFlg", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPrimaryFlg(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPrimaryFlg_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPartyUniqueName1_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorComments(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorComments_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AnnualRevenueAmount", scope = OpportunityCompetitor.class)
    public JAXBElement<AmountType> createOpportunityCompetitorAnnualRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityCompetitorAnnualRevenueAmount_QNAME, AmountType.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = OpportunityCompetitor.class)
    public JAXBElement<BigDecimal> createOpportunityCompetitorWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCompetitorWinProb_QNAME, BigDecimal.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = OpportunityCompetitor.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityCompetitorEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityCompetitorEffectiveDate_QNAME, XMLGregorianCalendar.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrDealPartOrgPartyId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadPrDealPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadPrDealPartOrgPartyId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityLeadLastUpdateLogin_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RegistrationNumber", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadRegistrationNumber(String value) {
        return new JAXBElement<String>(_OpportunityLeadRegistrationNumber_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartnerTypeCd", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadPartnerTypeCd(String value) {
        return new JAXBElement<String>(_OpportunityLeadPartnerTypeCd_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealPartProgramId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadDealPartProgramId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadDealPartProgramId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealExpirationDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadDealExpirationDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrDealPartResourcePartyId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadPrDealPartResourcePartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadPrDealPartResourcePartyId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealEstimatedCloseDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadDealEstimatedCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadDealEstimatedCloseDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealType", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadDealType(String value) {
        return new JAXBElement<String>(_OpportunityLeadDealType_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityResponse.class)
    public JAXBElement<String> createOpportunityResponseLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityLeadLastUpdateLogin_QNAME, String.class, OpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityResponse.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResponseUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OwnerFlag", scope = OpportunityResource.class)
    public JAXBElement<Boolean> createOpportunityResourceOwnerFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityResourceOwnerFlag_QNAME, Boolean.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AsgnTerritoryVersionId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourceAsgnTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourceAsgnTerritoryVersionId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PersonFirstName", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourcePersonFirstName(String value) {
        return new JAXBElement<String>(_OpportunityResourcePersonFirstName_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RoleName", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceRoleName(String value) {
        return new JAXBElement<String>(_OpportunityResourceRoleName_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartnerOrgId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourcePartnerOrgId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourcePartnerOrgId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OrgTreeCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceOrgTreeCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceOrgTreeCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MemberFunctionCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceMemberFunctionCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceMemberFunctionCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealExpirationDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadDealExpirationDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealProtected", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceDealProtected(String value) {
        return new JAXBElement<String>(_OpportunityResourceDealProtected_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ResourceOrgId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourceResourceOrgId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourceResourceOrgId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityLeadLastUpdateLogin_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OrgTreeStructureCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceOrgTreeStructureCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceOrgTreeStructureCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AccessLevelCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceAccessLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceAccessLevelCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MgrResourceId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourceMgrResourceId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourceMgrResourceId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LockAssignmentFlag", scope = OpportunityResource.class)
    public JAXBElement<Boolean> createOpportunityResourceLockAssignmentFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityResourceLockAssignmentFlag_QNAME, Boolean.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedPhoneNumber", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityResourceFormattedPhoneNumber_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealProtectedDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceDealProtectedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceDealProtectedDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AssignmentType", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceAssignmentType(String value) {
        return new JAXBElement<String>(_OpportunityResourceAssignmentType_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PersonLastName", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourcePersonLastName(String value) {
        return new JAXBElement<String>(_OpportunityResourcePersonLastName_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnAmount", scope = OpportunityReference.class)
    public JAXBElement<AmountType> createOpportunityReferenceRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityCompetitorRevnAmount_QNAME, AmountType.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CustomerContactRelationId", scope = OpportunityReference.class)
    public JAXBElement<Long> createOpportunityReferenceCustomerContactRelationId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceCustomerContactRelationId_QNAME, Long.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferencePartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPartyUniqueName1_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments1", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceComments1(String value) {
        return new JAXBElement<String>(_OpportunityReferenceComments1_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityReference.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityReferenceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = OpportunityReference.class)
    public JAXBElement<BigDecimal> createOpportunityReferenceWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCompetitorWinProb_QNAME, BigDecimal.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DUNSNumberC", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceDUNSNumberC(String value) {
        return new JAXBElement<String>(_OpportunityReferenceDUNSNumberC_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferencePartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPartyUniqueName_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityLeadLastUpdateLogin_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IntContactPartyId", scope = OpportunityReference.class)
    public JAXBElement<Long> createOpportunityReferenceIntContactPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceIntContactPartyId_QNAME, Long.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ReferenceRankNumber", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceReferenceRankNumber(String value) {
        return new JAXBElement<String>(_OpportunityReferenceReferenceRankNumber_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceComments(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorComments_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = OpportunityReference.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityReferenceEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityCompetitorEffectiveDate_QNAME, XMLGregorianCalendar.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryFlg", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPrimaryFlg(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPrimaryFlg_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedMultilineAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedMultilineAddress(String value) {
        return new JAXBElement<String>(_OpportunityContactFormattedMultilineAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityContact.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityContactUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAffinityCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesAffinityCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesAffinityCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobTitle", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactJobTitle(String value) {
        return new JAXBElement<String>(_OpportunityContactJobTitle_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContactedFlg", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactContactedFlg(String value) {
        return new JAXBElement<String>(_OpportunityContactContactedFlg_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AffinityLvlCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactAffinityLvlCd(String value) {
        return new JAXBElement<String>(_OpportunityContactAffinityLvlCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPartyUniqueName_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesBuyingRoleCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesBuyingRoleCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesBuyingRoleCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailPreferenceExistsFlag", scope = OpportunityContact.class)
    public JAXBElement<Boolean> createOpportunityContactEmailPreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityContactEmailPreferenceExistsFlag_QNAME, Boolean.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityLeadLastUpdateLogin_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PreferredContactMethod", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPreferredContactMethod(String value) {
        return new JAXBElement<String>(_OpportunityContactPreferredContactMethod_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactComments(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorComments_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedPhoneNumber", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityResourceFormattedPhoneNumber_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RawPhoneNumber", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactRawPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityContactRawPhoneNumber_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TargetPartyId", scope = OpportunityContact.class)
    public JAXBElement<Long> createOpportunityContactTargetPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityContactTargetPartyId_QNAME, Long.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedAddress(String value) {
        return new JAXBElement<String>(_OpportunityContactFormattedAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "InfluenceLvlCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactInfluenceLvlCd(String value) {
        return new JAXBElement<String>(_OpportunityContactInfluenceLvlCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RelationshipId", scope = OpportunityContact.class)
    public JAXBElement<Long> createOpportunityContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_OpportunityContactRelationshipId_QNAME, Long.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesInfluenceLevelCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesInfluenceLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesInfluenceLevelCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PhonePreferenceExistsFlag", scope = OpportunityContact.class)
    public JAXBElement<Boolean> createOpportunityContactPhonePreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityContactPhonePreferenceExistsFlag_QNAME, Boolean.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RoleCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactRoleCd(String value) {
        return new JAXBElement<String>(_OpportunityContactRoleCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunitySource.class)
    public JAXBElement<String> createOpportunitySourceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityLeadLastUpdateLogin_QNAME, String.class, OpportunitySource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunitySource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunitySourceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunitySource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityName2_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOpportunityName2C(String value) {
        return new JAXBElement<String>(_OpportunityOpportunityName2C_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DUNSNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDUNSNumber(String value) {
        return new JAXBElement<String>(_OpportunityDUNSNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConsumerLastName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConsumerLastName(String value) {
        return new JAXBElement<String>(_OpportunityConsumerLastName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DecisionLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDecisionLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityDecisionLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DescriptionText", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDescriptionText(String value) {
        return new JAXBElement<String>(_OpportunityDescriptionText_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesMethod", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySalesMethod(String value) {
        return new JAXBElement<String>(_OpportunitySalesMethod_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryCompetitorId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrimaryCompetitorId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrimaryCompetitorId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CrmRevenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCrmRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCrmRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StatusCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStatusCode(String value) {
        return new JAXBElement<String>(_OpportunityStatusCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryOrganizationId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrimaryOrganizationId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrimaryOrganizationId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesStageId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunitySalesStageId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesStageId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PreferredFunctionalCurrency", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_OpportunityPreferredFunctionalCurrency_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityCompetitorEffectiveDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryRevenueId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrimaryRevenueId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrimaryRevenueId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPartyUniqueName1_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevenueType", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRevenueType(String value) {
        return new JAXBElement<String>(_OpportunityRevenueType_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactEmailAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactEmailAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BdgtAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityBdgtAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityBdgtAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactFirstName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactFirstName(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactFirstName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Revenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCompetitorWinProb_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyCreationDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityOptyCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityOptyCreationDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BudgetedFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityBudgetedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityBudgetedFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AccountNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityAccountNumber(String value) {
        return new JAXBElement<String>(_OpportunityAccountNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CustomerAccountId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunityCustomerAccountId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityComments(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorComments_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RiskLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRiskLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityRiskLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TargetPartyId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityTargetPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityContactTargetPartyId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityFormattedAddress(String value) {
        return new JAXBElement<String>(_OpportunityContactFormattedAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CrmConversionRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCrmConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCrmConversionRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AverageDaysAtStage", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityAverageDaysAtStage(Long value) {
        return new JAXBElement<Long>(_OpportunityAverageDaysAtStage_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrConRelationshipId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrConRelationshipId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrConRelationshipId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StrategicLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStrategicLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityStrategicLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UpsideAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityUpsideAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastAssignedDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLastAssignedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLastAssignedDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactFormattedPhoneNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactFormattedPhoneNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmployeesTotal", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityEmployeesTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityEmployeesTotal_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPartyUniqueName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LookupCategory", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLookupCategory(String value) {
        return new JAXBElement<String>(_OpportunityLookupCategory_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConsumerFirstName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConsumerFirstName(String value) {
        return new JAXBElement<String>(_OpportunityConsumerFirstName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyLastUpdateDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityOptyLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityOptyLastUpdateDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrSrcNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrSrcNumber(String value) {
        return new JAXBElement<String>(_OpportunityPrSrcNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "KeyContactId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityKeyContactId(Long value) {
        return new JAXBElement<Long>(_OpportunityKeyContactId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ReasonWonLostCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityReasonWonLostCode(String value) {
        return new JAXBElement<String>(_OpportunityReasonWonLostCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesMethodId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunitySalesMethodId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesMethodId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "State", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityState(String value) {
        return new JAXBElement<String>(_OpportunityState_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrentFyPotentialRevenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCurrentFyPotentialRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCurrentFyPotentialRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PostalCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPostalCode(String value) {
        return new JAXBElement<String>(_OpportunityPostalCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RcmndWinProb", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityRcmndWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityRcmndWinProb_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealHorizonCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDealHorizonCode(String value) {
        return new JAXBElement<String>(_OpportunityDealHorizonCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesChannelCd", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySalesChannelCd(String value) {
        return new JAXBElement<String>(_OpportunitySalesChannelCd_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LineOfBusinessCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLineOfBusinessCode(String value) {
        return new JAXBElement<String>(_OpportunityLineOfBusinessCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyLastUpdatedBy", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOptyLastUpdatedBy(String value) {
        return new JAXBElement<String>(_OpportunityOptyLastUpdatedBy_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityLeadLastUpdateLogin_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StageStatusCd", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStageStatusCd(String value) {
        return new JAXBElement<String>(_OpportunityStageStatusCd_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Description", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDescription(String value) {
        return new JAXBElement<String>(_OpportunityDescription_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DownsideAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityDownsideAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExpectAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityExpectAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MaximumDaysInStage", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityMaximumDaysInStage(Long value) {
        return new JAXBElement<Long>(_OpportunityMaximumDaysInStage_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BudgetAvailableDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityBudgetAvailableDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityBudgetAvailableDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "City", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityCity(String value) {
        return new JAXBElement<String>(_OpportunityCity_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PhonePreferenceExistsFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityPhonePreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityContactPhonePreferenceExistsFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnLineSetEnabledFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityRevnLineSetEnabledFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityRevnLineSetEnabledFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactLastName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactLastName(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactLastName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyCreatedBy", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOptyCreatedBy(String value) {
        return new JAXBElement<String>(_OpportunityOptyCreatedBy_QNAME, String.class, Opportunity.class, value);
    }

}
