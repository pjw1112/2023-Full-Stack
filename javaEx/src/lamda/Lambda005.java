package lamda;

import java.util.HashSet;
import java.util.Set;

interface Test5_1 {
	int method_max(int a, int b);
}

interface Test5_2 {
	void method_print1(String name, int i);
}

interface Test5_3 {
	int method_area(int x);
}

interface Test5_4 {
	int method_lotto();
}

interface Test5_5 {
	int method_arr(int[] arr);
}

interface Test5_6 {
	Set<Integer> method_arr2();
}

public class Lambda005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1. 매개변수 O, 리턴값 O");
		Test5_1 f11 = (a, b) -> {
			return a > b ? a : b;
		};
		System.out.println(f11.method_max(10, 3));
		System.out.println();
		
		
		System.out.println("2. 매개변수 O, 리턴값 X");
		Test5_2 f21 = (name, i) -> {
			System.out.println(name + ":D".repeat(i));
		};
		f21.method_print1("JAVA", 2);
		System.out.println();
		
		
		System.out.println("3. 매개변수 O, 리턴값 O");
		Test5_3 f31 = x -> {
			return x * x;
		};
		System.out.println(f31.method_area(10));
		System.out.println();
		
		
		System.out.println("4. 매개변수 X, 리턴값 O");
		Test5_4 f41 = () -> {
			return (int) (Math.random() * 45) + 1;
		};
		System.out.println(f41.method_lotto());
		System.out.println();
		
		
		System.out.println("5. 매개변수 O, 리턴값 O - 배열");
		int[] arr2 = {1,2,3};
		Test5_5 f51 = arr -> {
			int sum=0;
			for(int i : arr) { sum+=i; }
			return sum;
		};
		System.out.println(f51.method_arr(arr2));
		System.out.println();
		
		
		System.out.println("6. 매개변수 X, 리턴값 O - SET");
		Test5_6 f61 =() -> {
			Set<Integer> lotto = new HashSet<Integer>();
			
			while(lotto.size()<6) { lotto.add(f41.method_lotto()); }
 
			return lotto;
		};
		System.out.println(f61.method_arr2());
		
		
		
		
		
	}

}
