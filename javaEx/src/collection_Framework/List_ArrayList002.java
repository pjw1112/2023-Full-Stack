package collection_Framework;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

class Aa<T>{
	T t;
	
}


public class List_ArrayList002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aa bb = new Aa();
		bb.t="hi";
		System.out.println(bb.t);
		bb.t=123;
		System.out.println(bb.t);
		bb.t = new Aa();
		System.out.println(bb.t);
		List<Aa<String>> aa = new ArrayList<Aa<String>>();
		
		List<String> numbers = new ArrayList<String>();

		numbers.add("IRON");
		numbers.add("HULK");
		numbers.add("CAPTAIN");
		numbers.add("종료");

		System.out.println(":::::::::");
		System.out.println("NAME\tAGE");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("-----_---");
			System.out.println(numbers.get(i));
			
		}

		String answer = JOptionPane.showInputDialog("1,2,3,4중에 입력.");

		JOptionPane.showMessageDialog(null, numbers.get(Integer.parseInt(answer) - 1));

	}

}
