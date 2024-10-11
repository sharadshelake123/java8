package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Shelake","Anil","Mane","Sangola","Pandharpur");
		
		Map<Integer, List<String>> groupByLenght = strList.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(groupByLenght);
	}

}
