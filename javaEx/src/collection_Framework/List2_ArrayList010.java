package collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List2_ArrayList010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LinkedList 데이터 삭제 추가에 용이
		long start;
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();

		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.add(0, i);
		}
		long ArrayListTime = System.nanoTime() - start;

		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.add(0, i);
		}
		
		long LinkedListTime = System.nanoTime() - start;

		System.out.println("데이터 10000개를 매번 0번째 인덱스에 추가할때");
		if (ArrayListTime > LinkedListTime) {
			System.out.println("ArrayList가 LinkedListTime 보다 " + (ArrayListTime / LinkedListTime) + "배 빠름");
		} else {
			System.out.println("LinkedListTimeㄱㅏ ArrayList보다 " + ( LinkedListTime/ArrayListTime) + "배 빠름");

		}

		System.out.println();
		
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list1.get(i);
		}
		ArrayListTime = System.nanoTime() - start;

		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list2.get(i);
		}
		LinkedListTime = System.nanoTime() - start;

		System.out.println("데이터 10000개를 0번 부터 10000번 인덱스 까지 차례대로 꺼낼때");
		if (ArrayListTime > LinkedListTime) {
			System.out.println("ArrayList가 LinkedListTime 보다 " + (ArrayListTime / LinkedListTime) + "배 빠름");
		} else {
			System.out.println("LinkedListTimeㄱㅏ ArrayList보다 " + ( LinkedListTime/ArrayListTime) + "배 빠름");

		}
		
		
		
		
		
		
		
		
	}// end main

}// end class
