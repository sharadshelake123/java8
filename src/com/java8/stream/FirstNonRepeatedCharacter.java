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

		LinkedHashMap<Character, Integer> lHashMap = new LinkedHashMap<>();

		List<Character> charList = str
									.toLowerCase()
									.chars()
									.mapToObj(c -> (char) c)
									.collect(Collectors.toList());

		charList.forEach(c -> {
			if (lHashMap.containsKey(c)) {
				lHashMap.put(c, lHashMap.get(c) + 1);
			} else {
				lHashMap.put(c, 1);
			}
		});
		
		lHashMap.forEach((k,v)->{
			if(v==1) {
				System.out.println("Char: "+k +", Count: "+ v);
				
				
				
				System.exit(0);
			}
		});
		
	}

}
