package com.functionalProgramming.day5;

import java.util.List;
import java.util.function.Predicate;

class Course2 {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course2(String name, String category, int reviewScore, int noOfStudents) {
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

public class FP03SumAvgTotalMaxCustomClass {

	public static void main(String[] args) {
		List<Course2> courses = List.of(new Course2("Spring", "Framework", 98, 20000),
				new Course2("Spring Boot", "Framework", 95, 18000), 
				new Course2("API", "Microservices", 97, 22000),
				new Course2("Microservices", "Microservices", 96, 25000),
				new Course2("FullStack", "FullStack", 91, 14000), 
				new Course2("AWS", "Cloud", 92, 21000),
				new Course2("Azure", "Cloud", 99, 21000), 
				new Course2("Docker", "Cloud", 92, 20000),
				new Course2("Kubernetes", "Cloud", 91, 20000));
		
		Predicate<Course2> reviewScoreLessthan90Predicate 
				= course -> course.getReviewScore() < 90;
		Predicate<Course2> reviewScoreGreaterthan90Predicate 
				= course -> course.getReviewScore() > 90;

		Predicate<Course2> reviewScoreGreaterthan95Predicate 
				= course -> course.getReviewScore() > 95;
			
				
		System.out.println(
				courses.stream()
				.filter(reviewScoreLessthan90Predicate)
				.mapToInt(Course2::getNoOfStudents)
				.sum()
				);
		
		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterthan90Predicate)
				.mapToInt(Course2::getNoOfStudents)
				.min()
				);
		
		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterthan90Predicate)
				.mapToInt(Course2::getNoOfStudents)
				.average()
				);
		
		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterthan95Predicate)
				.mapToInt(Course2::getNoOfStudents)
				.max()
				);
				
	}
}
