package com.arshaa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="securityDeposit")
public class SecurityDeposit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	public SecurityDeposit(int id, double securitydeposit) {
		super();
		this.id = id;
		this.securitydeposit = securitydeposit;
	}
	private double securitydeposit ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSecuritydeposit() {
		return securitydeposit;
	}
	public void setSecuritydeposit(double securitydeposit) {
		this.securitydeposit = securitydeposit;
	}
	public SecurityDeposit() {
		super();
		// TODO Auto-generated constructor stub
	}

}
