package com.yd.kjsm.task.data.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mobile {
	
	private String Mobile;
	@XmlElement(name="Mobile")

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		this.Mobile = mobile;
	}
	
	
}
