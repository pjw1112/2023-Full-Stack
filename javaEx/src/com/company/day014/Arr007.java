package com.company.day014;

public class Arr007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] arrchar = new char[5];

		for (int i = 0; i < arrchar.length; i++) {
			arrchar[i] =(char)('A'+i);
		}

		for (int i = 0; i < arrchar.length; i++) {
			System.out.print(arrchar[i] + "\t");
		}

	}

}
