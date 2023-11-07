package com.company.day021;

public class Method034 {

	static int result = 0;

	static int plus(int i) {

		if (i < 0)
			return 0;

		return i + plus(--i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		System.out.println("1부터" + n + "까지의 합계" + plus(n));
	}

}
