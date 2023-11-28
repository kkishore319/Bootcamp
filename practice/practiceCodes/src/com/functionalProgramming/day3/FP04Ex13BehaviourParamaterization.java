package com.functionalProgramming.day3;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP04Ex13BehaviourParamaterization {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(1,3,5,6,3,2,6,8);
		
		List<Integer> sqList= mapAndCollect(numbers,  x->x*x);
		List<Integer> cubList= mapAndCollect(numbers,  x->x*x*x);
		List<Integer> doubledList= mapAndCollect(numbers, x->x+x);
		
		System.out.println(sqList);
		System.out.println(cubList);
		System.out.println(doubledList);
	}

	private static List<Integer> mapAndCollect(List<Integer> numbers,
			Function<? super Integer, ? extends Integer> mapper) {
		return numbers.stream()
									.map(mapper)
									.collect(Collectors.toList());
	}

}
