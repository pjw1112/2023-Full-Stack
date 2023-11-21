package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Stream002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // 이렇게 만들면 arraylist 크기 수정이 안됨
		System.out.println(list.toString());

		// 1. 향상된 for
		for (Integer i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();

		// 2. Iterator
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.print(integer + "\t");
		}
		System.out.println();

		// 3. Stream 1
		list.stream().forEach(t -> System.out.print(t+"\t"));
		System.out.println();
				
		// 4. Stream 2
		Stream.of(list).forEach(System.out::println);
		System.out.println( Stream.of(list) );
		
		// List > 배열 > Stream
		
//		Integer[] arr2 =  (Integer[])list.toArray();
		Integer[] arr2 =  list.toArray(new Integer[0]);
		Stream.of(arr2).forEach(t -> System.out.print(t+"\t") );
		System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
