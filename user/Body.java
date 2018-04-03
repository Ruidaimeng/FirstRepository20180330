package com.yd.kjsm.task.data.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.yd.kjsm.base.data.KJSM_base_orgData;
import com.yd.kjsm.base.data.KJSM_base_org_msgData;

@XmlRootElement
public class Body {

	private Users Users;
	
	



	@XmlElement(name="Users") 
	public Users getUsers() {
		return Users;
	}
	


	public void setUsers(Users users) {
		Users = users;
	}




	public Body() {
		super();
	}






}
