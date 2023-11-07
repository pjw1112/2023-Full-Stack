package com.company.day020;

import java.util.Arrays;

public class Method020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] abc= {'a','b','c'};
		upperTo(abc);
		System.out.println("main에서의 abc :"+ Arrays.toString(abc));
		
	}
	
	static char[] upperTo(char[] abc) {
		
		for(int i=0;i<abc.length;i++) {
			
			if('A'<=abc[i] && abc[i] <='Z') {
				abc[i]+=32;
			}
			
			if('a'<=abc[i] && abc[i] <='z') {
				abc[i]-=32;
			}
			
			
		}
		
		
		return abc;
	}

}
