package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class SortStringsLambda {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Shelake","Anil","Mane","Sangola","Pandharpur");
		List<String> strList2 = Arrays.asList("Sharad","Shelake","Anil","Mane","Sangola","Pandharpur");
		
		strList.sort((s1,s2) -> s1.compareTo(s2));
		
		strList.forEach(s1->System.out.println(s1));
		
		strList2.stream().sorted().forEach(s1->System.out.println(s1));

	}

}
