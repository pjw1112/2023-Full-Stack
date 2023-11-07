package com.company.day016;

import java.util.Scanner;

public class Array2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아이디어
		// 임의의 양의 정수 n x n 행렬 생성시, 행과 열은 n/2(중간지점) 을 기준으로 대칭을 이룬다.
		// 각 행의 열넘버 - ((행길이+1)/2) 한 값의 절대값을 만들면
		// 0열과 n열, 1열과 n-1열 , 2열과 n-2열... 이 중간을 기준으로
		// 대칭된 값을 가지게 된다. (아래 코드에서 double n)
		// 각 열의 행넘버 - ((열길이+1)/2) 한 값의 절대값을 만들면
		// 0행과 n행, 1행과 n-1행 , 2행과 n-2행... 이 중간을 기준으로
		// 대칭된 값을 가지게 된다. (아래 코드에서 double m)
		// n과 m을 비교해서 행값이 열값보다 크거나 같을때 '#' 문자열을 넣고
		// n이 m 보다 작을때는 공백 문자열을 넣는다.
		// 출력.

		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("모래시계 모양 n x n 정사각 행렬을 생성합니다. 양의 정수 n 값을 입력하세요 >");
		number = sc.nextInt();

		char[][] num1 = new char[number][number];

		for (int i = 0; i < num1.length; i++) {
			double x = (num1.length + 1.0) / 2;
			double n = (i + 1.0) - x > 0 ? (i + 1.0) - x : -((i + 1.0) - x);

			for (int j = 0; j < num1[i].length; j++) {
				double y = (num1[i].length + 1.0) / 2;
				double m = (j + 1.0) - y > 0 ? (j + 1.0) - y : -((j + 1.0) - y);

				if (n >= m) {
					num1[i][j] = '#';
				} else if (n < m) {
					num1[i][j] = ' ';

				}

			}

		}

		// 출력
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				System.out.print(num1[i][j] + "  ");
			}
			System.out.println();
		} // 출력 END

		sc.close();
	}// main END

}// class END
