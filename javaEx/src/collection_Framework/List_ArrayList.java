package collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class List_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 다형성 + interface
		List list = new Vector<>();
					  list = new ArrayList<>();
					  
		// 2. add, get, size, remove, contains
		list.add(10);
		list.add("hi");
		list.add(new Integer(30));
		System.out.println(list.get(0));
		System.out.println(list.size());
		System.out.println(list);
//		System.out.println(list.remove(new Integer(10));
		System.out.println(list.contains(30));
		System.out.println(list);
		
		
		
		
		
	}

}
/* List 기차
*  ArrayList
*/
