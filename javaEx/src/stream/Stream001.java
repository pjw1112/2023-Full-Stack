package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("[1.why? Stream]");

		/*
		 * 목적 : 데이터종류에 상관없이 같은 방식으로 처리 Arrays.stream(배열명) Stream.of('값','값')
		 * 
		 */

		// #1. for
		Integer[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();

		// #2. 향상된 for 문
		for (Integer i : arr) {
			System.out.print(i + "\t");
		}
		System.out.println();

		// #3. Stream 1
		// Consumer, Supplier, Function, Operator, Predicate
		// void java.util.stream.Stream.forEach(Consumer<? super Integer> action)
		Arrays.stream(arr).forEach(t -> System.out.print(t + "\t"));
		System.out.println();
		
		// #4. Stream 2
		Stream.of(arr).forEach(t -> System.out.print(t + "\t"));
		
		
		
	}

}
