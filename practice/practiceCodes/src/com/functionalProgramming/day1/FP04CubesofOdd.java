package com.functionalProgramming.day1;

import java.util.List;

public class FP04CubesofOdd {
	public static void main(String[] args) {
		
		
		List<Integer> numbers=List.of(1,2,3,4,5,6);
		printCubesOfOdd(numbers);
	}

	private static void printCubesOfOdd(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
			.filter(n->n%2!=0)
			.map(n->n*n*n)
			.forEach(System.out::println);
		
	}

}
