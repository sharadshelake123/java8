package com.java8.stream;

import java.util.stream.IntStream;

public class IntSteamOprations {

	public static void main(String[] args) {
		
		IntStream rangeClosed = IntStream.rangeClosed(2, 13/2);
		
		rangeClosed.forEach(System.out::println);
		
	}

}
