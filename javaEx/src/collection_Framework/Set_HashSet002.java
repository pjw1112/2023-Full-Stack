package collection_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> fruitHash = new HashSet<>();
		
		//add
		fruitHash.add("apple");
		fruitHash.add(new String("banana"));
		fruitHash.add("coconut");
		fruitHash.add("coconut");
		
		System.out.println("1. HashSet 개수 : "+fruitHash.size());
		System.out.println("  (중복 허용 안함)");
		System.out.println("2. Iterator 이용해서 출력");
				
		//Iterator
		Iterator<String> it = fruitHash.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
