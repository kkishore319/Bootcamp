package com.functionalProgramming.day4;

import java.util.List;
import java.util.function.Supplier;

public class FP02MethodReferences {
	
	
	private static void print(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		List<String> courses= List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
			
		
		courses.stream()
			//.map(str-> str.toUpperCase())
			.map(String::toUpperCase)
			//.forEach(System.out::println)
			.forEach(FP02MethodReferences::print);
			
		Supplier<String> supplier = String :: new;
		System.out.println(supplier.get().concat("str")) ;
	}

}
