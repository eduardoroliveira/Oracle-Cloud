
package com.oracle.ptsdemo.healthcare.wsclient.osc.person.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationContactInformation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OrganizationContactInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="__FLEX_Context" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="_FLEX_NumOfSegments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationContactInformation", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", propOrder = {
    "orgContactId",
    "flexContext",
    "flexNumOfSegments"
})
public class OrganizationContactInformation {

    @XmlElement(name = "OrgContactId")
    protected Long orgContactId;
    @XmlElementRef(name = "__FLEX_Context", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", type = JAXBElement.class)
    protected JAXBElement<String> flexContext;
    @XmlElementRef(name = "_FLEX_NumOfSegments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/orgContact/", type = JAXBElement.class)
    protected JAXBElement<Integer> flexNumOfSegments;

    /**
     * Gets the value of the orgContactId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrgContactId() {
        return orgContactId;
    }

    /**
     * Sets the value of the orgContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrgContactId(Long value) {
        this.orgContactId = value;
    }

    /**
     * Gets the value of the flexContext property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFLEXContext() {
        return flexContext;
    }

    /**
     * Sets the value of the flexContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFLEXContext(JAXBElement<String> value) {
        this.flexContext = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the flexNumOfSegments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getFLEXNumOfSegments() {
        return flexNumOfSegments;
    }

    /**
     * Sets the value of the flexNumOfSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setFLEXNumOfSegments(JAXBElement<Integer> value) {
        this.flexNumOfSegments = ((JAXBElement<Integer> ) value);
    }

}
