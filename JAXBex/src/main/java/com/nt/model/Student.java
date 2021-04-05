package com.nt.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement   //this annotation will make our class as JAXB class on which we can create JaxbContext object
public class Student {
	private Integer sid;
	private String sname;
	private Double fee;
}
