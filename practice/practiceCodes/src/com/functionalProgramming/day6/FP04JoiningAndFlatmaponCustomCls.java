package com.functionalProgramming.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP04JoiningAndFlatmaponCustomCls {
	public static void main(String[] args) {
		List<String> courses= List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		List<String> courses2= List.of("Spring","Spring boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
		System.out.println( courses.stream().collect(Collectors.joining(",")));
		System.out.println(Arrays.toString("Spring".split("")));
		System.out.println(courses.stream()
				.map(course->course.split(""))
				.flatMap(Arrays::stream)
				//.distinct()
				.collect(Collectors.toList())
				);
		
		System.out.println(courses.stream()
				.flatMap(course->courses2.stream() 
									.filter(course2->course.length()==course2.length())
									.map(course2->List.of(course,course2))
									
									//.collect(Collectors.toList()))
									)
				.filter(list->!list.get(0).equals(list.get(1)))
				.collect(Collectors.toList())
				);
		//[[[Spring, Spring], [Spring, Spring boot], [Spring, API], [Spring, Microservices], [Spring, AWS], [Spring, PCF], [Spring, Azure], [Spring, Docker], [Spring, Kubernetes]], [[Spring boot, Spring], [Spring boot, Spring boot], [Spring boot, API], [Spring boot, Microservices], [Spring boot, AWS], [Spring boot, PCF], [Spring boot, Azure], [Spring boot, Docker], [Spring boot, Kubernetes]], [[API, Spring], [API, Spring boot], [API, API], [API, Microservices], [API, AWS], [API, PCF], [API, Azure], [API, Docker], [API, Kubernetes]], [[Microservices, Spring], [Microservices, Spring boot], [Microservices, API], [Microservices, Microservices], [Microservices, AWS], [Microservices, PCF], [Microservices, Azure], [Microservices, Docker], [Microservices, Kubernetes]], [[AWS, Spring], [AWS, Spring boot], [AWS, API], [AWS, Microservices], [AWS, AWS], [AWS, PCF], [AWS, Azure], [AWS, Docker], [AWS, Kubernetes]], [[PCF, Spring], [PCF, Spring boot], [PCF, API], [PCF, Microservices], [PCF, AWS], [PCF, PCF], [PCF, Azure], [PCF, Docker], [PCF, Kubernetes]], [[Azure, Spring], [Azure, Spring boot], [Azure, API], [Azure, Microservices], [Azure, AWS], [Azure, PCF], [Azure, Azure], [Azure, Docker], [Azure, Kubernetes]], [[Docker, Spring], [Docker, Spring boot], [Docker, API], [Docker, Microservices], [Docker, AWS], [Docker, PCF], [Docker, Azure], [Docker, Docker], [Docker, Kubernetes]], [[Kubernetes, Spring], [Kubernetes, Spring boot], [Kubernetes, API], [Kubernetes, Microservices], [Kubernetes, AWS], [Kubernetes, PCF], [Kubernetes, Azure], [Kubernetes, Docker], [Kubernetes, Kubernetes]]]
//		[[Spring, Spring boot], [Spring, API], [Spring, Microservices], [Spring, AWS], [Spring, PCF], [Spring, Azure], [Spring, Docker], [Spring, Kubernetes], [Spring boot, Spring], [Spring boot, API], [Spring boot, Microservices], [Spring boot, AWS], [Spring boot, PCF], [Spring boot, Azure], [Spring boot, Docker], [Spring boot, Kubernetes], [API, Spring], [API, Spring boot], [API, Microservices], [API, AWS], [API, PCF], [API, Azure], [API, Docker], [API, Kubernetes], [Microservices, Spring], [Microservices, Spring boot], [Microservices, API], [Microservices, AWS], [Microservices, PCF], [Microservices, Azure], [Microservices, Docker], [Microservices, Kubernetes], [AWS, Spring], [AWS, Spring boot], [AWS, API], [AWS, Microservices], [AWS, PCF], [AWS, Azure], [AWS, Docker], [AWS, Kubernetes], [PCF, Spring], [PCF, Spring boot], [PCF, API], [PCF, Microservices], [PCF, AWS], [PCF, Azure], [PCF, Docker], [PCF, Kubernetes], [Azure, Spring], [Azure, Spring boot], [Azure, API], [Azure, Microservices], [Azure, AWS], [Azure, PCF], [Azure, Docker], [Azure, Kubernetes], [Docker, Spring], [Docker, Spring boot], [Docker, API], [Docker, Microservices], [Docker, AWS], [Docker, PCF], [Docker, Azure], [Docker, Kubernetes], [Kubernetes, Spring], [Kubernetes, Spring boot], [Kubernetes, API], [Kubernetes, Microservices], [Kubernetes, AWS], [Kubernetes, PCF], [Kubernetes, Azure], [Kubernetes, Docker]]
//`			[[Spring, Docker], [API, AWS], [API, PCF], [AWS, API], [AWS, PCF], [PCF, API], [PCF, AWS], [Docker, Spring]]

		
	}

}
