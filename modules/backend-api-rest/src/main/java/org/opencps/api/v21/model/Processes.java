//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 09:37:01 AM ICT 
//


package org.opencps.api.v21.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ProcessOption" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="optionCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="optionName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="seqOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="sampleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="autoSelect">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="instructionNote">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="submissionNote">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="templateNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="templateName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="processNo">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="processName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="registerBookCode">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "processOption"
})
@XmlRootElement(name = "processes")
public class Processes {

    @XmlElement(name = "ProcessOption", required = true)
    protected List<Processes.ProcessOption> processOption;

    /**
     * Gets the value of the processOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Processes.ProcessOption }
     * 
     * 
     */
    public List<Processes.ProcessOption> getProcessOption() {
        if (processOption == null) {
            processOption = new ArrayList<Processes.ProcessOption>();
        }
        return this.processOption;
    }


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
     *         &lt;element name="optionCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="optionName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="seqOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="sampleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="autoSelect">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="instructionNote">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="submissionNote">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="templateNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="templateName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="processNo">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="processName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="registerBookCode">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "optionCode",
        "optionName",
        "seqOrder",
        "sampleCount",
        "autoSelect",
        "instructionNote",
        "submissionNote",
        "templateNo",
        "templateName",
        "processNo",
        "processName",
        "registerBookCode"
    })
    public static class ProcessOption {

        @XmlElement(required = true)
        protected String optionCode;
        @XmlElement(required = true)
        protected String optionName;
        protected int seqOrder;
        protected int sampleCount;
        @XmlElement(required = true)
        protected String autoSelect;
        @XmlElement(required = true)
        protected String instructionNote;
        @XmlElement(required = true)
        protected String submissionNote;
        @XmlElement(required = true)
        protected String templateNo;
        @XmlElement(required = true)
        protected String templateName;
        @XmlElement(required = true)
        protected String processNo;
        @XmlElement(required = true)
        protected String processName;
        @XmlElement(required = true)
        protected String registerBookCode;

        /**
         * Gets the value of the optionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionCode() {
            return optionCode;
        }

        /**
         * Sets the value of the optionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionCode(String value) {
            this.optionCode = value;
        }

        /**
         * Gets the value of the optionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionName() {
            return optionName;
        }

        /**
         * Sets the value of the optionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionName(String value) {
            this.optionName = value;
        }

        /**
         * Gets the value of the seqOrder property.
         * 
         */
        public int getSeqOrder() {
            return seqOrder;
        }

        /**
         * Sets the value of the seqOrder property.
         * 
         */
        public void setSeqOrder(int value) {
            this.seqOrder = value;
        }

        /**
         * Gets the value of the sampleCount property.
         * 
         */
        public int getSampleCount() {
            return sampleCount;
        }

        /**
         * Sets the value of the sampleCount property.
         * 
         */
        public void setSampleCount(int value) {
            this.sampleCount = value;
        }

        /**
         * Gets the value of the autoSelect property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAutoSelect() {
            return autoSelect;
        }

        /**
         * Sets the value of the autoSelect property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAutoSelect(String value) {
            this.autoSelect = value;
        }

        /**
         * Gets the value of the instructionNote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstructionNote() {
            return instructionNote;
        }

        /**
         * Sets the value of the instructionNote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstructionNote(String value) {
            this.instructionNote = value;
        }

        /**
         * Gets the value of the submissionNote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubmissionNote() {
            return submissionNote;
        }

        /**
         * Sets the value of the submissionNote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubmissionNote(String value) {
            this.submissionNote = value;
        }

        /**
         * Gets the value of the templateNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplateNo() {
            return templateNo;
        }

        /**
         * Sets the value of the templateNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplateNo(String value) {
            this.templateNo = value;
        }

        /**
         * Gets the value of the templateName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTemplateName() {
            return templateName;
        }

        /**
         * Sets the value of the templateName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTemplateName(String value) {
            this.templateName = value;
        }

        /**
         * Gets the value of the processNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessNo() {
            return processNo;
        }

        /**
         * Sets the value of the processNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessNo(String value) {
            this.processNo = value;
        }

        /**
         * Gets the value of the processName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessName() {
            return processName;
        }

        /**
         * Sets the value of the processName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessName(String value) {
            this.processName = value;
        }

        /**
         * Gets the value of the registerBookCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegisterBookCode() {
            return registerBookCode;
        }

        /**
         * Sets the value of the registerBookCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegisterBookCode(String value) {
            this.registerBookCode = value;
        }

    }

}
