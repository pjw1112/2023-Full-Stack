package com.company.day014;

public class Arr008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrname = new String[3];

//		String[] names = {"아이언맨", "헐크", "캡틴"};
//
//		for (int i = 0; i < names.length; i++) {
//		    arrname[i] = names[i];
//		}

		String name = "아이언맨 헐크  캡틴 ";

		for (int i = 0; i < arrname.length; i++) {
			arrname[i] = name.substring(i * 4, (i + 1) * 4);
		}

		for (int i = 0; i < arrname.length; i++) {
			System.out.print(arrname[i] + "\t");

		}
		System.out.println();
		for (String i : arrname) {
			System.out.print(i + "\t");

		}
		

	}

}
