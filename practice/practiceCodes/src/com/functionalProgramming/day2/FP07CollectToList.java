package com.functionalProgramming.day2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP07CollectToList {
	public static void main(String[] args) {
		List<Integer> numbers= List.of(12,3,3,3,3,2,2,3,5,7,6,23,14,9);
		List<String> courses= List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
		List<Integer> sq=square(numbers);
		System.out.println(sq);
		for(int s:sq) {
			System.out.println(s);
		}
		List<String> sort =sortByLength(courses);
		System.out.println(sort);
		for(String s:sort) {
			System.out.println(s);
		}
		List<Integer> lenOfc=lengthofCourses(courses);
		System.out.println(lenOfc);
	}

	private static List<Integer> lengthofCourses(List<String> courses) {
		// TODO Auto-generated method stub
		return courses.stream()
				.map(x->x.length())
				.collect(Collectors.toList())
				;
	}

	private static List<String> sortByLength(List<String> courses) {
		// TODO Auto-generated method stub
		return courses.stream()
				.sorted(Comparator.comparing(x->x.length()))
				.toList()
				;
	}

	private static List<Integer> square(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream()
				.map(x->x*x)
				.collect(Collectors.toList())
				;
	}

}
