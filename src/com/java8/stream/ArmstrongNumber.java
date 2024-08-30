/**
 * 
 */
package com.java8.stream;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Write a Java Program to check Armstrong numbers.
 */
public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Number: ");
			int inNumber = sc.nextInt();
			int len = String.valueOf(inNumber).length();
			
			int sum = String.valueOf(inNumber)
					.chars()
					.map(Character::getNumericValue)
					.map(digit->(int)Math.pow(digit, len))
					.sum();
			
			if(sum==inNumber) {
				System.out.println("Number is prime..");
			}
			else {
				System.out.println("Number is not prime..");
			}
		}
	}

}
