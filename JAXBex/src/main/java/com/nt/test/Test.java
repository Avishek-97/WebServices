package com.nt.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.nt.model.Student;

public class Test {

	/*public static void main(String[] args) {
		try {
			// create obj for Student class
			Student st=new Student();
			st.setSid(6868);  st.setSname("Avi");  st.setFee(4500.00);
			//create context object for student
	
			//below all three lines are valid
			JAXBContext context=JAXBContext.newInstance(Student.class);
			//JAXBContext context=JAXBContext.newInstance(st.getClass());
			//JAXBContext context=JAXBContext.newInstance(Class.forName("com.nt.Student"));
			
			//create Marshaller object
			Marshaller marshaller=context.createMarshaller();
			
			//convert object to xml
			marshaller.marshal(st, new File("data.xml"));
			System.out.println("Marshalling is done..............");
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	public static void main(String[] args) {
		try {
			
			//below all three lines are valid
			JAXBContext context=JAXBContext.newInstance(Student.class);
			//JAXBContext context=JAXBContext.newInstance(st.getClass());
			//JAXBContext context=JAXBContext.newInstance(Class.forName("com.nt.Student"));
			
			//create Marshaller object
			Unmarshaller unmarshaller=context.createUnmarshaller();
			
			//convert object to xml
			Student st=(Student) unmarshaller.unmarshal(new File("data.xml"));
			System.out.println(st);
			System.out.println("Unmarshalling is done..............");
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
