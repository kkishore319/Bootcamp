package com.functionalProgramming.day2;

import java.util.List;

public class FP04SumofOdd {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(12,3,5,7,6,23,14,9);
		int sum=sumOfOdds(numbers);
		System.out.println(sum);
		
	}

	private static int sumOfOdds(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
				.filter(a->a%2!=0)
				.reduce(0, Integer::sum)
				
				;
	}

}
