
package com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.adf.svc.types.ProcessControl;
import com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.InteractionAssociation;


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
 *         &lt;element name="changeOperation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="interactionAssociationWS" type="{http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/}InteractionAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processControl" type="{http://xmlns.oracle.com/adf/svc/types/}ProcessControl"/>
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
    "changeOperation",
    "interactionAssociationWS",
    "processControl"
})
@XmlRootElement(name = "processInteractionAssociation")
public class ProcessInteractionAssociation {

    @XmlElement(required = true)
    protected String changeOperation;
    protected List<InteractionAssociation> interactionAssociationWS;
    @XmlElement(required = true)
    protected ProcessControl processControl;

    /**
     * Gets the value of the changeOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeOperation() {
        return changeOperation;
    }

    /**
     * Sets the value of the changeOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeOperation(String value) {
        this.changeOperation = value;
    }

    /**
     * Gets the value of the interactionAssociationWS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactionAssociationWS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractionAssociationWS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractionAssociation }
     * 
     * 
     */
    public List<InteractionAssociation> getInteractionAssociationWS() {
        if (interactionAssociationWS == null) {
            interactionAssociationWS = new ArrayList<InteractionAssociation>();
        }
        return this.interactionAssociationWS;
    }

    /**
     * Gets the value of the processControl property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessControl }
     *     
     */
    public ProcessControl getProcessControl() {
        return processControl;
    }

    /**
     * Sets the value of the processControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessControl }
     *     
     */
    public void setProcessControl(ProcessControl value) {
        this.processControl = value;
    }

}
