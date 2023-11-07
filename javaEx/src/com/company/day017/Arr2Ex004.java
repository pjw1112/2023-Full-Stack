package com.company.day017;

public class Arr2Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수
		int[][] datas = new int[3][4];
		int[][] result = new int[datas.length + 1][datas[0].length + 1];

		// datas 배열에 값 삽입
		for (int i = 0; i < datas.length; i++) {
			for (int j = 0; j < datas[i].length; j++) {
				datas[i][j] = (i + 1) * 10;
			}
		}

		// result 배열에 값 삽입
		for (int i = 0; i < result.length - 1; i++) {

			for (int j = 0; j < result[i].length - 1; j++) {
				result[i][j] = datas[i][j]; // 같은 항 번호에 같은 값 복사
				result[i][4] += datas[i][j]; // 각 행의 마지막 열에 각 행 값 합산
				result[3][j] += datas[i][j]; // 각 열의 마지막 행에 각 열 값 합산
				result[result.length - 1][result[i].length - 1] += datas[i][j]; // 마지막행 마지막열에 모든 항 값 합산
			}
		}

		// 출력
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
