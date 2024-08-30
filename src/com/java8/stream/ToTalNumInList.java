package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ToTalNumInList {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(51,15,36,18,1,58,11,55,142,124,178,169,52);
		
		long count = intList.stream().count();
				
		System.out.println(count);
		
		intList.stream().sorted(Comparator.reverseOrder()).findFirst().ifPresent(System.out::println);
		
		Integer max = intList.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println("Max: "+ max);

	}

}
