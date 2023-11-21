package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream005 {
	public static void main(String[] args) {

		System.out.println("Ex1 > ArrayList 를 Stream을 이용해 forEach 출력");
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		list1.stream().forEach(t -> System.out.print(t+"\t"));
		System.out.println();
		System.out.println();
		
		System.out.println("Ex2 > list를 Integer[]로 변경하고 Stream을 이용해 forEach 출력");
		Integer[] arr = list1.toArray(new Integer[0]);
		Stream.of(arr).forEach(System.out::print);
		System.out.println();
		System.out.println();
		
		System.out.println("Ex3 > ArrayList 를 Stream을 이용해 forEach 출력");
		List<Character> list2 = Arrays.asList('a','b','c','d','e');
		list1.stream().forEach(t -> System.out.print(t+"\t"));
		System.out.println();
		System.out.println();
		
		System.out.println("Ex4 > list를 Character[]로 변경하고 Stream을 이용해 forEach 출력");
		Character[] arr2 = list2.toArray(new Character[0]);
		Stream.of(arr2).forEach(System.out::print);
		System.out.println();
		System.out.println();
		
		System.out.println("Ex5 > String[]을 Stream을 이용해 forEach 출력");
		String[] arr3 = {"first","second","third","forth","five"};
		Stream.of(arr3).forEach(t -> System.out.print(t+"\t"));
		System.out.println();
		System.out.println();
		
		
		
		
		
	}
}
