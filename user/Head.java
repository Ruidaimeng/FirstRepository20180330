package com.yd.kjsm.task.data.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public class Head {
	
	private String MessageNo;
	
	private String MessageCode;
	
	private String EcCompanyId;
	
	private String PostalDeparlmentCode;

	@XmlElement(name="MessageNo")
	public String getMessageNo() {
		return MessageNo;
	}

	public void setMessageNo(String messageNo) {
		MessageNo = messageNo;
	}
	@XmlElement(name="MessageCode")
	public String getMessageCode() {
		return MessageCode;
	}

	public void setMessageCode(String messageCode) {
		MessageCode = messageCode;
	}


	@XmlElement(name="EcCompanyId")

	public String getEcCompanyId() {
		return EcCompanyId;
	}

	public void setEcCompanyId(String ecCompanyId) {
		EcCompanyId = ecCompanyId;
	}
	@XmlElement(name="PostalDeparlmentCode")

	public String getPostalDeparlmentCode() {
		return PostalDeparlmentCode;
	}

	public void setPostalDeparlmentCode(String postalDeparlmentCode) {
		PostalDeparlmentCode = postalDeparlmentCode;
	}
	
	
	public Head(){
		super();
	}
	
	

}
