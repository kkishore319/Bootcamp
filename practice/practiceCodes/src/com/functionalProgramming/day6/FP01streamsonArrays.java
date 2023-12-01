package com.functionalProgramming.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FP01streamsonArrays {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(12,4,5,6,7,8,9,45,6,10);
		
		System.out.println(numbers.stream());
		System.out.println(Stream.of(numbers));
		
		int[] numArr= {12,4,5,6,7,8,9,45,6,10};
		System.out.println( Arrays.stream(numArr));
		
		System.out.println(Arrays.stream(numArr).count());
		System.out.println(Arrays.stream(numArr).max());
		System.out.println(Arrays.stream(numArr).min());
		System.out.println(Arrays.stream(numArr).sum());
		System.out.println(Arrays.stream(numArr).average());
		Arrays.stream(numArr).sorted().forEach(System.out::print);;
	}

}
