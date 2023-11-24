package com.functionalProgramming.day1;

import java.util.List;

public class FP03Courses {
	public static void main(String[] args) {
		List<String> courses= List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
		printAllCoursesFuctional(courses); //exercise 2
		printAllCoursesStartsWithSpring(courses); //excercise 3
		printCoursesWhoseNamehas4Letters(courses); //excercise 4
		printNumberOfCharsInEachCourse(courses); //excercise 6
				
	}

	private static void printNumberOfCharsInEachCourse(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
			.map(c->c.length())
			.forEach(System.out::println);
		
	}

	private static void printCoursesWhoseNamehas4Letters(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
			.filter(num->num.length()>=4)
			.forEach(System.out::println);
		
	}

	private static void printAllCoursesStartsWithSpring(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
		.filter(str->str.startsWith("Spring")) 
		.forEach(System.out::println);
		
	}

	private static void printAllCoursesFuctional(List<String> courses) {
		// TODO Auto-generated method stub
		courses.stream()
			.forEach(System.out::println); 
		
	}
	
	

}
