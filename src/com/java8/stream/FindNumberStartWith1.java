package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartWith1 {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(51,15,36,18,1,58,11,55,142,124,178,169);
		
		intList.stream().filter(n->n.toString().startsWith("1")).forEach(System.out::println);
	}

}
