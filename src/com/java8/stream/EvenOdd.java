package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1, 5, 3, 6, 54, 111, 548, 545, 264, 6565, 658);
		
		List<Integer> evenList = intList.stream().filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> oddList = intList.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
		System.out.println("Even ist: "+evenList);
		System.out.println("Odd List: "+ oddList);
		
		
		Map<Boolean, List<Integer>> partitionList = intList.stream().collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println(partitionList);
	}

}
