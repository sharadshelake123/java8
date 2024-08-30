package com.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,5,4,7,8,9,6,3,2,5,4,5);
		
						intList
						.stream()
						.collect(Collectors.groupingBy(n->n,LinkedHashMap::new,Collectors.counting()))
						.entrySet()
						.stream()
						.filter(entry->entry.getValue()>=2)
						.forEach(System.out::println);
						
						System.out.println("Find first duplicate number: ");
						
						Set<Integer> intSet = new HashSet<>();
						
						intList.forEach(n->{
							boolean f= intSet.add(n);
							System.out.println(f);
							if(!f) {
								System.out.println("First Duplicate Number: "+ n);
								System.exit(0);
							}
						});
	}
}
