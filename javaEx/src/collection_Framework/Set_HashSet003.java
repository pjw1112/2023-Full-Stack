package collection_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set_HashSet003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> address = new HashSet<>();

		// add
		address.add("https://www.naver_kid.com/naver/search?query=apple");
		address.add("https://www.daum_kidco.kr/daum/search?q=daum");
		address.add("http://www.danawa.net/search/q=computer");
	
		System.out.println("원하는 사이트 입력(naver, daum, danawa) >>");
		Scanner sc = new Scanner(System.in);
		String name = sc.next().toLowerCase();
		// Iterator
		Iterator<String> it = address.iterator();
		while (it.hasNext()) {
		String add = it.next();
		if(add.indexOf(name)!=-1) {
			System.out.println(add);
		}
		
		}

	}

}
