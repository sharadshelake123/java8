package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Department {

	private String departmentName;

	private Integer noOfEmployees;

	public Department(String departmentName, Integer noOfEmployees) {
		this.departmentName = departmentName;
		this.noOfEmployees = noOfEmployees;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(Integer noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

}

class Employee2 {
	int id;

	String name;

	int age;

	String gender;

	Department department;

	int yearOfJoining;

	double salary;

	public Employee2(int id, String name, int age, String gender, Department department, int yearOfJoining,
			double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public Department getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
}

public class Java8Streams {

	public static void main(String[] args) {

		List<Employee2> employeeList = new ArrayList<Employee2>();

		Department hr = new Department("HR", 50);
		Department ops = new Department("OP", 25);
		Department tech = new Department("Tech", 150);

		employeeList.add(new Employee2(111, "Jiya Brein", 32, "Female", hr, 2011, 25000.0));
		employeeList.add(new Employee2(122, "Paul Niksui", 25, "Male", ops, 2015, 13500.0));
		employeeList.add(new Employee2(133, "Martin Theron", 29, "Male", tech, 2012, 18000.0));
		employeeList.add(new Employee2(144, "Murali Gowda", 28, "Male", hr, 2014, 32500.0));
		employeeList.add(new Employee2(155, "Nima Roy", 27, "Female", ops, 2013, 22700.0));
		employeeList.add(new Employee2(166, "Iqbal Hussain", 43, "Male", tech, 2016, 10500.0));
		employeeList.add(new Employee2(177, "Manu Sharma", 35, "Male", hr, 2010, 27000.0));
		employeeList.add(new Employee2(188, "Wang Liu", 31, "Male", ops, 2015, 34500.0));
		employeeList.add(new Employee2(199, "Amelia Zoe", 24, "Female", tech, 2016, 11500.0));
		employeeList.add(new Employee2(200, "Jaden Dough", 38, "Male", hr, 2015, 11000.5));
		employeeList.add(new Employee2(211, "Jasna Kaur", 27, "Female", ops, 2014, 15700.0));
		employeeList.add(new Employee2(222, "Nitin Joshi", 25, "Male", tech, 2016, 28200.0));
		employeeList.add(new Employee2(233, "Jyothi Reddy", 27, "Female", hr, 2013, 21300.0));
		employeeList.add(new Employee2(244, "Nitin Joshi", 24, "Male", ops, 2017, 10700.5));
		employeeList.add(new Employee2(255, "Jyothi Reddy", 23, "Male", tech, 2018, 12700.0));
		employeeList.add(new Employee2(266, "Sanvi Pandey", 26, "Female", hr, 2015, 28900.0));
		employeeList.add(new Employee2(277, "Jaden Dough", 31, "Male", ops, 2012, 35700.0));
		
		// salary greater than 10k
		List<Employee2> listFilteredSalary = employeeList.stream().filter(e -> e.getSalary() > 10000)
				.collect(Collectors.toList());
		listFilteredSalary.forEach(System.out::println);

		System.out.println();
		// how many male female employees are there in company
		Map<String, Long> mapFilteredGender = employeeList.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.counting()));
		mapFilteredGender.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
		});
		System.out.println();

		// print name of all departments in organization
		employeeList.stream().map(Employee2::getDepartment).distinct().forEach(System.out::println);
		System.out.println();

		// avg age of male and female employees
		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee2::getGender, Collectors.averagingInt(Employee2::getAge)));

		System.out.println(avgAgeOfMaleAndFemaleEmployees);

		// highest paid employee in organization
		Optional<Employee2> employeeOptional = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee2::getSalary)));
		if (employeeOptional.isPresent()) {
			Employee2 e = employeeOptional.get();
			System.out.println(e.getName() + " - " + e.getSalary());
		}
		System.out.println();

		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).forEach(System.out::println);// prints whole
																									// employee class
		System.out.println();
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee2::getName)
				.forEach(System.out::println);// prints only name of the employees
		System.out.println();

		// number of employees in each department
		Map<String, Long> noOfEmpInDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment().getDepartmentName(), Collectors.counting()));
		System.out.println(noOfEmpInDepartment);
		System.out.println();

		// average salary of each department

		Map<String, Double> avgSalaryDeptWise = employeeList.stream().collect(Collectors.groupingBy(
				e -> e.getDepartment().getDepartmentName(), Collectors.averagingDouble(Employee2::getSalary)));
		System.out.println(avgSalaryDeptWise);
		System.out.println();

		System.out.println();
		// employees greater than 25 and less than 25 //important
		Map<Boolean, List<Employee2>> ageFilteredList = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		Set<Entry<Boolean, List<Employee2>>> set = ageFilteredList.entrySet();

		for (Entry<Boolean, List<Employee2>> entry : set) {
			if (entry.getKey()) {
				System.out.println("employee less than 25");
			} else {
				System.out.println("employee greater than 25");
			}

			List<Employee2> emp = entry.getValue();
			for (Employee2 e : emp) {
				System.out.println(e.getName());
			}

		}

		System.out.println();

		// employee with max age
		Optional<Employee2> optionalOfEmp = employeeList.stream().max(Comparator.comparingInt(Employee2::getAge));
		Employee2 emp = optionalOfEmp.get();
		System.out.println(emp.getName());

		// employee with sales department and sorted by name
		System.out
				.println(employeeList.stream().filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("hr"))
						.map(Employee2::getName).sorted((e1, e2) -> e1.compareTo(e2)).collect(Collectors.toList()));

		employeeList.stream().filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("hr"))
				.sorted(Comparator.comparing(Employee2::getName)).forEach(e -> System.out.println(e.getName()));
		System.out.println();

		// Find distinct department names that employees work for.
		employeeList.stream().map(e -> e.getDepartment().getDepartmentName()).distinct().forEach(System.out::println);

		// Create a comma separate string of department names sorted alphabetically.
		String s = employeeList.stream().map(e -> e.getDepartment().getDepartmentName()).distinct().sorted().reduce("",
				(a, b) -> (a + "," + b));
		System.out.println(s);

		// number of employees in HR dept
		System.out.println(employeeList.stream().map(e -> e.getDepartment().getDepartmentName())
				.filter(e -> e.equalsIgnoreCase("HR")).count());

		// any employee in HR dept
		if (employeeList.stream().anyMatch(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("HR"))) {
			System.out.println("employee found of HR dept");
		}

		// highest number of employees in all dept
		employeeList.stream().map(e -> e.getDepartment().getNoOfEmployees()).reduce(Integer::max)
				.ifPresent(System.out::println);
		System.out.println();

		// department with highest number of employees
		employeeList.stream().map(Employee2::getDepartment).max(Comparator.comparingInt(Department::getNoOfEmployees))
				.ifPresent(d -> System.out.print(d.getDepartmentName()));

		System.out.println();

		employeeList.stream().map(e -> e.getDepartment().getNoOfEmployees()).distinct().reduce(Integer::sum)
				.ifPresent(e -> System.out.print(e));

		/*--------------------------------------------------------------*/

		List<Integer> numlist = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 32);

		numlist.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println();
		numlist.stream().filter(n -> n.toString().startsWith("1")).forEach(System.out::println);
		// or below
		numlist.stream().map(n -> n + "").filter(n -> n.startsWith("1")).forEach(System.out::println);

		System.out.println();

		// find duplicate elements in the list
		Set<Integer> set1 = new HashSet<Integer>();
		numlist.stream().filter(n -> !set1.add(n)).forEach(System.out::println);

		// find first elt in array
		System.out.println();
		numlist.stream().findFirst().ifPresent(System.out::println);

		lineBreak();
		// total no pf elt present in list
		print(numlist.stream().count());

		lineBreak();
		// max value present in array
		print(numlist.stream().max(Integer::compare).get());

		lineBreak();
		// first non repeated character
		String input = "Java Hungry Blog Alive is Awesome"; // very important
		input.chars().mapToObj(str -> Character.toLowerCase(Character.valueOf((char) str)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);
		lineBreak();
		// first repeated character
		input.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() != 1).map(entry -> entry.getKey()).findFirst()
				.ifPresent(System.out::println);
		
		lineBreak();
		numlist.stream().sorted().forEach(System.out::println);
		
		lineBreak();
		numlist.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		String[] strArr = {"abd","","def","","fjg","","","qwe"};
		//converting to String array back is important
		String[] answer = Arrays.stream(strArr).map(str->String.valueOf(str)).filter(str->!str.equals("")).toArray(String[]::new);
		List<String> ans = Arrays.stream(strArr).map(str->String.valueOf(str)).filter(str->!str.equals("")).collect(Collectors.toList());
		
		//way to create List<String> to String[]
		String[] answ = ans.toArray(new String[0]);
		
		Arrays.stream(answer).forEach(System.out::println);
		
		//sorting a string
		String string = "abdfgaabbddfgfhf";
		string.chars().mapToObj(str->Character.valueOf((char)str)).sorted().forEach(System.out::print);
		lineBreak();
		
		//sort employees on basis of name and if name is same then sort on basis of salary
		List<Employee2> el = employeeList.stream().sorted(Comparator.comparing(Employee2::getName).thenComparing(Employee2::getSalary)).collect(Collectors.toList());
		el.forEach(e->System.out.println(e.getName()+" "+e.getSalary()));
		
		
		List<Integer> nums = Arrays.asList(1,2,3,2,5,4,5,5,6);
		int[] nums1  = {1,2,3,2,5,4,5,5,6};
		
		nums.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::print);
		Arrays.stream(nums1).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::print);
	
	}

	private static void lineBreak() {
		System.out.println("*********************************");
	}

	private static void print(Object s) {
		System.out.println(s);
	}

}
