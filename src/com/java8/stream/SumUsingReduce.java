package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumUsingReduce {
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		
		
		Optional<Integer> sum = intList.stream().reduce(Integer::sum);
		
		sum.ifPresent(s->System.out.println(s));
		
		Integer sum2 = intList.stream().reduce(0,Integer::sum);
		
		System.out.println(sum2);
	}

}
