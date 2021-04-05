package com.nt.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	@JsonProperty(value = "IDENTITY") //the value of this property will be assigned to IDENTITY in place of original property(uid)
	//and the value of this annotation should be unique....
	private Integer uid;
	@JsonProperty(value = "NAME")
	private String uname;
	//@JsonProperty(value = "PASSWORD")
	@JsonIgnore //this annotation says to ignore the relevant property not to participate in serialization process
	private String upwd;
	@JsonProperty(value = "DESIGNATION")
	private String urole;
	
	public User() {
		System.out.println("User 0-param constructor");
	}
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUrole() {
		return urole;
	}
	public void setUrole(String urole) {
		this.urole = urole;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", urole=" + urole + "]";
	}
	
}
