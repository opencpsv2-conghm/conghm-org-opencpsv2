//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.11 at 06:53:24 PM ICT 
//


package org.opencps.api.booking.model;

import com.liferay.petra.string.StringPool;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="administration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "keyword",
    "service",
    "state",
    "start",
    "end",
    "sort",
    "order",
    "from",
    "to",
    "bookingFrom",
    "bookingTo",
    "gateNumber"
})
@XmlRootElement(name = "BookingSearchModel")
public class BookingSearchModel {

	@QueryParam(value = "keyword")
	protected String keyword;
	@DefaultValue(StringPool.BLANK)
	@QueryParam(value = "service")
	protected String service;
	@QueryParam(value = "state")
	protected String state;
	@QueryParam(value = "start")
	protected int start;
	@QueryParam(value = "end")
	protected int end;
	@DefaultValue("checkinDate")
	@QueryParam("sort")
	protected String sort;
	@QueryParam(value = "order")
	protected String order;
	@QueryParam(value = "from")
	protected String from;
	@QueryParam(value = "to")
	protected String to;
	@QueryParam(value = "bookingFrom")
	protected String bookingFrom;
	@QueryParam(value = "bookingTo")
	protected String bookingTo;
	@QueryParam(value = "gateNumber")
	protected String gateNumber;

	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getBookingFrom() {
		return bookingFrom;
	}
	public void setBookingFrom(String bookingFrom) {
		this.bookingFrom = bookingFrom;
	}
	public String getBookingTo() {
		return bookingTo;
	}
	public void setBookingTo(String bookingTo) {
		this.bookingTo = bookingTo;
	}
	public String getGateNumber() {
		return gateNumber;
	}
	public void setGateNumber(String gateNumber) {
		this.gateNumber = gateNumber;
	}

}