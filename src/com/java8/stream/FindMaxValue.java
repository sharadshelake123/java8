package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxValue {
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,5,6,3,2,7,88,22,65,254,23,55,199);
		
		Optional<Integer> max = intList.stream().max(Comparator.naturalOrder());
		
		max.ifPresent(m->System.out.println(m));
		
		Optional<Integer> max2nd = intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		max2nd.ifPresent(m2->System.out.print(m2));
	}

}
