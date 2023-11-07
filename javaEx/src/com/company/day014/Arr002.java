package com.company.day014;

public class Arr002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] fl = { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f };
		for (int i = 1; i < 6; i++) {
			fl[i - 1] = (float) (1 + (0.1 * i));

		}

		for (int i = 1; i < 6; i++) {
			System.out.println(fl[i - 1]);
		}

	}

}
