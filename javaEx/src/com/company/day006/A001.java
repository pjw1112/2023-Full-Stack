package com.company.day006;

import java.util.Map;

import com.company.day005.A024;

public class A001 extends A024 {
	public int nam=1;
	static int bog=0;
	static int a=0;
	static {
		
	}

	void aaa() {
		this.ayo1();
		System.out.println("hi");
	}
	public static void main(String args) {
		System.out.println(args);
		
		main(args);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 먼저 ()
		// 값을 구하고 ( ++, --, *, /, +, -, <<, >> ) 비교조건 후 대입!
		// 비교 ( <, > )
		// 조건 ( &&, || ) 후
		// 대입 ( = )
		A024 father = new A024();
		A024 father2 = new A001();
		A001 son = new A001();
		
		System.out.println(father.nam); 
		
		A024[] father_array = new A024[5];
		father_array[0] = father;
		father_array[1] = son;
		son.nam=4;
		
		
		A001 hey = new A001();
		hey.aaa();
		// 1. 산술 연산자
		int a = 10, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a + b);
		System.out.println(a / b);
		System.out.println(a % b);

		// 2. 비교 연산자
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println((a != b) == false);

		A024.ayo = 5;

		A024 aa1 = new A024();
		A024 aa2 = new A024();
		System.out.println(aa1.ayo);
		aa1.ayo = 7;
		System.out.println(aa2.ayo);
//		bog++;
//		System.out.println("메인메서드 "+bog+"번째 실행");
//		main( args);
	}

}
