package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsReverseOrder {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Jon","Devid","Rohit","Peter","Jack","Sunil","Suresh");
		
		List<String> sortedList = strList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println("Original List: "+strList);
		System.out.println("Sorted List: "+sortedList);
	}

}
