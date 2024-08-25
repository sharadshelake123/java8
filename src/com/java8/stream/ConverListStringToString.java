package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverListStringToString {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("Sharad","Jon","Devid","Rohit","Peter","Jack","Sunil","Suresh");
		
		String result = String.join(", ", strList);
		
		System.out.println(result);
		
		String result2 = strList.stream().collect(Collectors.joining(", "));
		
		System.out.println(result2);
	}

}
