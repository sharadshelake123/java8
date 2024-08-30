package com.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindDuplicateNumInList {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1,2,5,8,9,6,5,4,7,8,9,6,3,22,54,22,25,52,52);
		
		intList.stream()
				.collect(Collectors.groupingBy(n->n,LinkedHashMap::new,Collectors.counting()))
				.forEach((k,v)->{
					if(v>=2) {
						System.out.println(k);
						//System.exit(0);
					}
				});
		
		Entry<Integer, Long> entry2 = intList.stream()
		.collect(Collectors.groupingBy(n->n,LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()==1).findFirst().get();
	
		System.out.println("entry2: "+entry2);
		
		intList.stream()
				.collect(Collectors.groupingBy(n->n,LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>=2).forEach(System.out::println);
			
		
	}

}
