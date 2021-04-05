package com.nt.test;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.bean.User;

public class Test {

	public static void main(String[] args) {
		try{
			// create bean object
			User user=new User();
			user.setUid(3009);
			user.setUname("avishek");
			user.setUpwd("avi@123");
			user.setUrole("Developer");

			//write data to JSON format
			ObjectMapper om=new ObjectMapper();
			//String json=om.writeValueAsString(user);
			//write JSON data to a file
			om.writeValue(new File("data.json"), user);
			System.out.println("Data saved to file......");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
