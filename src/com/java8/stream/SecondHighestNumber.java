package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(2,5,6,9,3,1,4,55,77,88,66,321,256,444);
		
		Optional<Integer> secondHighest = intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		secondHighest.ifPresent(s2->System.out.println(s2));

	}

}
