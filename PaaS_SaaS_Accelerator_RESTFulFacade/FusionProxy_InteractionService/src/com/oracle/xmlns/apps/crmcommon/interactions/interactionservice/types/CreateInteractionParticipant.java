
package com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.InteractionParticipant;


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
 *         &lt;element name="interactionParticipantWS" type="{http://xmlns.oracle.com/apps/crmCommon/interactions/interactionService/}InteractionParticipant"/>
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
    "interactionParticipantWS"
})
@XmlRootElement(name = "createInteractionParticipant")
public class CreateInteractionParticipant {

    @XmlElement(required = true)
    protected InteractionParticipant interactionParticipantWS;

    /**
     * Gets the value of the interactionParticipantWS property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionParticipant }
     *     
     */
    public InteractionParticipant getInteractionParticipantWS() {
        return interactionParticipantWS;
    }

    /**
     * Sets the value of the interactionParticipantWS property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionParticipant }
     *     
     */
    public void setInteractionParticipantWS(InteractionParticipant value) {
        this.interactionParticipantWS = value;
    }

}
