package com.yd.kjsm.task.util;

import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;

import com.yd.kjsm.task.data.user.Body;
import com.yd.kjsm.task.data.user.Head;
import com.yd.kjsm.task.data.user.Request;
import com.yd.kjsm.task.data.user.User;
import com.yd.kjsm.task.data.user.Users;

/** 
 * @author ruimeng
 * @version 创建时间：2018年4月3日 上午10:02:11 
 * 类说明 :
 */
public class BeanToXml {
	
static Logger logger = Logger.getLogger(XmltoBean.class);
	
	private static JAXBContext ctx3101 = null ;
	static {
		try {
		ctx3101 = JAXBContext.newInstance(Request.class);
		} catch (Exception e){
			logger.error("JAXBContext init error", e);
		}
	}
	
	public static  String BeanToXml2 (Request request){
		
		try {
			Marshaller marshaller = ctx3101.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "GBK");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.FALSE);
			Writer w = new StringWriter();
			marshaller.marshal(request, w);
			String result = w.toString();
			return result ;
		} catch (Exception e){
			logger.error("JAXBContext init error", e);
		}
		return null;	
	}
	public static void main(String[] args) {
		Request request =new Request();
		
		Head head = new Head();
		Body body =new Body();
		head.setEcCompanyId("YUNDA");
		head.setMessageCode("123456");
		head.setMessageNo("3102");
		head.setPostalDeparlmentCode("310023");
		
		Users users = new Users() ;
		List<User> list = new ArrayList<>();
		User user = new User();
		user.setCardID("3401221998090123");
		//省略若干数据。。。。。。。。。。。。
		users.setUser(list);
		body.setUsers(users);	
		request.setHead(head);
		request.setBody(body);
		System.out.println(BeanToXml2(request));
	}
}
