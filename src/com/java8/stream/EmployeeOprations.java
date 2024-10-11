package com.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;

public class EmployeeOprations {

	public static void main(String[] args) {
		
		Employee e = new  Employee();

		List<Employee> empList = e.getEmpList();
		
		
		System.out.println("1. Find out the count of male and female employees present in the organization?");
		empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()))
						.entrySet()
						.forEach(System.out::println);
		
		System.out.println("=================================================================================");
		System.out.println("2. Write a program to print the names of all departments in the organization.");
		empList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		System.out.println("=================================================================================");
		System.out.println("3. Find the average age of Male and Female Employees.");
		empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
						.entrySet().forEach(System.out::println);
		
		System.out.println("=================================================================================");
		System.out.println("4. Get the Names of employees who joined after 2015.");
		empList.stream().filter(e1->e1.getYearOfJoining()>2015).map(Employee::getName)
						.forEach(System.out::println);
		
		System.out.println("=================================================================================");
		System.out.println("5. Count the number of employees in each department.");
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()))
						.entrySet()
						.forEach(System.out::println);
		
		
		System.out.println("=================================================================================");
		System.out.println("6. Find out the average salary of each department.");
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
						.entrySet()
						.forEach(System.out::println);
		
		System.out.println("=================================================================================");
		System.out.println("7. Find out the oldest employee, his/her age and department?");
		empList.stream().max(Comparator.comparing(Employee::getAge)).stream().forEach(e2->{
			System.out.println("Name: "+e2.getName());
			System.out.println("Age: "+e2.getAge());
			System.out.println("Dept: "+e2.getDepartment());
		});
				
		System.out.println("=================================================================================");
		System.out.println("8. Find out the average and total salary of the organization.");
		DoubleSummaryStatistics salDetails = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("Total Salary: "+salDetails.getSum());
		System.out.println("Average Salary: "+salDetails.getAverage());
		
		
		System.out.println("=================================================================================");
		System.out.println("9.  List down the employees of each department.");
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment))
						.entrySet()
						.forEach(System.out::println);
		
		
		System.out.println("=================================================================================");
		System.out.println("=================================================================================");
		System.out.println("=================================================================================");
		System.out.println("=================================================================================");
		System.out.println("=================================================================================");
		
		
	}

}
