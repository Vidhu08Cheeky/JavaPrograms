package com.example.treeset.equals.and.hashcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashsetEqualsAndHashCodeExample {

	public static void main(String[] args) {
		Set<Employee> empSet = new LinkedHashSet<Employee>();
		
		empSet.add(new Employee(1001, "Vidya"));
		empSet.add(new Employee(1002, "Anand"));
		empSet.add(new Employee(1003, "Malathi"));
		empSet.add(new Employee(1004, "Neela"));
		empSet.add(new Employee(1005, "Murugesan"));
		empSet.add(new Employee(1006, "Perumal"));
		empSet.add(new Employee(1001, "Vidya"));
		empSet.add(new Employee(1002, "Anand"));
		
		 System.out.println(empSet);
		 
		 System.out.println(empSet.size());
	}

}
