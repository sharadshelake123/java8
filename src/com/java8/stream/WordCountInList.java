package com.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountInList {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Sharad","Shelke","Shelake","Tisangi");
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		
		strList.stream().collect(Collectors.groupingBy(s->s,LinkedHashMap::new, Collectors.counting()))
		.entrySet().forEach(s->System.out.println(s.getKey()+" "+s.getKey().length()));
		System.out.println();
		strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().forEach(System.out::println);
		
		strList.forEach(s->{
			lh.put(s, s.length());
		});
		
		System.out.println(lh);

	}

}
