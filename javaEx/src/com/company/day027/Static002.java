package com.company.day027;

class StaticAnimal2{
	String name;  	//인스턴스변수
	int age;		//인스턴스변수
	static String COMPANY ="(주)동물농장";		//클래스변수
	static String BOSS;						//클래스변수
	static String LOCATION;					//클래스변수
	static int NUM = 20;					//클래스변수
	static { BOSS="신동엽"; LOCATION="여의도"; }
	
	static void num_plus() { NUM++;} 	//클래스 메서드
	void show() {						//인스턴스 메서드
		
		System.out.println(this.name);
	}
	
	
	
}



public class Static002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		//초기화 순서 : 기본초기화 > 명시적초기화 > 초기화 브록 > 생성자 초기화
		
		
	}

}


