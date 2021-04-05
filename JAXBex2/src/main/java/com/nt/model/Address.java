package com.nt.model;

import lombok.Data;

@Data
public class Address {
	//@XmlElement(name = "house-no")
	private Integer hno;
	private String city;
}
