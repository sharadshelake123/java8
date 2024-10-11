package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByOddEven {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		
		Map<Boolean, List<Integer>> partitionBy = intList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		
		System.out.println(partitionBy);

	}

}
