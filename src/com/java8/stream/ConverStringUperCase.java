package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverStringUperCase {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("Sharad","Jon","Devid","Rohit","Peter","Jack","Sunil","Suresh");
		
		List<String> strUpperCaseList = strList.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println("Original List: "+strList);
		System.out.println("Upper Cse List: "+strUpperCaseList);

	}

}
