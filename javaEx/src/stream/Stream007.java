package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = { "CAT", "DOG", "PIG" };
		Stream<String> strStream = Stream.of(strArray);
		strStream.forEach(t -> System.out.print(t + "\t"));
		System.out.println();

		List<String> list1 = Arrays.asList(strArray);

		Stream<List<String>> strStream2 = Stream.of(list1);
		strStream2.forEach(t -> t.forEach(ta -> System.out.print(ta + "\t")));
		System.out.println();

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Stream<Integer> intStream = Stream.of(intArray);
		intStream.forEach(t -> System.out.print(t * 2 + "\t"));
		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
