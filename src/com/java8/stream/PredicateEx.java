package com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class PredicateEx {
	
	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Sharad","Jon","Devid","Rohit","Peter","Jack","Sunil","Suresh");
		
		strList.stream().filter(s->s.startsWith("o",1) || s.startsWith("d",5)).forEach(System.out::println);
	}
	
	

}
