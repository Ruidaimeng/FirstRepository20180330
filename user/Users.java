package com.yd.kjsm.task.data.user;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Users {
	
	private List<User> User;
	@XmlElement(name = "User")
	public List<User> getUser() {
		return User;
	}

	public void setUser(List<User> user) {
		User = user;
	}
	

	
	

}
