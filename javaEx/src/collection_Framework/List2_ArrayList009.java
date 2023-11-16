package collection_Framework;

import java.util.Arrays;
import java.util.List;

public class List2_ArrayList009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// asList #1
		String[] arr = { "아이언맨", "헐크", "토르" };
		List<String> list = Arrays.asList(arr);

		// asList #2
		List<String> list2 = Arrays.asList("아이언맨", "헐크", "토르");

		System.out.println(list);

		list.remove(2);

		
		
	}

}
