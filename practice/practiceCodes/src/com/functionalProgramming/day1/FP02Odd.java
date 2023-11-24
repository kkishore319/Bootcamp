package com.functionalProgramming.day1;

import java.util.List;

public class FP02Odd {
	public static void main(String[] args) {
		List<Integer> num = List.of(1,2, 3,5, 5, 43, 34, 56, 24, 15, 9, 4);

		printAllOddNumbersFunctional(num); //excercise 1
	
	}

	private static void printAllOddNumbersFunctional(List<Integer> num) {
		num.stream()
			.filter(i->i%2!=0)
			.forEach(System.out::println);
	}

}
