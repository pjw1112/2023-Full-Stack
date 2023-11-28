package com.company.day012;

import java.util.List;

public class Repeat002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//q1 1 2 3 4 5
		for(int i=1; i<6;i++) {
			System.out.printf(i+"\t");
		}
		
		System.out.println();
		
		//q2 5 4 3 2 1
		int i=5;
		while(i>0) {
			System.out.printf(i+"\t");
			i--;
		}
		
		System.out.println();
		
		//q3 java1 java2 java3
		i=1;
		do {
			System.out.printf("java"+i);
			i++;
		}while(i<4);
		
		
	}

}
