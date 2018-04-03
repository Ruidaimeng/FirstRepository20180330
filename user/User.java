package com.yd.kjsm.task.data.user;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private String OperCode;

	private String ProcId;

	private String UserId;

	private String IDPseudoCode;

	private String Name;

	private long Gender;

	private String CardType;

	private String CardID;

	private Mobile mobiles;

	private String Phone;

	private Addresses addresses;;

	private String WeiXinCode;

	private long UserType;

	private long CollectMethod;
	private String Status;

	@XmlElement(name = "OperCode")
	public String getOperCode() {
		return OperCode;
	}

	public void setOperCode(String operCode) {
		OperCode = operCode;
	}

	@XmlElement(name = "ProcId")
	public String getProcId() {
		return ProcId;
	}

	public void setProcId(String procId) {
		ProcId = procId;
	}

	@XmlElement(name = "UserId")
	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	@XmlElement(name = "IDPseudoCode")
	public String getIDPseudoCode() {
		return IDPseudoCode;
	}

	public void setIDPseudoCode(String iDPseudoCode) {
		IDPseudoCode = iDPseudoCode;
	}

	@XmlElement(name = "Name")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@XmlElement(name = "Gender")
	public long getGender() {
		return Gender;
	}

	public void setGender(long gender) {
		Gender = gender;
	}

	@XmlElement(name = "UserCardType")
	public String getCardType() {
		return CardType;
	}

	public void setCardType(String cardType) {
		CardType = cardType;
	}

	@XmlElement(name = "UserCardID ")
	public String getCardID() {
		return CardID;
	}

	public void setCardID(String cardID) {
		CardID = cardID;
	}

	@XmlElement(name = "Phone")
	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@XmlElement(name = "WeiXinCode")
	public String getWeiXinCode() {
		return WeiXinCode;
	}

	public void setWeiXinCode(String weiXinCode) {
		WeiXinCode = weiXinCode;
	}

	@XmlElement(name = "UserType")
	public long getUserType() {
		return UserType;
	}

	public void setUserType(long userType) {
		UserType = userType;
	}

	@XmlElement(name = "CollectMethod")
	public long getCollectMethod() {
		return CollectMethod;
	}

	public void setCollectMethod(long collectMethod) {
		CollectMethod = collectMethod;
	}

	@XmlElement(name = "Addresses")
	public Addresses getAddresses() {
		return addresses;
	}

	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}

	@XmlElement(name = "Mobiles")
	public Mobile getMobiles() {
		return mobiles;
	}

	public void setMobiles(Mobile mobiles) {
		this.mobiles = mobiles;
	}
	@XmlElement(name = "Status")
	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public User() {
		super();
	}

}
