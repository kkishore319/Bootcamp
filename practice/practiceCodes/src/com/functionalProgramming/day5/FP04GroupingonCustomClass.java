package com.functionalProgramming.day5;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course4 {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course4(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}

public class FP04GroupingonCustomClass {

	public static void main(String[] args) {
		List<Course4> courses = List.of(new Course4("Spring", "Framework", 98, 20000),
				new Course4("Spring Boot", "Framework", 95, 18000), 
				new Course4("API", "Microservices", 97, 22000),
				new Course4("Microservices", "Microservices", 96, 25000),
				new Course4("FullStack", "FullStack", 91, 14000), 
				new Course4("AWS", "Cloud", 92, 21000),
				new Course4("Azure", "Cloud", 99, 21000), 
				new Course4("Docker", "Cloud", 92, 20000),
				new Course4("Kubernetes", "Cloud", 91, 20000));
		
		Predicate<Course4> reviewScoreLessthan90Predicate 
				= course -> course.getReviewScore() < 90;
		Predicate<Course4> reviewScoreGreaterthan90Predicate 
				= course -> course.getReviewScore() > 90;

		Predicate<Course4> reviewScoreGreaterthan95Predicate 
				= course -> course.getReviewScore() > 95;
			
				
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course4::getCategory))
				);
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course4::getCategory,Collectors.counting()))
				);
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course4::getCategory,Collectors.maxBy(Comparator.comparing(Course4::getNoOfStudents))))
				
				);
		
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course4::getCategory,Collectors.mapping(Course4::getName,Collectors.toList())))
				
				);
	}
}
