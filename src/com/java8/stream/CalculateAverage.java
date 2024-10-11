package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class CalculateAverage {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2,5,6,9,3,1,4,55,77,88,66,321,256,444,9999);
		
		double average = intList.stream().mapToDouble(n->n).average().orElse(0.0);
		
		System.out.println(average);
	}
}
