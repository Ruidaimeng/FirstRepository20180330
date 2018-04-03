package com.yd.kjsm.task.data.user;

import javax.xml.bind.annotation.XmlElement;

public class Addresses {
	
	private Address Address;
	@XmlElement(name="Address") 
	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}
	
	

}
