package com.functionalProgramming.day6;

import java.util.stream.LongStream;

public class FP07Parallelizing {
	public static void main(String[] args) {
		
		//adding 1,10000000
		long time= System.currentTimeMillis();
		System.out.println(
		LongStream.range(1, 1000000000)
				.parallel()
				.sum());
		
		//normally (sequential way) takes 613 ms
		//if we use parallel, it takes 150 ms
		System.out.println(System.currentTimeMillis()-time);
		
		
		
		
	}

}
