package com.company.day020;

import java.util.Arrays;
import java.util.Scanner;

public class Method023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userinput = "";
		String[] input = {"",""};

		
		userinput = user_input();
//		user_show(userinput, input);
		input=userinput.split(" ");
		System.out.println(Arrays.toString(input));

	}

	static String user_input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(",로 구분해서 문자열 두개를 넣어주세요");
		String str=scanner.next();
		return str;
	}

//	static void user_show(String userinput, String[] input) {
//
//		int indexA = userinput.indexOf(',');
//		for (int i = 0; i < indexA; i++) {
//			input[0] += userinput.charAt(i);
//		}
//		for (int i = indexA+1; i < userinput.length(); i++) {
//			input[1] += userinput.charAt(i);
//		}
//	}

}
