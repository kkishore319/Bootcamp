package com.functionalProgramming.day1;

import java.util.List;

public class FP01 {
	public static void main(String[] args) {

		List num = List.of(12, 3, 5, 43, 3, 56, 2, 5, 9, 4);

		printAllNumbersInFunctional(num);

	}

	private static void printAllNumbersInFunctional(List<Integer> list) {
		// print all numbers of a list via method reference

		// how to do

		// stream() will return sequential numbers
		list.stream().forEach(FP01::print);
	}

	static void print(int number) {
		System.out.println(number);
	}

}
