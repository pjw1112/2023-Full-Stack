package collection_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 1. Set -> 복주머니	index X, 중복허용 X
// get 사용을 못함 ( Iterator 사용 )
// HashSet / TreeSet / 
public class Set_HashSet001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> avengers = new HashSet<>();
		
		//add
		avengers.add("iron");
		avengers.add(new String("hulk"));
		avengers.add("captain");
		System.out.println(avengers.size());
		//데이터 중복 허용 불가
		avengers.add("captain");
		System.out.println(avengers.size());
		System.out.println(avengers);
		
		
		//Iterator
		Iterator<String> it = avengers.iterator();
		while(it.hasNext()) {
			if(it.next().equals("hulk") ){
				it.remove();
//				avengers.add("hulk-best");
			}
		}
		System.out.println(avengers);
		
	}

}
