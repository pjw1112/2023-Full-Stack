package com.company.day014;

public class Arr1Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[]= {'B','a','n','a','n','a'};
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				sum=sum+1;
			}
		}
		
		System.out.println("a의 갯수 : "+sum);
		
	}

}
