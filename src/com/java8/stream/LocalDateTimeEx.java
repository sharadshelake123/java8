package com.java8.stream;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
		System.out.println(ldt.getYear()+"-"+ldt.getMonth().getValue()+"-"+ldt.getDayOfMonth());
		
		Period p = Period.between(LocalDate.of(1991, 9, 16),LocalDate.now());
		
		System.out.println(p.getYears()+"-"+p.getMonths()+"-"+p.getDays());
		
		System.out.println(LocalDate.ofYearDay(2020, 66));
		
		

	}

}
