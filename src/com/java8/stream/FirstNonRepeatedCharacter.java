package com.java8.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "Sharad Manohar Shelake";

		Character firstNonRepChar = str
									.toLowerCase()
									.chars()
									.mapToObj(c -> (char) c)
									.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
									.entrySet()
									.stream()
									.filter(entry -> entry.getValue() == 1)
									.map(Map.Entry::getKey)
									.findFirst()
									.orElse(null);

		System.out.println(firstNonRepChar);
		
	}

}
