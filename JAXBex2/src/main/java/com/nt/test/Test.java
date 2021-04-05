package com.nt.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.nt.model.Address;
import com.nt.model.Employee;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEid(1111);
		emp.setPwd("@123");
		emp.setEname("David");
		emp.setEsal(90400.00);
		
		Set<String> proj=new HashSet<String>();
		proj.add("Octa-FX");
		proj.add("Citi");
		proj.add("JP-Morgan");
		emp.setEmpPrjs(proj);
		
		List<String> frt=new ArrayList<String>();
		frt.add("orange");
		frt.add("mango");
		frt.add("banana");
		emp.setFruits(frt);
		
		Map<String, Integer> bill=new HashMap<String, Integer>();
		bill.put("oil", 160);
		bill.put("onion", 60);
		bill.put("flour", 32);
		emp.setBill(bill);
		
		Address ad=new Address();
		ad.setHno(9068);
		ad.setCity("hyd");
		emp.setAddrs(ad);
		
		try {
			JAXBContext context=JAXBContext.newInstance(emp.getClass());
			Marshaller marshaller=context.createMarshaller();
			marshaller.marshal(emp, new File("data.xml"));
			System.out.println("Marshalling completed successfully.....");
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
