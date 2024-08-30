package com.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ComOprations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1,5,6,9,8,7,3,1);
		
		Set<Integer>  intSet = new HashSet<>();
		
		intList.stream().filter(n-> !intSet.add(n)).collect(Collectors.toList());
		
		if(intSet.size() == intList.size())
			System.out.println("False");
		else
			System.out.println("True");

	}

}
