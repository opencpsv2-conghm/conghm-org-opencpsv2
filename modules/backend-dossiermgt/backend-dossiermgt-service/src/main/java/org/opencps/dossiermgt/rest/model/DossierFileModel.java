//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.17 at 04:54:26 PM ICT 
//


package org.opencps.dossiermgt.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DossierFileModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DossierFileModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dossierFileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceUid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierTemplateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierPartNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dossierPartType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fileTemplateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fileVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isNew" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="signCheck" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="signInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="removed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="formData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DossierFileModel", propOrder = {
    "dossierFileId",
    "createDate",
    "modifiedDate",
    "referenceUid",
    "dossierTemplateNo",
    "dossierPartNo",
    "dossierPartType",
    "fileTemplateNo",
    "displayName",
    "fileType",
    "fileSize",
    "fileVersion",
    "isNew",
    "signCheck",
    "signInfo",
    "removed",
    "eForm",
    "formData",
    "formScript",
    "formReport"
})
public class DossierFileModel {

    protected Long dossierFileId;
    protected String createDate;
    protected String modifiedDate;
    protected String referenceUid;
    protected String dossierTemplateNo;
    protected String dossierPartNo;
    protected Integer dossierPartType;
    protected String fileTemplateNo;
    protected String displayName;
    protected String fileType;
    protected Long fileSize;
    protected String fileVersion;
    protected Boolean isNew;
    protected Integer signCheck;
    protected String signInfo;
    protected Boolean removed;
    protected Boolean eForm;
    protected String formData;
    protected String formScript;
    protected String formReport;

    /**
     * Gets the value of the dossierFileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDossierFileId() {
        return dossierFileId;
    }

    /**
     * Sets the value of the dossierFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDossierFileId(Long value) {
        this.dossierFileId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the referenceUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceUid() {
        return referenceUid;
    }

    /**
     * Sets the value of the referenceUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceUid(String value) {
        this.referenceUid = value;
    }

    /**
     * Gets the value of the dossierTemplateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierTemplateNo() {
        return dossierTemplateNo;
    }

    /**
     * Sets the value of the dossierTemplateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierTemplateNo(String value) {
        this.dossierTemplateNo = value;
    }

    /**
     * Gets the value of the dossierPartNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierPartNo() {
        return dossierPartNo;
    }

    /**
     * Sets the value of the dossierPartNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierPartNo(String value) {
        this.dossierPartNo = value;
    }

    /**
     * Gets the value of the dossierPartType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDossierPartType() {
        return dossierPartType;
    }

    /**
     * Sets the value of the dossierPartType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDossierPartType(Integer value) {
        this.dossierPartType = value;
    }

    /**
     * Gets the value of the fileTemplateNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTemplateNo() {
        return fileTemplateNo;
    }

    /**
     * Sets the value of the fileTemplateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTemplateNo(String value) {
        this.fileTemplateNo = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileVersion() {
        return fileVersion;
    }

    /**
     * Sets the value of the fileVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileVersion(String value) {
        this.fileVersion = value;
    }

    /**
     * Gets the value of the isNew property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNew() {
        return isNew;
    }

    /**
     * Sets the value of the isNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNew(Boolean value) {
        this.isNew = value;
    }

    /**
     * Gets the value of the signCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignCheck() {
        return signCheck;
    }

    /**
     * Sets the value of the signCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignCheck(Integer value) {
        this.signCheck = value;
    }

    /**
     * Gets the value of the signInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignInfo() {
        return signInfo;
    }

    /**
     * Sets the value of the signInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignInfo(String value) {
        this.signInfo = value;
    }

    /**
     * Gets the value of the removed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoved() {
        return removed;
    }

    /**
     * Sets the value of the removed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoved(Boolean value) {
        this.removed = value;
    }

    /**
     * Gets the value of the eForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEForm() {
        return eForm;
    }

    /**
     * Sets the value of the eForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEForm(Boolean value) {
        this.eForm = value;
    }

    /**
     * Gets the value of the formData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormData() {
        return formData;
    }

    /**
     * Sets the value of the formData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormData(String value) {
        this.formData = value;
    }

    /**
     * Gets the value of the formScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormScript() {
        return formScript;
    }

    /**
     * Sets the value of the formScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormScript(String value) {
        this.formScript = value;
    }

    /**
     * Gets the value of the formReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormReport() {
        return formReport;
    }

    /**
     * Sets the value of the formReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormReport(String value) {
        this.formReport = value;
    }

}
