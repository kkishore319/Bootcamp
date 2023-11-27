package com.functionalProgramming.day2;

import java.util.List;

public class FP05DistinctAndSorted {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(12,3,3,3,3,2,2,3,5,7,6,23,14,9);
		List<String> courses= List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
		printDistinctNumbers(numbers);
		System.out.println("----------------------------");
		printSortedNumbers(numbers);
		System.out.println("-----------------");
		printDistinctAndSortedNumbers(numbers);
		System.out.println("----------------------------");
		printSortedCourses(courses);
	}

	private static void printSortedNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
		.sorted()
		.forEach(System.out::println);
		
	}

	private static void printSortedCourses(List<String> courses) {
		// TODO Auto-generated method 

		courses.stream()
		.sorted()
		.forEach(System.out::println);
		
	}

	private static void printDistinctAndSortedNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
	}

	private static void printDistinctNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
		.distinct()
		.forEach(System.out::println);
		
	}

}
