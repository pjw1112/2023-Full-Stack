package com.company.day046;

public class TimeMeasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.nanoTime();

		// 실행시킬 코드
		for (int i = 0; i < 1000000000; i++) {
			
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("실행 시간: " + duration + " 나노초");
	}

}
