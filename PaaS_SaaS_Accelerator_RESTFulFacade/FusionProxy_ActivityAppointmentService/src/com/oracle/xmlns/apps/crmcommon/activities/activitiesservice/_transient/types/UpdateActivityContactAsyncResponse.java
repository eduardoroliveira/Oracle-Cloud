
package com.oracle.xmlns.apps.crmcommon.activities.activitiesservice._transient.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.activities.activitiesservice.ActivityContact;


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
 *         &lt;element name="result" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}ActivityContact"/>
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
    "result"
})
@XmlRootElement(name = "updateActivityContactAsyncResponse")
public class UpdateActivityContactAsyncResponse {

    @XmlElement(required = true)
    protected ActivityContact result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityContact }
     *     
     */
    public ActivityContact getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityContact }
     *     
     */
    public void setResult(ActivityContact value) {
        this.result = value;
    }

}
