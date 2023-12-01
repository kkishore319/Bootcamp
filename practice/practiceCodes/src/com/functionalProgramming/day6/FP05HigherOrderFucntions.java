package com.functionalProgramming.day6;

import java.util.List;
import java.util.function.Predicate;

public class FP05HigherOrderFucntions {
	public static void main(String[] args) {
		//returning functions in a method
		
		List<Integer> numbers= List.of(12,2,4,5,7,9,23,45);
		
		Predicate<Integer> predicateforNumLessthan10 = cutoffNum(10);
		
		
		numbers.stream()
			.filter(predicateforNumLessthan10)
			.forEach(System.out::println);;
	}

	private static Predicate<Integer> cutoffNum(int cutoffNum) {
		return n->n<cutoffNum;
	}

}
