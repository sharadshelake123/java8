package com.java8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class FirstDuplicateChar {

	public static void main(String[] args) {

		String str = "Shsarad Manohar Shelake";

		List<Character> charList = str.toLowerCase().replace(" ", "").chars().mapToObj(c -> (char) c)
				.collect(Collectors.toList());

		HashMap<Character, Integer> charCount = new HashMap<>();
		AtomicBoolean f = new AtomicBoolean(false);

		charList.forEach(c -> {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
				if(!f.get()) {
					System.out.println("First dupliucate Char is: "+c);
					f.set(true);
				}
					
			} else {
				charCount.put(c, 0);
			}
		});
		
		charCount.forEach((k,v)->{
			if(v>=2)
				System.out.println("Char: "+k+",Count = "+v);
		});

	}

}
