package com.company.day012;

import java.util.Scanner;

public class RepeatEx004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수
		Scanner sc = new Scanner(System.in);
		int number = 1, sum = 0;
		int number_of_digits = 1;

		// 입력
		System.out.println("임의의 양의 정수 입력 >> ");

		// 자리수 계산
		if (number > 0) {
			number = sc.nextInt();
			for (int i = number; i >= 10; i = i / 10) {
				number_of_digits += 1;

			}
		} else {

		} // End 자리수 계산

		System.out.println(number_of_digits + "자리 숫자 입니다.");

		System.out.print("각 자리수의 합은 \n");

		// 각 자리수 숫자 분해해서 출력하고 sum반복
		for (int i = number_of_digits; i > 0; i--) {
			int num_1 = 1, num_2 = 1;

			for (int x = i + 1; x > 1; x--) {
				num_1 = num_1 * 10;
			}

			for (int y = i; y > 1; y--) {
				num_2 = num_2 * 10;
			}

			sum = sum + ((number % num_1) / num_2);
			System.out.print((number % num_1) / num_2);
			if (i > 1) {
				System.out.printf(" + ");
			}

		} // 각 자리수 분해 End

		// 출력
		System.out.print(" = " + sum);
	}

}
