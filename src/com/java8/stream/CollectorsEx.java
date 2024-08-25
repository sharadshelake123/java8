package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsEx {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("Sharad","Jon","Devid","Rohit","Peter","Jack");
		
		List<String> strListUpperCase = strList.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(strListUpperCase);
	}

}
