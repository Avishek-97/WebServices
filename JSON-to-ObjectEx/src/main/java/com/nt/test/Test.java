package com.nt.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Employee;

public class Test {

	public static void main(String[] args) {
		try {
			//write escape sequences to arrange(\") data properly and the properties can be placed in any order
			//String json="{\"eid\":1002,\"ename\":\"Avishek\",\"esal\":80000}";  //valid
			//String json="{\"ename\":\"Avishek\",\"esal\":80000}"; //valid
			//String json="{}"; //valid
			ObjectMapper om=new ObjectMapper();
			//Employee emp=om.readValue(json, Employee.class);
			Employee emp=om.readValue(new File("employee_data.json"), Employee.class);
			System.out.println(emp);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
