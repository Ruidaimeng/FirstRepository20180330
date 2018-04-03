package com.yd.kjsm.task.util;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import com.yd.kjsm.base.data.vo.KJSM_base_send_result_UserVO;
import com.yd.kjsm.task.data.user.Addresses;
import com.yd.kjsm.task.data.user.Request;
import com.yd.kjsm.task.data.user.User;

/** 
 * @author ruimeng
 * @version 创建时间：2018年4月3日 上午9:34:34 
 * 类说明 :
 */
public class XmltoBean {
	
	static Logger logger = Logger.getLogger(XmltoBean.class);
	
	private static JAXBContext ctx3101 = null ;
	static {
		try {
		ctx3101 = JAXBContext.newInstance(Request.class);
		} catch (Exception e){
			logger.error("JAXBContext init error", e);
		}
	}
	
	/**
	 * 3101xml 解析获取详细信息==============新版，将个人用户和机构用户信息，封装到KJSM_base_send_result_UserPO实体类中
	 * 将xml文件解析为bean对象，用户信息
	 * @throws Exception
	 */
	public  List<KJSM_base_send_result_UserVO> xmlToBean4(String xml)
			throws Exception {
		KJSM_base_send_result_UserVO vo = null;
		List<KJSM_base_send_result_UserVO> list = new ArrayList<>();
		Unmarshaller um = ctx3101.createUnmarshaller();
		Request request = (Request) um.unmarshal(new StringReader(xml));
		
		for (User trace : request.getBody().getUsers().getUser()) {
			 vo = new KJSM_base_send_result_UserVO();
             vo.setUserType("1");  //个人协议用户
             vo.setUserId(trace.getUserId());
             
           Addresses adress =trace.getAddresses() ;  //xml的body中有Addresses（父节点）和Address
			 vo.setCityCode(adress.getAddress().getCityCode());
			 vo.setCountyCode(adress.getAddress().getCountyCode());
			 vo.setProvinceCode(adress.getAddress().getProvinceCode());
		     vo.setStreet(adress.getAddress().getStreet());
			 vo.setUserName(trace.getName());
			 vo.setUserId(trace.getUserId());
			 vo.setUserPhone(trace.getMobiles().getMobile());
			 list.add(vo);
		}		
		return list;

	}	
}