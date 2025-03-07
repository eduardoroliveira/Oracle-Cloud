
package com.oracle.xmlns.apps.cdm.foundation.parties.flex.location;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.cdm.foundation.parties.flex.location package. 
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

    private final static QName _LocationInformation_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/location/", "locationInformation");
    private final static QName _LocationInformationFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/location/", "__FLEX_Context");
    private final static QName _LocationInformationFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/location/", "_FLEX_NumOfSegments");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.cdm.foundation.parties.flex.location
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LocationInformation }
     * 
     */
    public LocationInformation createLocationInformation() {
        return new LocationInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationInformation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/location/", name = "locationInformation")
    public JAXBElement<LocationInformation> createLocationInformation(LocationInformation value) {
        return new JAXBElement<LocationInformation>(_LocationInformation_QNAME, LocationInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/location/", name = "__FLEX_Context", scope = LocationInformation.class)
    public JAXBElement<String> createLocationInformationFLEXContext(String value) {
        return new JAXBElement<String>(_LocationInformationFLEXContext_QNAME, String.class, LocationInformation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/location/", name = "_FLEX_NumOfSegments", scope = LocationInformation.class)
    public JAXBElement<Integer> createLocationInformationFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_LocationInformationFLEXNumOfSegments_QNAME, Integer.class, LocationInformation.class, value);
    }

}
