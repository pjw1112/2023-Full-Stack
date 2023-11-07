package com.company.day019;

import java.util.Scanner;

public class Method010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("문자 입력 >");
		transText(sc.next().charAt(0));

	}

	static void transText(char c) {

		System.out.print("입력받은 문자 : " + c + "\t");

		if (65 <= c && c <= 90) {
			c += 32;
		} else if (97 <= c && c <= 122) {
			c -= 32;
		}

		System.out.print("변환된 문자 : " + c + "\n\n");

	}

}
