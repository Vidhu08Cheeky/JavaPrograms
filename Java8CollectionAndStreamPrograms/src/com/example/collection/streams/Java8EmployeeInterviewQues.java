package com.example.collection.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8EmployeeInterviewQues {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		
		//1. Given a list of employees, write a Java 8 code to count the number of employees in each department
		Map<String, Long> noofEmployeesInDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(noofEmployeesInDepartment);
		
		Map<String, List<Employee>> listofEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(listofEmployees);
		
		//2. Given a list of employees, find out the average salary of male and female employees
		Map<String, Double> employeeSalaryByGender = employeeList.stream().collect(Collectors.groupingBy(employee ->employee.getGender(), Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(employeeSalaryByGender);
		
		//3.Write a Java 8 code to get the details of highest paid employee in the organization from the given list of employees
		Employee employee = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();
		System.out.println("Highest Paid Employee Details are as follows:");
		System.out.println("Employee Id is : "+employee.getId());
		System.out.println("Employee Name is : "+employee.getName());
		
		
		//4.Write the Java 8 code to get the average age of each department in an organization
		
		//5. Given a list of employees, how do you find out who is the senior most employee in the organization
		Employee employeeYear = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst().get();
		
		System.out.println("Senior Employee Details are as follows:");
		System.out.println("Employee Id is : "+employeeYear.getId());
		System.out.println("Employee Name is : "+employeeYear.getName());
		
		//6. Given a list of employees, get the details of the most youngest employee in the organization
		Employee youngestEmployee = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).findFirst().get();
		
		System.out.println("Youngest Employee Details are as follows:");
		System.out.println("Employee Id is : "+youngestEmployee.getId());
		System.out.println("Employee Name is : "+youngestEmployee.getName());
		
		//7. How do you get the number of employees in each department if you have given a list of employees
		Map<String, Long> countOfEmployees = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(countOfEmployees);
		
		//8. Given a list of employees, find out the number of male and female employees in the organization
		Map<String, Long> genderMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		for(Map.Entry entry : genderMap.entrySet())
		{
			if(entry.getKey().equals("Male")) {
				System.out.println("Count of  "+entry.getKey()+ " is :"+entry.getValue());
			}
			
			if(entry.getKey().equals("Female")) {
				System.out.println("Count of  "+entry.getKey()+ " is :"+entry.getValue());
			}
			
		}
		
		//To Sort Employees in the reversed order
		List<Employee> employeesInReverseOrder = employeeList.stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
		System.out.println(employeesInReverseOrder);

	}

}
