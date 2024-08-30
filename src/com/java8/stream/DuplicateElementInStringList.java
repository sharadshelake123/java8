package com.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElementInStringList {

	public static void main(String[] args) {

		List<String> str = Arrays.asList("Sharad","Sharad","Shelake","Tisangi","Solapur","Solapur","Sharad");
		
		str.stream().collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()>=2).forEach(System.out::println);

	}

}
