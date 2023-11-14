package collection_Framework;

import java.util.List;
import java.util.Vector;

public class List_Vector003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> color = new Vector<String>();

		color.add("RED");
		color.add("GREEN");
		color.add("BLUE");
		color.add("BLACK");

		for (Object item : color) {
			System.out.println(item);
		}
		System.out.println();
		for (int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i));
		}
		System.out.println();

		List milk = new Vector<>();
		milk.add("white");
		milk.add(123);
		milk.add("banana");
		milk.set(0, "milk");
		for (Object item : milk) {
			
			System.out.println(item);
		}
		//화이트를 밀크로 바꾸기
		milk.remove(0);
		System.out.println(milk.toString());
		System.out.println(milk.get(0));
		System.out.println(milk.get(1));
		milk.add(1, "hihi");
		System.out.println(milk.toString());
		System.out.println(milk.get(0));
		System.out.println(milk.get(1));
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
