package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private Integer eid;
	private String ename;
	private Double esal;
	private List<String> eprjs;
	private Set<String> modules;
	private Map<String, Integer> marks;
	private Address addrs;

	
	public Employee() {
		super();
	}//constructor
	
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getEsal() {
		return esal;
	}
	public void setEsal(Double esal) {
		this.esal = esal;
	}
	public List<String> getEprjs() {
		return eprjs;
	}

	public void setEprjs(List<String> eprjs) {
		this.eprjs = eprjs;
	}
	public Set<String> getModules() {
		return modules;
	}

	public void setModules(Set<String> modules) {
		this.modules = modules;
	}
	public Map<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(Map<String, Integer> marks) {
		this.marks = marks;
	}

	public Address getAddrs() {
		return addrs;
	}

	public void setAddrs(Address addrs) {
		this.addrs = addrs;
	}

	/*
	 * @Override public String toString() { return "Employee [eid=" + eid +
	 * ", ename=" + ename + ", esal=" + esal + ", eprjs=" + eprjs + ", modules=" +
	 * modules + ", marks=" + marks + "]"; }
	 */

}
