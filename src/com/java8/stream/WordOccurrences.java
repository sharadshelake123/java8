package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class WordOccurrences {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Shelake","Anil","Mane","Sangola","Pandharpur","Sharad");
		
		Map<String, Long> wordCount = strList.stream().collect(Collectors.groupingBy(w->w,Collectors.counting()));

		System.out.println(wordCount);
		
		List<Entry<String, Long>> collect = strList.stream().collect(Collectors.groupingBy(w->w,Collectors.counting())).entrySet()
						.stream().filter(m-> m.getValue()>=2).collect(Collectors.toList());
		
		System.out.println(collect);
		
		System.out.println();
		
		strList.stream().collect(Collectors.groupingBy(w->w,Collectors.counting())).entrySet()
		.stream().filter(m-> m.getValue()>=2).forEach(System.out::println);
		
	}

}
