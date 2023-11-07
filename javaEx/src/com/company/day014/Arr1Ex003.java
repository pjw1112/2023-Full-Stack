package com.company.day014;

import java.util.Arrays;

public class Arr1Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch = new char[52];
		int count = 0;

		for (int i = 0, j = 0; i < ch.length; i++) {

			if (i + 64 == 90) {
				j = j + 6;
			}

			ch[i] = (char) (65 + j);

			j++;

		}

//		for (int i = 0; i < ch.length; i++) {
//			System.out.print(ch[i] + " ");
//		}

		System.out.println(Arrays.toString(ch));
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A'
					|| ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				count = count + 1;
			}

		}
		System.out.println("\n모음의 갯수 : " + count);

	}

}
