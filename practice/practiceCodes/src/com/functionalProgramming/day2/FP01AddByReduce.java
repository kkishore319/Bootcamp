package com.functionalProgramming.day2;

import java.util.List;

public class FP01AddByReduce {
	public static void main(String[] args) {
		
		List<Integer> numbers= List.of(1,3,5,6,3,2,6,8);
		
		int sum= addAllNumbersByMethodRef(numbers);
		int sum1=addAllNumbersBylambda(numbers);
		int sum2=addAllNumbersByMethodRefOFObjectClass(numbers);
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
	}
	
	private static int addAllNumbersByMethodRefOFObjectClass(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
					.reduce(0, Integer::sum)
				;
	}

	private static int addAllNumbersBylambda(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
					.reduce(0, (x,y)->x+y)
				;
	}

	private static int add(int a,int b) {
		return a+b;
	}
	
	

	private static int addAllNumbersByMethodRef(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
					.reduce(0, FP01AddByReduce::add) 
					;
	}

}
