
package com.oracle.xmlns.apps.crmcommon.interactions.interactionservice.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.oracle.xmlns.apps.crmcommon.objects.objectsservice.CommonAttachments;


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
 *         &lt;element name="attachmentVORows" type="{http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/}CommonAttachments" maxOccurs="unbounded" minOccurs="0"/>
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
    "attachmentVORows"
})
@XmlRootElement(name = "createInteractionAttachmentAsync")
public class CreateInteractionAttachmentAsync {

    protected List<CommonAttachments> attachmentVORows;

    /**
     * Gets the value of the attachmentVORows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachmentVORows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachmentVORows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonAttachments }
     * 
     * 
     */
    public List<CommonAttachments> getAttachmentVORows() {
        if (attachmentVORows == null) {
            attachmentVORows = new ArrayList<CommonAttachments>();
        }
        return this.attachmentVORows;
    }

}
