package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/employee")
public class EmployeeRestController {
	
	@GET
	@Path("/msg")
	public String showMsg() {
		System.out.println("EXECUTED............");
		return "WELCOME TO FIRST JERSEY APPLICATION";
	}
}
