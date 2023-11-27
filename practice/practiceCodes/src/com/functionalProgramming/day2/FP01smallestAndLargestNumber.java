package com.functionalProgramming.day2;

import java.util.List;

public class FP01smallestAndLargestNumber {
	public static void main(String[] args) {
		
		List<Integer> numbers= List.of(12,3,4,6,7,9,23,5);
		
		int small= smallestNumber(numbers);
		int large=largestNumber(numbers);
		System.out.println("smallest number "+small+" and Largest number "+large );
		
		
	}

	private static int smallestNumber(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
					.reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y)
				;
	}

	private static int largestNumber(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
					.reduce(0, (x,y)->x<y?y:x)
				;
	}

}
