//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.24 at 02:08:50 PM BST 
//


package com.oracle.xmlns.adf.svc.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjAttrHints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjAttrHints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objHint" type="{http://xmlns.oracle.com/adf/svc/types/}CtrlHint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attrHints" type="{http://xmlns.oracle.com/adf/svc/types/}AttrCtrlHints" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjAttrHints", propOrder = {
    "objHint",
    "attrHints"
})
public class ObjAttrHints {

    protected List<CtrlHint> objHint;
    @XmlElement(required = true)
    protected List<AttrCtrlHints> attrHints;

    /**
     * Gets the value of the objHint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objHint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjHint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtrlHint }
     * 
     * 
     */
    public List<CtrlHint> getObjHint() {
        if (objHint == null) {
            objHint = new ArrayList<CtrlHint>();
        }
        return this.objHint;
    }

    /**
     * Gets the value of the attrHints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrHints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrHints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttrCtrlHints }
     * 
     * 
     */
    public List<AttrCtrlHints> getAttrHints() {
        if (attrHints == null) {
            attrHints = new ArrayList<AttrCtrlHints>();
        }
        return this.attrHints;
    }

}
