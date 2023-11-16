package collection_Framework;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class Set_HashSet004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> item = new HashSet<>();

		while (item.size() <= 5) {
			item.add((int) (Math.random() * 45) + 1);
		}

		System.out.println(item);
		
		Iterator<Integer> list = item.iterator();
		
		while(list.hasNext()) {
			
			int a = list.next();
			
			if(a<10) { 
				System.err.println(a+" 삭제");
				list.remove();}
			else {
				System.out.println(a);
			}
			
		}
		
		System.out.println(item);
		
		

	}

}
