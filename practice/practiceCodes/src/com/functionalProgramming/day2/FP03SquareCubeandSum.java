package com.functionalProgramming.day2;

import java.util.List;

public class FP03SquareCubeandSum {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(12,3,5,7,6,23,14,9);
		int sumOfSq=sumOfSquares(numbers);
		int sumofCu= sumOfCubes(numbers);
		System.out.println(sumofCu);
		System.out.println(sumOfSq);
		
	}

	private static int sumOfCubes(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
					.map(a->a*a*a)
					.reduce(0, (x,y)->x+y)
					
				;
	}

	private static int sumOfSquares(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
				.map(a->a*a)
				.reduce(0, (x,y)->x+y)
				
			;
	}

}
