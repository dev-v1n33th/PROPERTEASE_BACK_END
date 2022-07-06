package com.arshaa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;
@Entity
public class Defaults {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private double securityDepositAmount;
	private String occupancyType;
	
	
	//@UniqueElements
	private int noticeDays;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSecurityDepositAmount() {
		return securityDepositAmount;
	}
	public void setSecurityDepositAmount(double securityDepositAmount) {
		this.securityDepositAmount = securityDepositAmount;
	}
	public String getOccupencyType() {
		return occupancyType;
	}
	public void setOccupancyType(String occupancyType) {
		this.occupancyType = occupancyType;
	}
	public int getNoticeDays() {
		return noticeDays;
	}
	public void setNoticeDays(int noticeDays) {
		this.noticeDays = noticeDays;
	}
	public Defaults(int id, double securityDepositAmount, String occupancyType, int noticeDays) {
		super();
		this.id = id;
		this.securityDepositAmount = securityDepositAmount;
		this.occupancyType = occupancyType;
		this.noticeDays = noticeDays;
	}
	public Defaults() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
