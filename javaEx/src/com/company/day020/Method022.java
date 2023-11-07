package com.company.day020;

import java.util.Arrays;

public class Method022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"아이언맨","헐크","캡틴"};
		disp_swipe(name);
		System.out.print(Arrays.toString(name));
		
		
	}

	static void disp_swipe(String[] name) {
		String str="";
		str=name[0];
		name[0]=name[1];
		name[1]=str;
	}
	
	
}
