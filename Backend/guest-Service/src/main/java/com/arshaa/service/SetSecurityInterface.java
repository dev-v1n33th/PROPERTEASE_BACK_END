package com.arshaa.service;

import java.util.List;

import com.arshaa.entity.SecurityDeposit;


public interface SetSecurityInterface {

	
	public SecurityDeposit saveSecurityDeposit(SecurityDeposit security);
	
	public List<SecurityDeposit> getallSecuritydeposit();
	
	
	 public SecurityDeposit  updateSecurityDeposit( Integer id, SecurityDeposit sd);  
	    

	     
	 
}
