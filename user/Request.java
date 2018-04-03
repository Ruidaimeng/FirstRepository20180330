package com.yd.kjsm.task.data.user;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Request")
public class Request {

	private Head Head;

	private Body Body;

	@XmlElement(name = "Head")
	public Head getHead() {
		return Head;
	}

	public void setHead(Head head) {
		Head = head;
	}

	@XmlElement(name = "Body")
	public Body getBody() {
		return Body;
	}

	public void setBody(Body body) {
		Body = body;
	}

	public Request() {
		super();
	}

}
