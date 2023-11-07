package com.company.day018;

import java.util.Scanner;

public class Method006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res1 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("절대값을 구하는 프로그램입니다.\n 숫자를 입력하세요.");
		res1 = abs(scanner.nextInt());
		System.out.println(res1);
		scanner.close();
	}

	public static int abs(int i) {

		return i > 0 ? i : -i;
	}

}
