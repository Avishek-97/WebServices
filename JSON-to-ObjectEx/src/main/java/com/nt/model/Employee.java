package com.nt.model;

import java.util.List;
import java.util.Map;

public class Employee {
	static {
		System.out.println("Employee class loaded");
	}
	private Integer eid;
	private String ename;
	private Double esal;
	private List<String> prjs; //here we can use Set and Array also
	private Map<String, Integer> marks;
	private Address addrs;
	
	public Address getAddrs() {
		System.out.println("Employee.getAddrs()");
		return addrs;
	}
	public void setAddrs(Address addrs) {
		System.out.println("Employee.setAddrs()");
		this.addrs = addrs;
	}
	public Map<String, Integer> getMarks() {
		System.out.println("Employee.getMarks()");
		return marks;
	}
	public void setMarks(Map<String, Integer> marks) {
		System.out.println("Employee.setMarks()");
		this.marks = marks;
	}
	public List<String> getPrjs() {
		System.out.println("Employee.getPrjs()");
		return prjs;
	}
	public void setPrjs(List<String> prjs) {
		System.out.println("Employee.setPrjs()");
		this.prjs = prjs;
	}
	public Employee() {
		System.out.println("Employee:: 0-param constructor");
	}
	public Integer getEid() {
		System.out.println("Employee.getEid()");
		return eid;
	}
	public void setEid(Integer eid) {
		System.out.println("Employee.setEid()");
		this.eid = eid;
	}
	public String getEname() {
		System.out.println("Employee.getEname()");
		return ename;
	}
	public void setEname(String ename) {
		System.out.println("Employee.setEname()");
		this.ename = ename;
	}
	public Double getEsal() {
		System.out.println("Employee.getEsal()");
		return esal;
	}
	public void setEsal(Double esal) {
		System.out.println("Employee.setEsal()");
		this.esal = esal;
	}
	@Override
	public String toString() {
		System.out.println("Employee.toString()");
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", prjs=" + prjs + ", marks=" + marks
				+ ", addrs=" + addrs + "]";
	}
	
}
