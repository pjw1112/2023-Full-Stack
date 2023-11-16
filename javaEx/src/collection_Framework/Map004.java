package collection_Framework;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class Map004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("danawa", "http://www.danawa.net/search/q=computer");
		myMap.put("naver", "https://www.naver_kid.com/naver/search?query=apple");
		myMap.put("daum", "https://www.daum_kidco.kr/daum/search?q=daum");
		
	
		System.out.print("원하는 사이트 입력(naver, daum, danawa) >>");
		Scanner sc = new Scanner(System.in);
		String name = sc.next().toLowerCase();
		
		if(myMap.containsKey(name) ) {
			System.out.println("value : " + myMap.get(name));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
