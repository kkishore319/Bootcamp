package com.functionalProgramming.day6;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FP03Bigintcustomclass {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(IntStream.rangeClosed(1, 50).reduce(1,(x,y)->x*y));
		System.out.println(LongStream.rangeClosed(1, 50).reduce(1,(x,y)->x*y));
		System.out.println(LongStream.rangeClosed(1, 20).reduce(1,(x,y)->x*y));
		System.out.println(LongStream.rangeClosed(1, 40).reduce(1,(x,y)->x*y));
		System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply));
	}

}
