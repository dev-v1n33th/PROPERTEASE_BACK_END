package com.arshaa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SecurityDeposit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private double securityDepositAmount;
	private String occupencyType;
	
	public SecurityDeposit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SecurityDeposit(int id, double securityDepositAmount, String occupencyType) {
		super();
		this.id = id;
		this.securityDepositAmount = securityDepositAmount;
		this.occupencyType = occupencyType;
	}
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
	
	

}
