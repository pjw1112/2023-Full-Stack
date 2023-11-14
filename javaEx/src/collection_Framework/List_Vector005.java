package collection_Framework;

import java.util.List;
import java.util.Vector;

//List 계열은 기차 - index넘버 있음, 중복 허용 ( add, get, size, remove, contains )
public class List_Vector005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruit = new Vector<>();
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("coconut");
		
		for(String item : fruit) {
			System.out.println(item.toString());
		}
		
		fruit.remove(1);
		System.out.println(fruit.toString());
		
		//인덱스 단점 수정
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
