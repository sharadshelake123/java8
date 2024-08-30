package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindFirstElementInList {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,5,6,9,8,7,3);
		
		intList.stream().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
		
		intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
