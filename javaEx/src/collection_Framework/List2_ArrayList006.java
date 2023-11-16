package collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// List -> 기차 1. index		2.데이터 중복 허용		3. add,get,size,remove,contains
public class List2_ArrayList006 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		String[] datas = {"AAA","BBB","CCC"};
		
		//1. 데이터 삽입
		for(String d : datas) {
			list.add(d);
		}
		
		//2. 데이터 가져오기 get+size/ 향상된 for/ Iterator
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+"\t");
		}
		System.out.println();
		
		for (String d : list) {
			System.out.println(d+"\t");
		}
		System.out.println();
		
		//Iterator - [AAA, BBB, CCC]
		Iterator<String> it =   list.iterator();
		//2. 처리대상 유무확인 it.hasNext()
		//3. 처리(꺼내옷ㅔ요!) it.next()
		while(it.hasNext()) {
			String temp = it.next();
			System.out.println(temp);
		}
		
		while(it.hasNext()) {
			String temp = it.next();
			System.err.println(temp);
		}
		
		System.out.println();
		ListIterator<String> iter = list.listIterator();
		
		while(iter.hasNext()) {
			String temp = iter.next();
			System.err.println(temp);
		}
		System.out.println("hi");
				
		while(iter.hasPrevious()) {
			String temp = iter.previous();
			System.err.println(temp);
		}
		
		
		
		
		
		
		
	}// end main
}//end class
