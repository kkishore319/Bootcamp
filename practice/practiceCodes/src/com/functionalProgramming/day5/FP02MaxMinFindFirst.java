package com.functionalProgramming.day5;


import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;



class Course1 {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course1(String name, String category, int reviewScore, int noOfStudents) {
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

public class FP02MaxMinFindFirst {

	public static void main(String[] args) {
		List<Course1> courses = List.of(new Course1("Spring", "Framework", 98, 20000),
				new Course1("Spring Boot", "Framework", 95, 18000), 
				new Course1("API", "Microservices", 97, 22000),
				new Course1("Microservices", "Microservices", 96, 25000),
				new Course1("FullStack", "FullStack", 91, 14000), 
				new Course1("AWS", "Cloud", 92, 21000),
				new Course1("Azure", "Cloud", 99, 21000), 
				new Course1("Docker", "Cloud", 92, 20000),
				new Course1("Kubernetes", "Cloud", 91, 20000));
		
		Predicate<Course1> reviewScoreLessthan90redicate 
				= course -> course.getReviewScore() < 90;
		Predicate<Course1> reviewScoreGreaterthan90redicate 
				= course -> course.getReviewScore() > 90;

		Predicate<Course1> reviewScoreGreaterthan95redicate 
				= course -> course.getReviewScore() > 95;
		
		Comparator<Course1> comparingNoOfStudentsIncreasing = Comparator.comparingInt(Course1::getNoOfStudents);
		Comparator<Course1> comparingNoOfStudentsDecreasing = Comparator.comparingInt(Course1::getNoOfStudents).reversed();
		Comparator<Course1> comparingNoOfStudentsAndReviewScore = Comparator.comparingInt(Course1::getNoOfStudents).thenComparingInt(Course1::getReviewScore).reversed();
		Comparator<Course1> comparingReviewScore = Comparator.comparingInt(Course1::getReviewScore);

		//comparingInt instead of comparing for integer efficiency
		
		System.out.println(courses.stream()
				.filter(reviewScoreLessthan90redicate)
				.min(comparingNoOfStudentsIncreasing)
				.orElse(new Course1("","",0,0)));
				;
		
				System.out.println(courses.stream()
						.filter(reviewScoreGreaterthan95redicate)
						.min(comparingNoOfStudentsDecreasing)
						);
				System.out.println(courses.stream()
						.filter(reviewScoreGreaterthan95redicate)
						.findFirst()
						);
				
				System.out.println(courses.stream()
						.filter(reviewScoreGreaterthan95redicate)
						.findAny()
						);

	}
}
