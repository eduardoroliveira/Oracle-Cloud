
package com.oracle.xmlns.apps.marketing.leadmgmt.leads.leadservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leadMemberId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "leadMemberId"
})
@XmlRootElement(name = "getSalesLeadContact")
public class GetSalesLeadContact {

    protected long leadMemberId;

    /**
     * Gets the value of the leadMemberId property.
     * 
     */
    public long getLeadMemberId() {
        return leadMemberId;
    }

    /**
     * Sets the value of the leadMemberId property.
     * 
     */
    public void setLeadMemberId(long value) {
        this.leadMemberId = value;
    }

}
