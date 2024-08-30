package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Concatenate2Streams {

	public static void main(String[] args) {

		List<Integer> intList1 = Arrays.asList(1,5,6,9,8,7,3);
		List<Integer> intList2 = Arrays.asList(1,5,6,9,8,7,3);
		Stream<Integer> strStream = Stream.concat(intList1.stream(), intList2.stream());
		strStream.sorted(Comparator.reverseOrder()).forEach(s->System.out.print(" "+s));	
	}

}
