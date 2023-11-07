package com.company.day010;

import java.util.Scanner;

public class For012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수

		int start = 0, sign = 1, end = 0, sum = 0;
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.println("숫자 1입력 : ");
		start = sc.nextInt();

		System.out.println("숫자 2입력 : ");
		end = sc.nextInt();

		// 처리
		if (start > end) {
			sign = -1;
		}

		for (int x = start; !(x == end); x = x + sign) {
			System.out.printf("%s+", x);
			sum = sum + x;
		}

		// 출력
		sum = sum + end; // 합계에 마지막 항 더하기
		System.out.printf("%s=%s", end, sum);
		// 숫자 뒤에 '+' 문자열 붙는 형식 반복은 if-for문 안에서 처리하고 맨 마지막 항은 '+'문자가 붙어 나오면 안되기 때문에
		// if-for문 밖에서 한번 더 계산 후 출력

	}

}
