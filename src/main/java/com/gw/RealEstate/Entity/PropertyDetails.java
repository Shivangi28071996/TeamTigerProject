package com.gw.RealEstate.Entity;

import javax.persistence.*;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="propertydetails")
@Proxy(lazy=false)
public class PropertyDetails {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="propid")
	private int propId;
	@Column(name="title")
	private String title;
	@Column(name="propStatus")
	private String propStatus;
	@Column(name="type")
	private String type;
	@Column(name="price")
	private int price;
	@Column(name="area")
	private int area;
	@Column(name="rooms")
	private int rooms;
	@Column(name="bathroom")
	private int bathroom;
	@Column(name="address")
	private String address;
	@Column(name="postalcode")
	private int pinCode;
	@Column(name="info")
	private String info;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private long phone;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="userid")
	private PersonalDetails pd;
	
	public PropertyDetails() {
		
	}
	
	
	public PropertyDetails(String title, String propStatus, String type, int price, int area, int rooms, int bathroom,
			String address, int pinCode, String info, String name, String email, long phone) {
		
		this.title = title;
		this.propStatus = propStatus;
		this.type = type;
		this.price = price;
		this.area = area;
		this.rooms = rooms;
		this.bathroom = bathroom;
		this.address = address;
		this.pinCode = pinCode;
		this.info = info;
		this.name = name;
		this.email = email;
		this.phone = phone;
		//this.pd = pd;
	}


	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}

	public PersonalDetails getPd() {
		return pd;
	}
	public void setPd(PersonalDetails pd) {
		this.pd = pd;
	}
	public int getPropId() {
		return propId;
	}
	public void setPropId(int propId) {
		this.propId = propId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPropStatus() {
		return propStatus;
	}
	public void setPropStatus(String propStatus) {
		this.propStatus = propStatus;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public int getBathroom() {
		return bathroom;
	}
	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

}
