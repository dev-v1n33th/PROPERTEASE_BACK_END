package com.arshaa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arshaa.entity.RatesConfig;

@Repository
public interface RatesConfigRepository extends JpaRepository<RatesConfig, Integer>{
	public List<RatesConfig>  findByBuildingId(int buildingId);
	
	
	public List<RatesConfig> findByBuildingIdAndOccupancyType(int buildingId , String occupancyType);

}
