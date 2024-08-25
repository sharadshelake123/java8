package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.OptionalInt;


public class MaxValueInListInteger {

	public static void main(String[] args) {


		List<Integer> intList = Arrays.asList(1,5,3,6,54,111,548,545,264,6565,658);
		
		int maxNo = intList.stream().mapToInt(i->i).max().orElseThrow(NoSuchElementException::new);
		
		OptionalInt maxNo2 = intList.stream().mapToInt(i->i).max();
		
		System.out.println(maxNo);
		
		System.out.println(maxNo2.isPresent());

	}

}
