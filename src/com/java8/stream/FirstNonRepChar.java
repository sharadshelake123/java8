package com.java8.stream;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FirstNonRepChar {

	public static void main(String[] args) {
		
		String str = "Sharad Manoharmnlko SHelake";
		
		str.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1).findFirst().ifPresent(System.out::println);

		Entry<Character, Long> entry = str.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()==1).findFirst().orElse(null);
		
		System.out.println(entry);
		
		Entry<Character, Long> entry2 = str.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()==1).skip(1).findFirst().orElse(null);
		
		System.out.println(entry2);
	}

}
