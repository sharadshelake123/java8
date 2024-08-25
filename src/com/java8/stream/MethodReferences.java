package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {

	public static void main(String[] args) {
		
		List<String> strList = Arrays.asList("Sharad","Jon","Devid","Rohit","Peter","Jack");
		
		strList.forEach(System.out::println);

	}

}
