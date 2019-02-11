package com.tripeasy.search.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Search {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer cityId;
	private String city;
	private String state;
	private String country;
	private String type;
	private String code;
	private String airportName;
	

	public Integer getCityId() {
		return cityId;
	}


	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getAirportName() {
		return airportName;
	}


	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}


	public Search(Integer cityId, String city, String state, String country, String type, String code,
			String airportName) {
		super();
		this.cityId = cityId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.type = type;
		this.code = code;
		this.airportName = airportName;
	}
	
	public Search( String city, String state, String country, String type, String code,
			String airportName) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.type = type;
		this.code = code;
		this.airportName = airportName;
	}
	
	
	public Search(String city, String state, String country, String type) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.type = type;
	}


	public Search(Integer cityId, String city, String state, String country, String type) {
		super();
		this.cityId = cityId;
		this.city = city;
		this.state = state;
		this.country = country;
		this.type = type;
	}


	public Search() {
		super();
	}


	@Override
	public String toString() {
		return "Search [cityId=" + cityId + ", city=" + city + ", state=" + state + ", country=" + country + ", type="
				+ type + ", code=" + code + ", airportName=" + airportName + "]";
	}
	
	
}
