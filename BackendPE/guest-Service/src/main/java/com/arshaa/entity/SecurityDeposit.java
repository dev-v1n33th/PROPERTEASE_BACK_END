package com.arshaa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;
@Entity
public class SecurityDeposit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private double securityDepositAmount;
	private String occupencyType;
	
	
	@UniqueElements
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
		return occupencyType;
	}
	public void setOccupencyType(String occupencyType) {
		this.occupencyType = occupencyType;
	}
	public int getNoticeDays() {
		return noticeDays;
	}
	public void setNoticeDays(int noticeDays) {
		this.noticeDays = noticeDays;
	}
	public SecurityDeposit(int id, double securityDepositAmount, String occupencyType, int noticeDays) {
		super();
		this.id = id;
		this.securityDepositAmount = securityDepositAmount;
		this.occupencyType = occupencyType;
		this.noticeDays = noticeDays;
	}
	public SecurityDeposit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
