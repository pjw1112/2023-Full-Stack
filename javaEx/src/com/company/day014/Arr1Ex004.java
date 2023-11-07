package com.company.day014;

public class Arr1Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 대문자 <====> 소문자		대문자 <====> 소문자		대문자 <====> 소문자		대문자 <====> 소문자		
		// 대문자 <====> 소문자		대문자 <====> 소문자		대문자 <====> 소문자		대문자 <====> 소문자		
		// 대문자 <====> 소문자		대문자 <====> 소문자		대문자 <====> 소문자		대문자 <====> 소문자		
		// 대문자 <====> 소문자		대문자 <====> 소문자		대문자 <====> 소문자		대문자 <====> 소문자		
		
		char ch[] = { 'B', 'a', 'n', 'a', 'n', 'a' };

		for (int i = 0; i < ch.length; i++) {
			if (65 <= ch[i] && ch[i] <= 90) {
				ch[i] += 32;
			} else if (97 <= ch[i] && ch[i] <= 122) {
				ch[i] -= 32;
			}

		}

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

	}

}
