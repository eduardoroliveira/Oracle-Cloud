//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.24 at 02:07:22 PM BST 
//


package com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="interactionAssociationWS" type="{http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/}InteractionAssociation"/>
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
    "interactionAssociationWS"
})
@XmlRootElement(name = "deleteInteractionAssociation")
public class DeleteInteractionAssociation {

    @XmlElement(required = true)
    protected InteractionAssociation interactionAssociationWS;

    /**
     * Gets the value of the interactionAssociationWS property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionAssociation }
     *     
     */
    public InteractionAssociation getInteractionAssociationWS() {
        return interactionAssociationWS;
    }

    /**
     * Sets the value of the interactionAssociationWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionAssociation }
     *     
     */
    public void setInteractionAssociationWS(InteractionAssociation value) {
        this.interactionAssociationWS = value;
    }

}
