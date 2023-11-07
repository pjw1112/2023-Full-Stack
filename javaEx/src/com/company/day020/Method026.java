package com.company.day020;

import java.util.Arrays;
import java.util.Scanner;

public class Method026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] users= {
				{"aaa", "111", "한국"},
				{"bbb", "222", "호주"},
				{"ccc", "333", "일본"}
		};
		
		while(true) {
		who_are_you(users);
		
		who_pass_change(users);
		
		}
		
		
	}
	
	static void who_are_you(String[][] users) {
		
		Scanner sc = new Scanner(System.in);
		int num=-1;
		while(true) {
		System.out.println("Id를 입력해주세요 > ");
		String str = sc.next();
		
		for(int i=0; i<users.length;i++) {
			if(users[i][0].equals(str)) {
				num=i;
			}
		}
		
		
		if(0<=num && num<=2) {
		System.out.println(str+" 은 "+users[num][2]+" 사람입니다.");
		break;
		}else {
			System.out.println("입력하신 아이디 정보가 없습니다. 다시입력하세요.");
		}
		}
		
		
	}
	

	static void who_pass_change(String[][] users) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.println("Id를 입력해주세요 > ");
		String str = sc.next();
		
		for(int i=0; i<users.length;i++) {
			if(users[i][0].equals(str)) {
				num=i;
			}
		}
		while(true) {
		System.out.println("password를 입력해주세요 > ");
		str = sc.next();
		
		if(users[num][1].equals(str) ) {
			System.out.println(users[num][0]+" 님 반갑습니다.");    
			System.out.println("바꿀 비밀번호를 입력해주세요 > ");
			users[num][1]=sc.next();
			System.out.println("정보 확인 : "+Arrays.toString(users[num]));
			System.out.println("비밀번호 변경 성공!!");
			System.out.println();
			System.out.println();
			
			break;
			
			
			
		}else {
			System.out.println("정확히 입력해주세요.");
		}
		}
	}
	
	
}
