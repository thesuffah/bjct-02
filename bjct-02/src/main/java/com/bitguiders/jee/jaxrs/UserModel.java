package com.bitguiders.jee.jaxrs;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="user")
public class UserModel {

	String name;
	String phone;
	String id;

	public UserModel() {}
	public UserModel(String name, String phone, String id) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
