package com.arshaa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RatesConfig")
public class RatesConfig {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private int buildingId ;
	
	private int sharing ;
	private String occypancyType ;
	private  double acPrice ;
	private double nacPrice ;
	
	
	
	public RatesConfig(int id, int buildingId, int sharing, String occypancyType, double acPrice, double nacPrice) {
		super();
		this.id = id;
		this.buildingId = buildingId;
		this.sharing = sharing;
		this.occypancyType = occypancyType;
		this.acPrice = acPrice;
		this.nacPrice = nacPrice;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getBuildingId() {
		return buildingId;
	}



	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}



	public int getSharing() {
		return sharing;
	}



	public void setSharing(int sharing) {
		this.sharing = sharing;
	}



	public String getOccypancyType() {
		return occypancyType;
	}



	public void setOccypancyType(String occypancyType) {
		this.occypancyType = occypancyType;
	}



	public double getAcPrice() {
		return acPrice;
	}



	public void setAcPrice(double acPrice) {
		this.acPrice = acPrice;
	}



	public double getNacPrice() {
		return nacPrice;
	}



	public void setNacPrice(double nacPrice) {
		this.nacPrice = nacPrice;
	}



	public RatesConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
