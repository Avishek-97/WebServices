package in.nit.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/employee")
public class EmployeeRestController {
		
		@GET
		public String retrieveEmployee() {
			return "GET Employee";
		}
		
		@POST
		public String createEmployee() {
			return "POST Employee";
		}
		
		@PUT
		public String updateEmployee() {
			return "PUT Employee";
		}
		
		@DELETE
		public String deleteEmployee() {
			return "DELETE Employee";
		}
	}
