package com.functionalProgramming.day5;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

public class FP01SkipLimitTakeandDropWhile {

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
		
		Comparator<Course> comparingNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNoOfStudents);
		Comparator<Course> comparingNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNoOfStudents).reversed();
		Comparator<Course> comparingNoOfStudentsAndReviewScore = Comparator.comparingInt(Course::getNoOfStudents).thenComparingInt(Course::getReviewScore).reversed();
		Comparator<Course> comparingReviewScore = Comparator.comparingInt(Course::getReviewScore);

		//comparingInt instead of comparing for integer efficiency
		
		System.out.println(courses.stream()
				.sorted(comparingNoOfStudentsIncreasing)
				.skip(2)
				.collect(Collectors.toList()));
		
		System.out.println(courses.stream()
				.sorted(comparingNoOfStudentsDecreasing)
				.limit(3)
				.collect(Collectors.toList()));
		
		System.out.println(courses.stream()
				//.sorted(comparingNoOfStudentsAndReviewScore)
				//.sorted(comparingNoOfStudentsDecreasing)
				.takeWhile(course->course.getReviewScore()>=95)
				.collect(Collectors.toList()));
		System.out.println(courses.stream()
				//.sorted(comparingNoOfStudentsAndReviewScore)
				.sorted(comparingReviewScore)
				.dropWhile(course->course.getReviewScore()<95)
				.collect(Collectors.toList()));
	}
}
