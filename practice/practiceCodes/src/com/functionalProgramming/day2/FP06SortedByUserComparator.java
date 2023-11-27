package com.functionalProgramming.day2;

import java.util.Comparator;
import java.util.List;

public class FP06SortedByUserComparator {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(12,3,3,3,3,2,2,3,5,7,6,23,14,9);
		List<String> courses= List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
		printCoursesByLength(courses);
		System.out.println("-------------------");
		printCoursesByReverse(courses);
		System.out.println("-------------------");
		printNumberReverse(numbers);
		System.out.println("-------------------");
//		printNumberInorder(numbers);
//		System.out.println("-------------------");
		
	}

//	private static void printNumberInorder(List<Integer> numbers) {
//		// TODO Auto-generated method stub
//		numbers.stream()
//		.sorted(Comparator.comparing(x->x))
//		.forEach(System.out::println);
//		
//	}

	private static void printNumberReverse(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}

	private static void printCoursesByReverse(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
	}

	private static void printCoursesByLength(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
		.sorted(Comparator.comparing(x->x.length()))
		.forEach(System.out::println);
		
	}

}
