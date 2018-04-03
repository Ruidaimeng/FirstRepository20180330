package com.yd.kjsm.task.data.user;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class TestJaxb {
	
	
	public static void main(String[] args) {
//		beanToXML();
		test();
	}
	
   public static void test(){

	   User user = new User();
	   user.setCardID("11");
	   Address address = new Address();
//	   address.setCityOfAddress("aa");
	   Addresses aa = new Addresses();
	   aa.setAddress(address);
//	   user.setAddresses(addresses);
	   
	   User user1 = new User();
	   user1.setCardID("555");
	   Users users = new Users();
	   List<User> list  = new ArrayList<>();
	   list.add(user);
	   list.add(user1);
	   users.setUser(list);
//	   users.setUser(user);
	   Body body = new Body();
	   //body.setUsers(list);
	   body.setUsers(users);

	   Head Head = new Head();
	   
	   Request request = new Request();
	   request.setHead(Head);
	   request.setBody(body);
//	   XmlData xml =new XmlData();
//	   xml.setRequest(request);
	  
	   
	try {
		JAXBContext context = JAXBContext.newInstance(Request.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
	       marshaller.marshal(request, System.out);
	} catch (JAXBException e) {
	
		e.printStackTrace();
	}  
       
	   
	   
	   
   }


}
