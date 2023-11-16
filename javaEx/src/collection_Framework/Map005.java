package collection_Framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("first@gmail.com", "1111");
		myMap.put("second@gmail.com", "2222");
		myMap.put("third@gmail.com", "3333");

		while (true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id >");
			String id = sc.next();
			System.out.print("pass >");
			String pass = sc.next();

			boolean match = false;
			if (myMap.containsKey(id)) {
				match = myMap.get(id).equals(pass);
			}

			if (match) {
				System.out.println("WELCOME! " + id + "님!");
				System.out.println();
			} else {
				System.out.println("입력하신 유저는 존재하지 않습니다. 다시 입력해주세요.");
				System.out.println();
			}
			
			Collections.max(null)
		}

	}

}
