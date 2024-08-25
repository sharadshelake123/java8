package com.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromIntList {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,5,3,6,54,111,548,545,264,6565,658,5);
		Set<Integer> intSet = new HashSet<>();
		List<Integer> uniqueList = intList.stream().filter(n->intSet.add(n)).collect(Collectors.toList());
		List<Integer> uniqueList2 = intList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueList2);//first Way
		System.out.println(uniqueList);//2nd way
	}

}
