package com.functionalProgramming.day6;

import java.util.ArrayList;
import java.util.List;

public class FP08replaceAllANDremoveIf {
	
	public static void main(String[] args) {
		
		List<String> courses=List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");

	//	courses.replaceAll(str->str.toUpperCase());// here list is immutable
		System.out.println(courses);
		List<String> courses2= new ArrayList<String>(courses);
		
		courses2.replaceAll(str->str.toUpperCase());
		System.out.println(courses2);
		
		
		courses2.removeIf(str->str.length()<4);
		System.out.println(courses2);
	}

}
