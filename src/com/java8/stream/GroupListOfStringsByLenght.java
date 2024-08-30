package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupListOfStringsByLenght {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("Sharad","Jon","Devid","Rohit","Peter","Jack","Sunil","Suresh");
		
		 Map<Integer, List<String>> grpString = strList.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(grpString);
		
		
	}

}
