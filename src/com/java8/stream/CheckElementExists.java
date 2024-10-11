package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class CheckElementExists {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Shelake","Anil","Mane","Sangola","Pandharpur");
		
		strList.stream().filter(s1->s1.equals("Anil")).forEach(System.out::println);
		
		boolean anyMatch = strList.stream().anyMatch(s1->s1.equalsIgnoreCase("sharad"));
		System.out.println("Any Match: "+anyMatch);
	}

}
