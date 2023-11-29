package com.functionalProgramming.day4;

import java.util.List;
import java.util.function.Predicate;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
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

public class FP03AnyAllNoneMatchCustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), 
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), 
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), 
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		
		
		Predicate<Course> reviewScoreGreaterthan90redicate 
						= course->course.getReviewScore()>90;
		
		Predicate<Course> reviewScoreGreaterthan95redicate 
						= course->course.getReviewScore()>95;
		Predicate<Course> reviewScoreLessthan90redicate 
						= course->course.getReviewScore()<90;
	//anyMatch allMatch noneMatch
		System.out.println(courses.stream()
			.allMatch(reviewScoreGreaterthan90redicate));
		System.out.println(courses.stream()
				.allMatch(reviewScoreGreaterthan95redicate));
		
		System.out.println(courses.stream()
				.noneMatch(reviewScoreGreaterthan95redicate));
		System.out.println(courses.stream()
				.noneMatch(reviewScoreLessthan90redicate));
		
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterthan95redicate));
		
		
		System.out.println("----------------");
		
		Predicate<Course> noofStudentsGreaterThan20kPredicate 
				= course->course.getNoOfStudents()>20000;
		Predicate<Course> noofStudentsGreaterThan25kPredicate 
				= course->course.getNoOfStudents()>25000;
		System.out.println(courses.stream()
				.allMatch(noofStudentsGreaterThan20kPredicate)	);
		System.out.println(courses.stream()
				.anyMatch(noofStudentsGreaterThan20kPredicate)	);
		System.out.println(courses.stream()
				.noneMatch(noofStudentsGreaterThan25kPredicate));
		
	}
}
	
