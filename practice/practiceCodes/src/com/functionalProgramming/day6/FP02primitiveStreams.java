package com.functionalProgramming.day6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FP02primitiveStreams {
	public static void main(String[] args) {
		System.out.println(IntStream.range(1, 11).sum());
		
		System.out.println(IntStream.iterate(1, i->i+2)
									.limit(10)	
									//.peek(System.out::println)
									.sum());
		System.out.println(IntStream.iterate(2, i->i+2)
									.limit(10)
									.sum());
		IntStream.iterate(0, i->i<100, i->i+2).peek(System.out::println).sum();
		IntStream.iterate(1 , i->i<10, i->i*2).peek(System.out::println).sum();
		
		System.out.println(IntStream.iterate(2, i->i+2)
				.limit(10)
				.boxed() 
				.collect(Collectors.toList())
				);
	}

}
