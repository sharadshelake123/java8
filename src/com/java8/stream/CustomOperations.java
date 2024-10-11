package com.java8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomOperations {

	public static void main(String[] args) {
		Employee emp = new Employee();
		List<Employee> empList = emp.getEmpList();
		
		empList.stream().sorted(Comparator.comparing(Employee::getName))
						.collect(Collectors.toList())
						.forEach(e1->System.out.println(e1.getName()));

	}

}
