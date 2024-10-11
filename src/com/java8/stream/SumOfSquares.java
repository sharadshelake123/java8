package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2,5,6,9,3,1,4,55,77,88,66,321,256,444);
		
		int sumOfSqr = intList.stream().mapToInt(n->n*n).sum();
		
		System.out.println("Numbers sqr sum:"+sumOfSqr);
		
		int sum = intList.stream().mapToInt(n->n).sum();
		
		System.out.println("Numbers sum: "+sum);

	}

}
