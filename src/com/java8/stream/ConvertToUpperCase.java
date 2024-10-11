package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Shelake","Anil","Mane","Sangola","Pandharpur");
		
		strList.stream().map(String::toUpperCase).forEach(s1->System.out.print(s1+","));
		
		String strJoined = strList.stream().collect(Collectors.joining(",")).toUpperCase();
		System.out.println();
		System.out.println(strJoined);
		
	}

}
