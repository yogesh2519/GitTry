package com.javastart;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class StreamTest {
	
	public static void main(String[] args)
	{
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(45);
		numbers.add(13);
		numbers.add(111);
		
		Function<Integer,Integer> squrFunction = x->x*x;
		
		List<Integer> squr= mapAndCeateNewList(numbers, squrFunction);
		
		List<Integer> cube= mapAndCeateNewList(numbers, x->x*x*x);
		
		int sum = numbers.stream().reduce(0,(x,y)->x+y);
		
		System.out.print(sum);
		
		
		Supplier<Integer> randomSupplier =()->{
			
			Random rand = new Random();
			int num = rand.nextInt(6);
			return num;
		};
		
		System.out.println("\n"+randomSupplier.get());
		
		
		
		
		
	   
		
		
	}

	private static List<Integer> mapAndCeateNewList(List<Integer> numbers, Function<Integer, Integer> squrFunction) {
		return numbers.stream()
		.map(squrFunction).
		collect(Collectors.toList());
	}

}
