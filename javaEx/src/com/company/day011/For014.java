package com.company.day011;

import java.util.Scanner;

public class For014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수
		Scanner sc = new Scanner(System.in);
		double dd = 0.0;

		// 입력
		for (;;) {
			System.out.println("PI값은 얼마입니까? >");
			dd = sc.nextDouble();

			// 처리
			if (dd == 3.14) {
				break;
			}

		}

		sc.close();
	}

}
