package com.functionalProgramming.day6;

import java.util.List;

public class FP06PerformanceOFStreams {
	public static void main(String[] args) {
		
		
		List<String> courses= List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
		System.out.println( 
				courses.stream()
				.peek(System.out::println)
				.filter(course->course.length()>11)
				.map(String::toUpperCase)
				.peek(System.out::println)
				.findFirst()
				);
		//here intermediate operations are lazy and they will start by terminal operation 
	}

}
