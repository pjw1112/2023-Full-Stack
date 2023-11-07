package com.company.day015;

public class Arr2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] avengers = { { "아이언맨", "헐크", "호크아이" }, { "토르", "블랙팬서", "블랙위도우" } };
		String[][] my_text = new String[2][3];

		for (int i = 0; i < my_text.length; i++) {
			for (int j = 0; j < my_text[i].length; j++) {
				my_text[i][j] = avengers[i][j];
			}

		}

		for (int i = 0; i < avengers.length; i++) {
			for (int j = 0; j < avengers[i].length; j++) {
				System.out.print(avengers[i][j] + "\t");
			}

			System.out.println();

		}

	}

}
