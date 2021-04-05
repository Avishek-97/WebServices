package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	@XmlAttribute(name = "id")
	//@XmlElement(name = "ID")  //error
	private Integer eid;
	@XmlTransient
	//@XmlElement(name = "password")
	private String pwd;
	@XmlElement(name = "name", required = false)
	private String ename;
	@XmlElement(name = "salary")
	private Double esal;
	
	@XmlElementWrapper(name = "projects")
	@XmlElement(name = "project")
	private Set<String> empPrjs;
	
	@XmlElementWrapper(name = "fruits")
	@XmlElement(name = "fruit")
	private List<String> fruits;
	
	@XmlElementWrapper(name = "bills")
	private Map<String, Integer> bill;
	
	//@XmlElement(name = "address")
	private Address addrs;
}
