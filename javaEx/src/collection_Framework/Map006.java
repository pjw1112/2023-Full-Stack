package collection_Framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Map006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("first", 90);
		myMap.put("second", 87);
		myMap.put("third", 100);
		myMap.put("four", 77);
		myMap.put("five", 92);
		
		System.out.println("=================================");
		System.out.println("NAME\tSCORE");
		System.out.println("=================================");
		
		Iterator<String> str = myMap.keySet().iterator();
		while (str.hasNext()) {
			String string = (String) str.next();

			System.out.println(string + "\t" + myMap.get(string));
			System.out.println("-----------------------------");
		}
		
		System.out.println("1. 참가자 명단 : "+ myMap.keySet());
		int sum=0;
		for(Integer a :myMap.values()) {
			sum+=a;
		}
		System.out.println("2. 총점 : "+sum);
		System.out.println("3. 평균 : "+((double)sum/myMap.size()));
		System.out.println("4. 최고점수 ; "+ Collections.max(myMap.values()) );
		System.out.println("5. 최저점수 ; "+ Collections.min(myMap.values()) );
		
		
		
		
		
		
		
		
		
		
		
	}

}
