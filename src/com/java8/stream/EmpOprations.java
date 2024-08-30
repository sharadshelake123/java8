package com.java8.stream;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpOprations {

	public static void main(String[] args) {
		Employee emp = new Employee();
		List<Employee> empList = emp.getEmpList();
		System.out.println("================================================================================");
		System.out.println("1. Find out the count of male and female employees present in the organization?");
		
		empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).entrySet().forEach(System.out::println);

		System.out.println("================================================================================");
		System.out.println("2. Write a program to print the names of all departments in the organization.");

		empList.stream().map(Employee::getDepartment).forEach(System.out::println);
		
		System.out.println("================================================================================");
		System.out.println("3. Find the average age of Male and Female Employees.");
		
		Map<String, Double> empAgeAvg = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
		System.out.println(empAgeAvg);
		
		System.out.println("================================================================================");
		System.out.println("4. Get the Names of employees who joined after 2015.");

		empList.stream().filter(e->e.getYearOfJoining()>2015).map(Employee::getName).forEach(System.out::println);
		
		System.out.println("================================================================================");
		System.out.println("5. Count the number of employees in each department.");
		
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).forEach((k,v)->System.out.println(k+": "+v));
		
		
		System.out.println("================================================================================");
		System.out.println("6. Find out the average salary of each department.");
		
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).entrySet().forEach(System.out::println);
		
		System.out.println("================================================================================");
		System.out.println("7. Find out the oldest employee, his/her age and department?");
		
		 Employee empOldest = empList.stream().max(Comparator.comparing(Employee::getAge)).stream().findFirst().orElse(null);
		
		 System.out.println("Name: "+empOldest.getName());
		 System.out.println("Age: "+empOldest.getAge());
		 System.out.println("Dept: "+empOldest.getDepartment());
		 
		 System.out.println("================================================================================");
		 System.out.println("8. Find out the average and total salary of the organization.");
		 
		DoubleSummaryStatistics avgAndSumSal = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		 
		 
		 System.out.println("Avg Sal: "+avgAndSumSal.getAverage());
		 System.out.println("Total Sal: "+avgAndSumSal.getSum());
		 System.out.println("Min Sal: "+avgAndSumSal.getMin());
		 System.out.println("Max Sal: "+avgAndSumSal.getMax());
		 System.out.println("Count: "+avgAndSumSal.getCount());
		 
		 System.out.println("======================================================================================================================");
		 System.out.println("9. List down the employees of each department.");
		 
		 empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList())).entrySet().forEach(System.out::println);
		 
		 System.out.println("======================================================================================================================");
		 System.out.println("10. Find out the highest experienced employees in the organization");
		 
		 empList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).stream().forEach(System.out::println);
		 
		 System.out.println("======================================================================================================================");
		 
	}

}
