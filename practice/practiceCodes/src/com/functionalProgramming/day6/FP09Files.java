package com.functionalProgramming.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP09Files {
	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("file.txt"))
			.forEach(System.out::println);
		System.out.println();
		Files.lines(Paths.get("file.txt"))
		.map(str->str.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.sorted()  //sort
		.forEach(System.out::println);
	}

}
