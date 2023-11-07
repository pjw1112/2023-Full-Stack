package com.company.day014;

public class Arr1Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[] = { 'B', 'a', 'n', 'a', 'n', 'a' };

		System.out.println("대문자의 개수는 :" + largeLetterCount(ch));
		System.out.println("소문자의 개수는 :" + smallLetterCount(ch));

	}
	
	//문자 배열 변수를 받아서 해당 문자 배열에 대문자가 몇개 있는지 카운트 한 값을 int형 정수로 반환해주는 메서드
	public static int largeLetterCount(char[] ch) {
		int i = 0;

		for (int j = 0; j < ch.length; j++) {

			if (65 <= ch[j] && ch[j] <= 90) {
				i = i + 1;
			}
		}
		return i;
	}

	//문자 배열 변수를 받아서 해당 문자 배열에 소문자가 몇개 있는지 카운트 한 값을 int형 정수로 반환해주는 메서드
	public static int smallLetterCount(char[] ch) {
		int i = 0;

		for (int j = 0; j < ch.length; j++) {

			if (97 <= ch[j] && ch[j] <= 122) {
				i = i + 1;
			}
		}
		return i;
	}

}
