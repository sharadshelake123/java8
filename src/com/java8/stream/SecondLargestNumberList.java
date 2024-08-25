package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class SecondLargestNumberList {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 5, 3, 6, 54, 111, 548, 545, 264, 6565, 658);

		Integer max2 = intList.stream().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList()).get(0);
		
		int secondMax = intList
				.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElseThrow(NoSuchElementException::new);
		
		System.out.println(max2);
		System.out.println(secondMax);
	}

}
