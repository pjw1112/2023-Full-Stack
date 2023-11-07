package com.company.day021;

public class Method032 {

//	static void hello(int i) {
//		if(i<0)
//			return;
//		System.out.println(i);
//		hello(--i);
//	}

	static void hello(int i) {

		for (;;) {

			if (i <= 0) {
				break;
			} else {
				System.out.println("hello"+i);
				i--;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello(5);
	}

}
