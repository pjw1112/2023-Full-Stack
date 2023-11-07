package com.company.day023;

class FishBun1_1{}
class FishBun1_2{}



public class Class001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		FishBun1_1 red=null;
		System.out.println(red);
		red = new FishBun1_1(); 
				//1. 공간 빌리기 (heap area) 2. 생성자 호출 생성자 3. 지번 리턴
		System.out.println(red);

	}

}
/*
 * 파일명 : Class001		[javac Class001.java]
 * 클래스파일 : FisBun1_1.classs/ FisBun1_2.classs /FisBun1_3.classs / Class001.class
 * ===========================================================================
 * [Method Area - 정보 , static, final]
 * (3번지) FisBun1_1.classs
 * (2번지) FisBun1_2.classs
 * (1번지) Class001.classs
 * ---------------------------------------------------------------------------
 * [heap Area]			| {Java Stacks}
 * 						| #STEP4 [ red  | null ]
 * 						| #STEP3 [ a	| 1 ]
 * 						| #STEP2 [ main ]
 * ===========================================================================
 */