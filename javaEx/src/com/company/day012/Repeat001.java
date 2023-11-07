package com.company.day012;

public class Repeat001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for - 순서, 개수를 알고 있을때
		// while - 개수를 모를때
		// do while - 무조건 1번은 실행을 해야할 때
		// 1 2 3
		System.out.println("\n\nfor-ver");

		for (int i = 1; i < 4; i++) {
			System.out.println(i + "\t");
		}

		
		System.out.println("\n\nwhile-ver");
		int i = 1;
		while (i < 4) {
			System.out.println(i + "\t");
			i++;
		}

		
		System.out.println("\n\ndo while-ver");
		i = 10;
		do{
			System.out.println(i + "\t");
			i++;
		}while (i < 4); 
	}

}
