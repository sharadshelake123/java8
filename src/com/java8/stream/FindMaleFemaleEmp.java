package com.java8.stream;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaleFemaleEmp {

	public static void main(String[] args) {
		
		Employee emp = new Employee();

		List<Employee> empList = emp.getEmpList();
		
		Map<String, Long> genderCount = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println("Gender Count: "+genderCount);
		System.out.println("========================================");
		
		List<String> deptList = empList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		
		System.out.println("Dept List: "+deptList);
		System.out.println("========================================");
		Map<String, Double> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		
		System.out.println("Dept Avg Salary: "+collect);
		System.out.println("========================================");
		System.out.println("Employee's who are joinsed after 2015");
		System.out.println("========================================");
		empList.stream().filter(e->e.getYearOfJoining()>2015).forEach(s->System.out.println(s.getName()));
		System.out.println("========================================");
		System.out.println("Dept wise emp count:");
		empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().forEach(System.out::println);
		System.out.println("========================================");
		
		System.out.println("Oldest Emplyee Details:");
		
		empList.stream().max(Comparator.comparingInt(Employee::getAge)).map(e->e).stream().forEach(System.out::println);
		
		System.out.println("========================================");
		
		DoubleSummaryStatistics salData = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("Avg Salary: "+salData.getAverage());
		System.out.println("Total Salary: "+salData.getSum());
		System.out.println("========================================");
		
		System.out.println("Dept Employee List: ");
		
		Map<String, List<Employee>> deptEmp = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		System.out.println(deptEmp);
		System.out.println("========================================");
		
		System.out.println("Highest Expirenced Employee:");
		
		empList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).map(e->e).stream().forEach(System.out::println);
		System.out.println("========================================");
		
	}

}
