package com.arshaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arshaa.entity.Defaults;

public interface SecurityDepositRepo extends  JpaRepository<Defaults, Integer> {

	boolean existsByOccupencyType(String occupencyType);
	Defaults findByOccupencyType(String occupencyType);

}
