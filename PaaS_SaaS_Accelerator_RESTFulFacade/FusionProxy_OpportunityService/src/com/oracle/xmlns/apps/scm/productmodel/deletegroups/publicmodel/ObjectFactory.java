
package com.oracle.xmlns.apps.scm.productmodel.deletegroups.publicmodel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.scm.productmodel.deletegroups.publicmodel package. 
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

    private final static QName _DeleteError_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "deleteError");
    private final static QName _DeleteEntity_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "deleteEntity");
    private final static QName _DeleteEntityDeleteDate_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteDate");
    private final static QName _DeleteEntityEntitySequenceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "EntitySequenceNumber");
    private final static QName _DeleteEntityPk2Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk2Value");
    private final static QName _DeleteEntityPk1Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk1Value");
    private final static QName _DeleteEntityPk5Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk5Value");
    private final static QName _DeleteEntityDeleteStatusType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteStatusType");
    private final static QName _DeleteEntityDeleteEntityType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteEntityType");
    private final static QName _DeleteEntityPk4Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk4Value");
    private final static QName _DeleteEntityPk3Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk3Value");
    private final static QName _DeleteErrorErrorMessage_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ErrorMessage");
    private final static QName _DeleteErrorProgramName_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ProgramName");
    private final static QName _DeleteErrorErrorCode_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ErrorCode");
    private final static QName _DeleteErrorDeleteErrorType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteErrorType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.scm.productmodel.deletegroups.publicmodel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteEntity }
     * 
     */
    public DeleteEntity createDeleteEntity() {
        return new DeleteEntity();
    }

    /**
     * Create an instance of {@link DeleteError }
     * 
     */
    public DeleteError createDeleteError() {
        return new DeleteError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "deleteError")
    public JAXBElement<DeleteError> createDeleteError(DeleteError value) {
        return new JAXBElement<DeleteError>(_DeleteError_QNAME, DeleteError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "deleteEntity")
    public JAXBElement<DeleteEntity> createDeleteEntity(DeleteEntity value) {
        return new JAXBElement<DeleteEntity>(_DeleteEntity_QNAME, DeleteEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteDate", scope = DeleteEntity.class)
    public JAXBElement<XMLGregorianCalendar> createDeleteEntityDeleteDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeleteEntityDeleteDate_QNAME, XMLGregorianCalendar.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "EntitySequenceNumber", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityEntitySequenceNumber(Long value) {
        return new JAXBElement<Long>(_DeleteEntityEntitySequenceNumber_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk2Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk2Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk2Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk1Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk1Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk1Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk5Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk5Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk5Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteStatusType", scope = DeleteEntity.class)
    public JAXBElement<Integer> createDeleteEntityDeleteStatusType(Integer value) {
        return new JAXBElement<Integer>(_DeleteEntityDeleteStatusType_QNAME, Integer.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteEntityType", scope = DeleteEntity.class)
    public JAXBElement<Integer> createDeleteEntityDeleteEntityType(Integer value) {
        return new JAXBElement<Integer>(_DeleteEntityDeleteEntityType_QNAME, Integer.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk4Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk4Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk4Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk3Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk3Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk3Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ErrorMessage", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorErrorMessage(String value) {
        return new JAXBElement<String>(_DeleteErrorErrorMessage_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ProgramName", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorProgramName(String value) {
        return new JAXBElement<String>(_DeleteErrorProgramName_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ErrorCode", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorErrorCode(String value) {
        return new JAXBElement<String>(_DeleteErrorErrorCode_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteErrorType", scope = DeleteError.class)
    public JAXBElement<Integer> createDeleteErrorDeleteErrorType(Integer value) {
        return new JAXBElement<Integer>(_DeleteErrorDeleteErrorType_QNAME, Integer.class, DeleteError.class, value);
    }

}
