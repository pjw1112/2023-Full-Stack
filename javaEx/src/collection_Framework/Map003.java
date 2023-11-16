package collection_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Map003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("피구왕", "통키");
		myMap.put("제빵왕", "김탁구");
		myMap.put("요리왕", "비룡");
		
		System.out.println("=================================");
		System.out.println("KING\tNAME");
		System.out.println("=================================");
		
		Iterator<String> str = myMap.keySet().iterator();
		while (str.hasNext()) {
			String string = (String) str.next();

			System.out.println(string + "\t" + myMap.get(string));
			System.out.println("-----------------------------");
		}
		
		System.out.println("KING의 정보를 제공중입니다");
		System.out.print("이름을 입력하세요 > ");
		String name = sc.next();
		
		if(myMap.containsKey(name) ) {
			System.out.println(name + "\t" + myMap.get(name));
		}
		System.out.print("KING 몇 명 ? : ");
		System.out.println(myMap.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
