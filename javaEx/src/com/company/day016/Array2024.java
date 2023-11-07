package com.company.day016;

import java.util.Scanner;

public class Array2024 {

// 0. 아이디어 
// 1. 임의의 n x n 행렬 생성시 처음 1행 n열을 만들어 둔다.  
// 2. 그 다음부터는 가로 방향 세로 방향이 교차 하면서 number 만큼 번호들을 생성한다.
// 3. 가로,세로 가 한번씩 지나갈때마다 number-- 해 준다. 
// 4. 가로 세로 진행시에도 양의 방향과 음의 방향이 한번씩 교차 한다. 
// 5. 그러므로 가로 +방향, 가로 -방향, 세로 +방향, 세로-방향 으로 진행하는 동작 4개를 만든다.
// 6. 각 동작이 1회 반복 할때마다 (행)(열)번호와 count를 업데이트 시킨다.
// 7. number=1이 될때까지 2~6을 반복한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0; // 사용자에게 입력 받을 number
		int row = 0, column = 0; // '행'번호 , '열'번호
		int count = 0; // 카운트
		Scanner sc = new Scanner(System.in); // 키보드 입력 스캐너
		System.out.println("시계방향으로 바깥에서 안쪽으로 돌며 1씩 증가하는 n x n 정사각 행렬을 생성합니다.");
		System.out.println("양의 정수 n 값을 입력하세요 >");
		number = sc.nextInt(); // number 입력

		int[][] num = new int[number][number]; // n x n 행렬 생성

		// 1. 임의의 n x n 행렬 생성시 처음 1행 n열을 만들어 둔다.
		for (int i = 0; i < num.length; i++) {
			num[0][i] = i + 1;
			row = 0;
			column = i;
			count = i + 1;
		}

		// 가로/세로, +/- 교차 알고리즘 시작
		// 사용자에게 입력받은 값(number) 가 2가 될때까지 반복문 진입
		// ※ 양의 정수 number 는 어떤 값에서 시작 하던지간에 마지막엔
		// ※ number=2 일때 (n*n)-1번과 (n*n)번을 기록한 후
		// ※ number-- 되어 number=1이 되고 while은 종료된다.
		while (number >= 2) {

			// 세로 (-)방향 생성
			for (int i = 1; i < number; i++) {
				count++;
				row++;
				num[row][column] = count;
			}

			// 가로 (-)방향 생성
			for (int i = 1; i < number; i++) {
				count++;
				column--;
				num[row][column] = count;
			}

			number--;// 가로,세로 가 한번씩 지나갈때마다 number-- 해 준다.

			// 세로 (+)방향 생성
			for (int i = 1; i < number; i++) {
				count++;
				row--;
				num[row][column] = count;
			}

			// 가로 (+)방향 생성
			for (int i = 1; i < number; i++) {
				count++;
				column++;
				num[row][column] = count;
			}

			number--;// 가로,세로 가 한번씩 지나갈때마다 number-- 해 준다.

		} // while END

		// 출력
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		} // 출력 END

		sc.close();
	}// main END

}// class END
