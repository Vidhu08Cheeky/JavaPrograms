package com.example.equalsandHashcode.contract;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Employee e1 = new Employee (1011, "Vidya", "Vidya@gmail.com");
		Employee e2 = new Employee (1012, "Anand", "Anand@gmail.com");
		Employee e3 = new Employee (1021, "Malathi", "Malathi@gmail.com");
		Employee e4 = new Employee (1022, "Murugesan", "Murugesan@gmail.com");
		
		Set<Employee> setEmp = new LinkedHashSet<Employee>();
		
		setEmp.add(e1);
		setEmp.add(e2);
		setEmp.add(e3);
		setEmp.add(e4);
		
		for(Employee e : setEmp) {
			System.out.println(e);
		}

	}

}
