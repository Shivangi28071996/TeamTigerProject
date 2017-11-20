package com.gw.RealEstate.Entity;

import javax.persistence.*;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="propertyfeatures")
@Proxy(lazy=false)
public class PropertyFeatures {
	@Id
	@Column(name="featureid")
	
	private int featureid;
	@Column(name="parking")
	private boolean parking;
	
	@Column(name="ac")
	private boolean ac;
	
	@Column(name="sit")
	private boolean sit;
	
	@Column(name="pool")
	private boolean pool;
	
	@Column(name="laundry")
	private boolean laundry;
	
	@Column(name="window")
	private boolean window;
	
	@Column(name="heating")
	private boolean heating;
	
	@Column(name="alarm")
	private boolean alarm;
	
	@Column(name="gym")
	private boolean gym;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="propertyid")
	private PropertyDetails propertydetails;

	
	
	public PropertyFeatures() {
	}

	public PropertyFeatures(boolean parking, boolean ac, boolean sit, boolean pool, boolean laundry, boolean window,
			boolean heating, boolean alarm, boolean gym) {
		this.parking = parking;
		this.ac = ac;
		this.sit = sit;
		this.pool = pool;
		this.laundry = laundry;
		this.window = window;
		this.heating = heating;
		this.alarm = alarm;
		this.gym = gym;
	}

	public int getFeatureid() {
		return featureid;
	}

	public void setFeatureid(int featureid) {
		this.featureid = featureid;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public boolean isSit() {
		return sit;
	}

	public void setSit(boolean sit) {
		this.sit = sit;
	}

	public boolean isPool() {
		return pool;
	}

	public void setPool(boolean pool) {
		this.pool = pool;
	}

	public boolean isLaundry() {
		return laundry;
	}

	public void setLaundry(boolean laundry) {
		this.laundry = laundry;
	}

	public boolean isWindow() {
		return window;
	}

	public void setWindow(boolean window) {
		this.window = window;
	}

	public boolean isHeating() {
		return heating;
	}

	public void setHeating(boolean heating) {
		this.heating = heating;
	}

	public boolean isAlarm() {
		return alarm;
	}

	public void setAlarm(boolean alarm) {
		this.alarm = alarm;
	}

	public boolean isGym() {
		return gym;
	}

	public void setGym(boolean gym) {
		this.gym = gym;
	}

	public PropertyDetails getPropertydetails() {
		return propertydetails;
	}

	public void setPropertydetails(PropertyDetails propertydetails) {
		this.propertydetails = propertydetails;
	}
	
	
	
}
