package com.java8.stream;

import java.util.HashSet;
import java.util.Set;

public class FirstRepCharInString {

	public static void main(String[] args) {
		
		String str = "Sharad Manohar SHelake";

		Set<Character> repChar = new HashSet<>();
		
		Character orElse = str.toLowerCase().chars().mapToObj(c->(char)c).filter(c->!repChar.add(c)).findFirst().orElse(null);
		
		System.out.println(orElse);
		
	}

}
