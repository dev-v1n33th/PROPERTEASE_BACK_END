package com.arshaa.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.arshaa.entity.SecurityDeposit;

public interface SecurityDepositService {
	
	public ResponseEntity<SecurityDeposit> addData(SecurityDeposit sdepo);
	public ResponseEntity<List<SecurityDeposit>> getData();
	public ResponseEntity  updateDataById(int id,SecurityDeposit sdepo);
	public ResponseEntity  deleteDataById(int id);
	
	
	

}
