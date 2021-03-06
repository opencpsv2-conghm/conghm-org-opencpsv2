// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.20 at 05:56:58 PM ICT 
//


package org.opencps.api.booking.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingId",
    "createDate",
    "modifiedDate",
    "className",
    "classPK",
    "serviceCode",
    "codeNumber",
    "bookingName",
    "checkinDate",
    "gateNumber",
    "state",
    "bookingDate",
    "speaking",
    "serviceGroupCode",
    "count",
    "online",
    "bookingInTime"
})
@XmlRootElement(name = "BookingDataModel")
public class BookingDataModel {

	protected Long bookingId;
	protected Long createDate;
	protected Long modifiedDate;
	protected String className;
	protected Long classPK;
	protected String serviceCode;
	protected String codeNumber;
	protected String bookingName;
	protected Long checkinDate;
	protected String gateNumber;
	protected Integer state;
	protected Long bookingDate;
	protected boolean speaking;
	protected String serviceGroupCode;
	protected Integer count;
	protected boolean online;
	protected String bookingInTime;

	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public Long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}
	public Long getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Long modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Long getClassPK() {
		return classPK;
	}
	public void setClassPK(Long classPK) {
		this.classPK = classPK;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getCodeNumber() {
		return codeNumber;
	}
	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}
	public String getBookingName() {
		return bookingName;
	}
	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}
	public Long getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(Long checkinDate) {
		this.checkinDate = checkinDate;
	}
	public String getGateNumber() {
		return gateNumber;
	}
	public void setGateNumber(String gateNumber) {
		this.gateNumber = gateNumber;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Long getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Long bookingDate) {
		this.bookingDate = bookingDate;
	}
	public boolean isSpeaking() {
		return speaking;
	}
	public void setSpeaking(boolean speaking) {
		this.speaking = speaking;
	}
	public String getServiceGroupCode() {
		return serviceGroupCode;
	}
	public void setServiceGroupCode(String serviceGroupCode) {
		this.serviceGroupCode = serviceGroupCode;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public String getBookingInTime() {
		return bookingInTime;
	}
	public void setBookingInTime(String bookingInTime) {
		this.bookingInTime = bookingInTime;
	}

}
