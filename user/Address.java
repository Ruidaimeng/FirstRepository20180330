package com.yd.kjsm.task.data.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Address {
	
	private String Type;
	
	private String ProvinceCode;
	
	private String CityCode;
	
	private String CountyCode;
	
	private String Street;
	



	
	
	@XmlElement(name="ProvinceCode") 
	public String getProvinceCode() {
		return ProvinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		ProvinceCode = provinceCode;
	}
	@XmlElement(name="CityCode") 
	public String getCityCode() {
		return CityCode;
	}
	
	public void setCityCode(String cityCode) {
		CityCode = cityCode;
	}
	@XmlElement(name="CountyCode") 
	public String getCountyCode() {
		return CountyCode;
	}

	public void setCountyCode(String countyCode) {
		CountyCode = countyCode;
	}
	@XmlElement(name="Street") 
	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}
	@XmlElement(name="Type") 
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public Address(){
		super();
	}
	

}
