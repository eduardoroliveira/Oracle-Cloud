
package com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice;

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
 * generated in the com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice package. 
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

    private final static QName _MklLeadTcMembersAddress1_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "Address1");
    private final static QName _MklLeadTcMembersState_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "State");
    private final static QName _MklLeadTcMembersPhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PhoneCountryCode");
    private final static QName _MklLeadTcMembersPersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PersonFirstName");
    private final static QName _MklLeadTcMembersAddress2_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "Address2");
    private final static QName _MklLeadTcMembersPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PostalCode");
    private final static QName _MklLeadTcMembersPrimaryPhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PrimaryPhoneAreaCode");
    private final static QName _MklLeadTcMembersJobTitle_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "JobTitle");
    private final static QName _MklLeadTcMembersPersonTitle_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PersonTitle");
    private final static QName _MklLeadTcMembersPartyUsageCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PartyUsageCode");
    private final static QName _MklLeadTcMembersEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "EmailAddress");
    private final static QName _MklLeadTcMembersPrimaryPhoneCountryCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PrimaryPhoneCountryCode");
    private final static QName _MklLeadTcMembersPhoneAreaCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PhoneAreaCode");
    private final static QName _MklLeadTcMembersRole_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "Role");
    private final static QName _MklLeadTcMembersLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "LastUpdateLogin");
    private final static QName _MklLeadTcMembersPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PartyId");
    private final static QName _MklLeadTcMembersPrimaryFlag_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PrimaryFlag");
    private final static QName _MklLeadTcMembersContactNumber_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "ContactNumber");
    private final static QName _MklLeadTcMembersPrimaryPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PrimaryPhoneNumber");
    private final static QName _MklLeadTcMembersRelationshipEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "RelationshipEndDate");
    private final static QName _MklLeadTcMembersCity_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "City");
    private final static QName _MklLeadTcMembersFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "FormattedPhoneNumber");
    private final static QName _MklLeadTcMembersPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PhoneNumber");
    private final static QName _MklLeadTcMembersPersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PersonLastName");
    private final static QName _MklLeadTcMembers_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "mklLeadTcMembers");
    private final static QName _MklProdAssoc_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "mklProdAssoc");
    private final static QName _MklLeadResources_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "mklLeadResources");
    private final static QName _MklLeadResourcesPrimaryPhonePurpose_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "PrimaryPhonePurpose");
    private final static QName _MklLeadResourcesOrgTreeStructureCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "OrgTreeStructureCode");
    private final static QName _MklLeadResourcesOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "OrgTreeCode");
    private final static QName _MklLeadResourcesFunctionalRole_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "FunctionalRole");
    private final static QName _MklLeadResourcesManagerPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "ManagerPartyId");
    private final static QName _MklLeadResourcesResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "ResourceOrgId");
    private final static QName _MklLeadResourcesOrgTreeVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "OrgTreeVersionId");
    private final static QName _MklProdAssocProductType_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "ProductType");
    private final static QName _MklProdAssocLongDescription_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "LongDescription");
    private final static QName _MklProdAssocEstimatedUnitPrice_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "EstimatedUnitPrice");
    private final static QName _MklProdAssocAverageTimeToClose_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "AverageTimeToClose");
    private final static QName _MklProdAssocUOMCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "UOMCode");
    private final static QName _MklProdAssocProductName_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "ProductName");
    private final static QName _MklProdAssocProductGroupId_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "ProductGroupId");
    private final static QName _MklProdAssocDescription_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "Description");
    private final static QName _MklProdAssocAmount_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "Amount");
    private final static QName _MklProdAssocInventoryItemId_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "InventoryItemId");
    private final static QName _MklProdAssocOrganizationId_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "OrganizationId");
    private final static QName _MklProdAssocCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", "CurrencyCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MklLeadTcMembers }
     * 
     */
    public MklLeadTcMembers createMklLeadTcMembers() {
        return new MklLeadTcMembers();
    }

    /**
     * Create an instance of {@link MklProdAssoc }
     * 
     */
    public MklProdAssoc createMklProdAssoc() {
        return new MklProdAssoc();
    }

    /**
     * Create an instance of {@link MklLeadResources }
     * 
     */
    public MklLeadResources createMklLeadResources() {
        return new MklLeadResources();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "Address1", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersAddress1(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersAddress1_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "State", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersState(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersState_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PhoneCountryCode", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPhoneCountryCode(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPhoneCountryCode_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PersonFirstName", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPersonFirstName(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPersonFirstName_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "Address2", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersAddress2(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersAddress2_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PostalCode", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPostalCode(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPostalCode_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryPhoneAreaCode", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPrimaryPhoneAreaCode(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPrimaryPhoneAreaCode_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "JobTitle", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersJobTitle(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersJobTitle_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PersonTitle", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPersonTitle(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPersonTitle_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PartyUsageCode", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPartyUsageCode(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPartyUsageCode_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "EmailAddress", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersEmailAddress(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersEmailAddress_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryPhoneCountryCode", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPrimaryPhoneCountryCode(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPrimaryPhoneCountryCode_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PhoneAreaCode", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPhoneAreaCode(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPhoneAreaCode_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "Role", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersRole(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersRole_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "LastUpdateLogin", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersLastUpdateLogin(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersLastUpdateLogin_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PartyId", scope = MklLeadTcMembers.class)
    public JAXBElement<Long> createMklLeadTcMembersPartyId(Long value) {
        return new JAXBElement<Long>(_MklLeadTcMembersPartyId_QNAME, Long.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryFlag", scope = MklLeadTcMembers.class)
    public JAXBElement<Boolean> createMklLeadTcMembersPrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MklLeadTcMembersPrimaryFlag_QNAME, Boolean.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "ContactNumber", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersContactNumber(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersContactNumber_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryPhoneNumber", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPrimaryPhoneNumber(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPrimaryPhoneNumber_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "RelationshipEndDate", scope = MklLeadTcMembers.class)
    public JAXBElement<XMLGregorianCalendar> createMklLeadTcMembersRelationshipEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MklLeadTcMembersRelationshipEndDate_QNAME, XMLGregorianCalendar.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "City", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersCity(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersCity_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "FormattedPhoneNumber", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersFormattedPhoneNumber_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PhoneNumber", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPhoneNumber(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPhoneNumber_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PersonLastName", scope = MklLeadTcMembers.class)
    public JAXBElement<String> createMklLeadTcMembersPersonLastName(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersPersonLastName_QNAME, String.class, MklLeadTcMembers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MklLeadTcMembers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "mklLeadTcMembers")
    public JAXBElement<MklLeadTcMembers> createMklLeadTcMembers(MklLeadTcMembers value) {
        return new JAXBElement<MklLeadTcMembers>(_MklLeadTcMembers_QNAME, MklLeadTcMembers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MklProdAssoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "mklProdAssoc")
    public JAXBElement<MklProdAssoc> createMklProdAssoc(MklProdAssoc value) {
        return new JAXBElement<MklProdAssoc>(_MklProdAssoc_QNAME, MklProdAssoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MklLeadResources }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "mklLeadResources")
    public JAXBElement<MklLeadResources> createMklLeadResources(MklLeadResources value) {
        return new JAXBElement<MklLeadResources>(_MklLeadResources_QNAME, MklLeadResources.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryPhonePurpose", scope = MklLeadResources.class)
    public JAXBElement<String> createMklLeadResourcesPrimaryPhonePurpose(String value) {
        return new JAXBElement<String>(_MklLeadResourcesPrimaryPhonePurpose_QNAME, String.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "OrgTreeStructureCode", scope = MklLeadResources.class)
    public JAXBElement<String> createMklLeadResourcesOrgTreeStructureCode(String value) {
        return new JAXBElement<String>(_MklLeadResourcesOrgTreeStructureCode_QNAME, String.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryFlag", scope = MklLeadResources.class)
    public JAXBElement<Boolean> createMklLeadResourcesPrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MklLeadTcMembersPrimaryFlag_QNAME, Boolean.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "OrgTreeCode", scope = MklLeadResources.class)
    public JAXBElement<String> createMklLeadResourcesOrgTreeCode(String value) {
        return new JAXBElement<String>(_MklLeadResourcesOrgTreeCode_QNAME, String.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "FunctionalRole", scope = MklLeadResources.class)
    public JAXBElement<String> createMklLeadResourcesFunctionalRole(String value) {
        return new JAXBElement<String>(_MklLeadResourcesFunctionalRole_QNAME, String.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "FormattedPhoneNumber", scope = MklLeadResources.class)
    public JAXBElement<String> createMklLeadResourcesFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersFormattedPhoneNumber_QNAME, String.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "ManagerPartyId", scope = MklLeadResources.class)
    public JAXBElement<Long> createMklLeadResourcesManagerPartyId(Long value) {
        return new JAXBElement<Long>(_MklLeadResourcesManagerPartyId_QNAME, Long.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "ResourceOrgId", scope = MklLeadResources.class)
    public JAXBElement<Long> createMklLeadResourcesResourceOrgId(Long value) {
        return new JAXBElement<Long>(_MklLeadResourcesResourceOrgId_QNAME, Long.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "EmailAddress", scope = MklLeadResources.class)
    public JAXBElement<String> createMklLeadResourcesEmailAddress(String value) {
        return new JAXBElement<String>(_MklLeadTcMembersEmailAddress_QNAME, String.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "OrgTreeVersionId", scope = MklLeadResources.class)
    public JAXBElement<String> createMklLeadResourcesOrgTreeVersionId(String value) {
        return new JAXBElement<String>(_MklLeadResourcesOrgTreeVersionId_QNAME, String.class, MklLeadResources.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "ProductType", scope = MklProdAssoc.class)
    public JAXBElement<String> createMklProdAssocProductType(String value) {
        return new JAXBElement<String>(_MklProdAssocProductType_QNAME, String.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "LongDescription", scope = MklProdAssoc.class)
    public JAXBElement<String> createMklProdAssocLongDescription(String value) {
        return new JAXBElement<String>(_MklProdAssocLongDescription_QNAME, String.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "EstimatedUnitPrice", scope = MklProdAssoc.class)
    public JAXBElement<AmountType> createMklProdAssocEstimatedUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_MklProdAssocEstimatedUnitPrice_QNAME, AmountType.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "AverageTimeToClose", scope = MklProdAssoc.class)
    public JAXBElement<BigDecimal> createMklProdAssocAverageTimeToClose(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MklProdAssocAverageTimeToClose_QNAME, BigDecimal.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "UOMCode", scope = MklProdAssoc.class)
    public JAXBElement<String> createMklProdAssocUOMCode(String value) {
        return new JAXBElement<String>(_MklProdAssocUOMCode_QNAME, String.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "ProductName", scope = MklProdAssoc.class)
    public JAXBElement<String> createMklProdAssocProductName(String value) {
        return new JAXBElement<String>(_MklProdAssocProductName_QNAME, String.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "ProductGroupId", scope = MklProdAssoc.class)
    public JAXBElement<Long> createMklProdAssocProductGroupId(Long value) {
        return new JAXBElement<Long>(_MklProdAssocProductGroupId_QNAME, Long.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "PrimaryFlag", scope = MklProdAssoc.class)
    public JAXBElement<Boolean> createMklProdAssocPrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_MklLeadTcMembersPrimaryFlag_QNAME, Boolean.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "Description", scope = MklProdAssoc.class)
    public JAXBElement<String> createMklProdAssocDescription(String value) {
        return new JAXBElement<String>(_MklProdAssocDescription_QNAME, String.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "Amount", scope = MklProdAssoc.class)
    public JAXBElement<AmountType> createMklProdAssocAmount(AmountType value) {
        return new JAXBElement<AmountType>(_MklProdAssocAmount_QNAME, AmountType.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "InventoryItemId", scope = MklProdAssoc.class)
    public JAXBElement<Long> createMklProdAssocInventoryItemId(Long value) {
        return new JAXBElement<Long>(_MklProdAssocInventoryItemId_QNAME, Long.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "OrganizationId", scope = MklProdAssoc.class)
    public JAXBElement<Long> createMklProdAssocOrganizationId(Long value) {
        return new JAXBElement<Long>(_MklProdAssocOrganizationId_QNAME, Long.class, MklProdAssoc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/marketing/leadMgmt/leads/leadService/", name = "CurrencyCode", scope = MklProdAssoc.class)
    public JAXBElement<String> createMklProdAssocCurrencyCode(String value) {
        return new JAXBElement<String>(_MklProdAssocCurrencyCode_QNAME, String.class, MklProdAssoc.class, value);
    }

}
