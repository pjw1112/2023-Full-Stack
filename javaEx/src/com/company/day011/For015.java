package com.company.day011;

import java.util.Scanner;

public class For015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수
		Scanner sc = new Scanner(System.in);
		int x = -1, y = -1, number = 1;
		double z = 0.0;
		String result = "", str = ". 정수를 하나 입력해주세요. > ";
		char ch;

		// 입력
		for (;;) {
			System.out.println(number + str);

			if (number == 1) {
				x = sc.nextInt();

				if (0 <= x && x <= 100) {
					number++;
				}

			} else if (number == 2) {
				y = sc.nextInt();

				if (0 <= y && y <= 100) {
					number++;
					str = "3. 연산자를 입력해주세요. ( +, -, *, / ) > ";
				}

			} else if (number == 3) {
				ch = sc.next().charAt(0);
				if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
					break;
				}
			}
		}

		// 처리
		switch (ch) {
		case '+':
			z = x + y;
			result = String.format("%d", (int) z);
			break;

		case '-':
			z = x - y;
			result = String.format("%d", (int) z);
			break;

		case '/':
			z = (double) x / y;
			result = String.format("%.2f", z);
			break;

		case '*':
			z = x * y;
			result = String.format("%d", (int) z);
			break;
		}

		// 출력
		System.out.println("" + x + ch + y + "=" + result);
		sc.close();

	}
}
