package com.java8.stream;

import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfOccurrencesOfEachCharacter {

	public static void main(String[] args) {
		String str = "Sharad Manohar Shelake";
		
		Map<Character, Long> charCount = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(charCount);
	}

}
