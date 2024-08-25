package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMap {

	public static void main(String[] args) {

		List<List<String>> names = Arrays.asList(Arrays.asList("Peter", "Sam"), Arrays.asList("Mike", "John"));
		names.stream()
		     .flatMap(List::stream)
		     .forEach(System.out::println); // Outputs Peter, Sam, Mike, John
	}

}
