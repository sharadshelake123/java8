package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Shelake","Anil","Mane","Sangola","Pandharpur");
		
		Map<Integer, List<String>> listToMap = strList.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(listToMap);
		
		Map<String, Integer> listToMap2 = strList.stream().collect(Collectors.toMap(s1 -> s1, s1 -> s1.length()));
		
		System.out.println(listToMap2);
	}
}
