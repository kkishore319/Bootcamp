package com.functionalProgramming.day3;

import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviourParameterization {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(1,3,5,6,3,2,6,8);

		
//		filterAndPrint(numbers,  x->x%2==0);
//		
//		filterAndPrint(numbers,  x->x%2!=0);
//		
		filterAndPrint(numbers, x->x>7);
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> oddPredicate) {
		numbers.stream()
		.filter(oddPredicate)
		.forEach(System.out::println);
	}

}
