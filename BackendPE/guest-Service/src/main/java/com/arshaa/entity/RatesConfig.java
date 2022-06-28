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
	private String buildingName ;
	private int sharing ;
	private String occypancyType ;
	private  String roomType ;
	private double price ;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
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
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public RatesConfig(int id, int buildingId, String buildingName, int sharing, String occypancyType,
			String roomType , double price ) {
		super();
		this.id = id;
		this.buildingId = buildingId;
		this.buildingName = buildingName;
		this.sharing = sharing;
		this.occypancyType = occypancyType;
		this.roomType = roomType;
		this.price = price ;
	}
	public RatesConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
