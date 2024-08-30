/**
 * 
 */
package com.java8.stream;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 1- Write a Java Program to find whether a number is prime or not.
 * 
 */
public class PrimeOrNot {

	/**
	 * Write a Java Program to find whether a number is prime or not.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int inputNum = sc.nextInt();
		
		if(inputNum==0 || inputNum==1) {
			System.out.println("Number is not prime..");
		}
		else if(inputNum == 2) {
			System.out.println("Number is prime..");
		}
		else {
			boolean isPrime = IntStream.rangeClosed(2, inputNum/2).noneMatch(x->inputNum%x==0);
			if(isPrime) {
				System.out.println("Number is prime..");
			}
			else {
				System.out.println("Number is not prime..");
			}
		}
		
		IntStream intList = IntStream.range(1, 10);
		intList.forEach(System.out::println);

	}

}
