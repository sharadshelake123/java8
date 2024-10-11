package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Shelake","Anil","Mane","Sangola","Pandharpur");
		
		Optional<String> first = strList.stream().findFirst();
		
		first.ifPresent(str->System.out.println(str));
		
		System.out.println();
		System.out.println("Find 2nd last");
		
		
		Optional<String> first2 = strList.stream().skip(strList.size()-2).findFirst();
		
		first2.ifPresent(str-> System.out.println(str));
		
	}

}
