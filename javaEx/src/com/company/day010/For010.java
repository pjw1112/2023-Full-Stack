package com.company.day010;

public class For010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}

		}

		System.out.println("소문자 a~z까지 모음의 개수 : " + count);
	}

}
