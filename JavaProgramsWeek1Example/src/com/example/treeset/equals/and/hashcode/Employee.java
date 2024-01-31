package com.example.treeset.equals.and.hashcode;

import java.util.Objects;

public class Employee {

	private int empId;
	private String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee e = (Employee) obj;
		// return empId == e.empId && Objects.equals(empName, e.empName);
		System.out.println(this.empName + " & " + this.empId + " compared to " + e.empId + " & " + e.empName);
		return this.empName.equals(e.empName);
	}

	@Override
	public int hashCode() {
		// return Objects.hash(empId, empName);
		int result = 10;
		int hashCode = 11;
		hashCode = result * hashCode + empId;
		hashCode = empName.hashCode() * result;
		System.out.println(this.empId + " & " + this.empName + " Hashcode: " + hashCode);
		return hashCode;
	}

	/*
	 * @Override public int hashCode() { int hash= this.empName.charAt(0)*10;
	 * System.out.println(this.empId+" & "+this.empName+" Hashcode: "+hash); return
	 * hash; }
	 * 
	 * @Override public boolean equals(Object obj) { Employee e= (Employee) obj;
	 * 
	 * System.out.println(this.empName +" & "+this.empId+" compared to "+
	 * e.empId+" & "+e.empName); return this.empName.equals(e.empName); }
	 */

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
