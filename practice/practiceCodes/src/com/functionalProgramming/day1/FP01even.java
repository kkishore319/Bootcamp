package com.functionalProgramming.day1;

import java.util.List;

public class FP01even {
	public static void main(String[] args) {
		
		List<Integer> num = List.of(12, 3, 5, 43, 3, 56, 2, 5, 9, 4);

		printAllEvenNumbersFunctional(num);
	}	

	private static boolean isEven(int number) {
		return number%2==0;
	}
	private static void printAllEvenNumbersFunctional(List<Integer> list) {
		
		list.stream()
			.filter(FP01even::isEven)//filter via method reference
			.filter(num->num%2==0) //filter via lambda function
			.forEach(System.out:: println);
	}
	
	

}
