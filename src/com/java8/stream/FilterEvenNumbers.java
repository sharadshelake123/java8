package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println(evenNumbers); 
        // Output: [2, 4, 6, 8, 10]
        
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
        
        numbers.stream().filter(n->n%2==0).forEach(n1->System.out.print(n1+","));
    }
}
