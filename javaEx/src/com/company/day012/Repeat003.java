package com.company.day012;

public class Repeat003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~10까지 3의 배수 갯수를 출력하시오.

		// for
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
		
		// while
		int i = 1;
		while (i < 11) {
			if (i % 3 == 0) {
				System.out.print(i + "\t");
				
			}
			i++;
		}
		System.out.println();
		
		// do-while
		i = 1;
		do {
			if (i % 3 == 0) {
				System.out.print(i + "\t");
				
			}
			i++;
		} while (i < 11);

	}

}
