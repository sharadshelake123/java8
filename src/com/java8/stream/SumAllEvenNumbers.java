package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class SumAllEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		int sum = intList.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);

	}

}
