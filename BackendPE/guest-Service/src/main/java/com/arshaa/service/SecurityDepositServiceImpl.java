package com.arshaa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.arshaa.entity.SecurityDeposit;
import com.arshaa.repository.SecurityDepositRepo;

@Service
public class SecurityDepositServiceImpl implements SecurityDepositService {
	
	@Autowired
	private SecurityDepositRepo securityDepositRepo;
	

	@Override
	public ResponseEntity<List<SecurityDeposit>> getData() {
		try {
			List<SecurityDeposit> securityadd = securityDepositRepo.findAll();
			return new ResponseEntity<>(securityadd,HttpStatus.OK);
			
		}
		catch (Exception e){
			return new ResponseEntity("Something went Wrong! Try again",HttpStatus.OK);
			
		}
	}

	@Override
	public ResponseEntity updateDataById(int id, SecurityDeposit sdepo) {
		try {
			SecurityDeposit s = securityDepositRepo.findById(sdepo.getId()).orElse(null);
			 s.setSecurityDepositAmount(sdepo.getSecurityDepositAmount());
			 securityDepositRepo.save(s);
			 return new ResponseEntity(s,HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity("Something went Wrong! Try again!",HttpStatus.OK);
		}
		 
	
	}

	@Override
	public ResponseEntity deleteDataById(int id) {
		try {
			SecurityDeposit depo=new SecurityDeposit();
			SecurityDeposit sdepo = securityDepositRepo.findById(depo.getId()).orElse(null);
			securityDepositRepo.delete(sdepo);
			return new ResponseEntity(sdepo,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.OK);
		}
		
	}

	@Override
	public ResponseEntity<SecurityDeposit> addData(SecurityDeposit sdepo) {
		
		try {
			if(securityDepositRepo.existsByOccupencyType(sdepo.getOccupencyType())==false)
			{
				SecurityDeposit securityadd = securityDepositRepo.save(sdepo);
				return new ResponseEntity<>(securityadd,HttpStatus.OK);

			}
			else {
				return new ResponseEntity("Data already Exists",HttpStatus.OK);

			}
		}
		catch (Exception e){
			return new ResponseEntity("Something went Wrong! Try again",HttpStatus.OK);
			
		}
	}

}
