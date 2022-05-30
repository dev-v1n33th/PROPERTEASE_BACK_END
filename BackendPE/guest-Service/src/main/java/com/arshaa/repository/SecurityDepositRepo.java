package com.arshaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arshaa.entity.SecurityDeposit;

public interface SecurityDepositRepo extends  JpaRepository<SecurityDeposit, Integer> {

	boolean existsByOccupencyType(String occupencyType);
	SecurityDeposit findByOccupencyType(String occupencyType);

}
