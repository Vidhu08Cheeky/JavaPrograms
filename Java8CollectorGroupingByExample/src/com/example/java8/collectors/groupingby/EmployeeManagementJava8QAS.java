package com.example.java8.collectors.groupingby;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeManagementJava8QAS {

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
		
		//1. Program to find how many male and female employees in an organization
		Map<String, Long> genderList = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		for(Map.Entry entry : genderList.entrySet())
		{
			if(entry.getKey().equals("Male")) {
				System.out.println("Count of  "+entry.getKey()+ " is :"+entry.getValue());
			}
			
			if(entry.getKey().equals("Female")) {
				System.out.println("Count of  "+entry.getKey()+ " is :"+entry.getValue());
			}
			
		}
		
		//2.Print the name of all departments in a organization
		List<String> departmentList = employeeList.stream().map(employee -> employee.getDepartment()).distinct().sorted().collect(Collectors.toList());
		System.out.println(departmentList);
		
		//3. Program to print the average age of a male and female
		 Map<String, Double> averageAge = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		 System.out.println(averageAge);
		 
		 //4. program to get the details of the highly paid employee details in the organization
		 Employee highestPaidEmployee = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();
		 
		 System.out.println("Highest Paid Employee Name : " +highestPaidEmployee.getName());
		 
		 //5. Program to print the count or number of employees present in an organization based on department 
		 Map<String, Long> empCountByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		 System.out.println(empCountByDepartment);
		 
		 //6. Get the names of all employees who have joined after 2015?
		 List<Employee> employeeJoinedAfter2015 = employeeList.stream().filter(employee ->employee.getYearOfJoining() >2015).collect(Collectors.toList());
		 System.out.println(employeeJoinedAfter2015);
		 
		 //7. What is the average salary of employees of each department?
		 Map<String, Double> employeeAvgSalaryForDept = employeeList.stream()
				                                                                                            .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		 System.out.println("******************");
		 System.out.println(employeeAvgSalaryForDept);
		 
		 //8. Get the details of youngest male employee in the product development department?
		  Employee productDevYoungestEmp = employeeList.stream()
				                                                                        .filter(employee -> employee.getDepartment().equals("Product Development") && employee.getGender().equals("Male"))
				                                                                        .sorted(Comparator.comparing(Employee::getAge))
				                                                                        .findFirst().get();
		  System.out.println("******************");
			System.out.println(productDevYoungestEmp);
		  
		 //9. Who has the most working experience in the organization?
			
		 
		 //10. How many male and female employees are there in the sales and marketing team?
			Map<String, Long> employeeCount = employeeList.stream().filter(employee -> employee.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
			System.out.println("******************");
			System.out.println(employeeCount);
			
		 //11. What is the average salary of male and female employees?

		 //12. List down the names of all employees in each department?
		 
		 //13. What is the average salary and total salary of the whole organization?
		 
		 //14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		 
		 // 15. Who is the oldest employee in the organization? What is his age and which department he belongs to?
		 
		 
	}

}
