package com.company.day010;

import java.util.Scanner;

public class For003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 단을 입력해주세요>>");

		i = sc.nextInt();

		for (int j = 1; j < 10; j++) {
			System.out.println(i + "*" + j + "=" + i * j);
		}

	}

}
