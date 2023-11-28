package com.functionalProgramming.day3;

import java.util.List;
import java.util.function.BinaryOperator;

public class FP01Excerise12 {
	public static void main(String[] args) {
		//
		List<Integer> numbers= List.of(1,3,5,6,3,2,6,8);
		
		
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		/// (x,y)->x+y;
		
		BinaryOperator<Integer> sumBinaryOperator2= new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		};
		int sum= numbers.stream()
					.reduce(0,sumBinaryOperator2);
		System.out.println(sum);
	}

}
