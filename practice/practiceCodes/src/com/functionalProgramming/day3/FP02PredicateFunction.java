package com.functionalProgramming.day3;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP02PredicateFunction {
	public static void main(String[] args) {
		
		
		List<Integer> numbers= List.of(1,3,5,6,3,2,6,8);
		
		
		
		Predicate< Integer> evenPredicate = x->x%2==0;
		Predicate< Integer> evenPredicate2=new Predicate< Integer> () {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
			
		};
		
		Function< Integer,Integer> squareMapper = x->x*x;
		Function< Integer,Integer> squareMapper2 = new Function< Integer,Integer> (){

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t*t;
			}
			
		};
		
		Consumer<Integer> printAction = System.out::println;
		Consumer<Integer> printAction2 = new Consumer<Integer> () {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		};
		
		numbers.stream()
			.filter(evenPredicate2)
			.map(squareMapper2)
			.forEach(printAction2);
	}

}
