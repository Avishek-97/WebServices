package com.nt.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Address;
import com.nt.model.Employee;

public class SerializationTest {

	public static void main(String[] args) {
		try {
			List<String> al=new ArrayList<>();
			al.add("OctaFX");
			al.add("citi");
			al.add("iResearch");
			
			Set<String> set=new HashSet<>();
			set.add("service");
			set.add("service");
			Map<String, Integer> map=new HashMap<>();
			map.put("math", 89);
			map.put("english", 88);
			
			Address addrs=new Address();
			addrs.setLocation("Bhadrak");
			
		//create Employee object
		Employee emp=new Employee();
		emp.setEid(101);
		emp.setEname("Avishek");
		emp.setEsal(80000.0);
		emp.setEprjs(al);
		emp.setModules(set);
		emp.setMarks(map);
		emp.setAddrs(addrs);
		
		//create object of ObjectMapper
		ObjectMapper om=new ObjectMapper();
		ObjectMapper om2=new ObjectMapper();
		//convert Object(emp) to JSON format
		String json=om.writeValueAsString(emp);
		//we can write the object data to a file as JSON format and the file extension must be .json
		om2.writeValue(new File("D:/UI apps/emp.json"), emp);
		//print data
		System.out.println(json);
		//the output will be like this ====>{"eid":101,"ename":"Avishek","esal":80000.0}
		}
		catch (Exception e) {
			e.getMessage();
		}
	}

}
