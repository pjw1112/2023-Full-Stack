package com.company.day023;
// 크ㄹ래스는 부품객체다.
// 부품객체는 = 속성 + 기능
// 부품객체 = 속성(멤버변수) +  기능(멤버함수





class FishBun3{
	//속성
	//자바 자료형 - 기본형 + 참조형
	boolean bl;
	char ch;
	byte b;
	short s;
	int i;
	long l;
	float fl;
	double d;
	int[] arr;
	String str;
	
	void show() {
		System.out.println(bl+"안녕하세요"+s);
	}
	
}

class FishBun2{
	
	FishBun2(String dough, String cream, int price){
		this.dough = dough;
		this.cream = cream;
		this.price = price;
	}
	FishBun2(){
		
	}
	String dough = "밀가루";
	String cream = "redBean";
	int price = 1000;
	
	void remake(String str1, String str2, int in) {
		
		dough = str1;
		cream = str2;
		price = in;
		
	}
	
	
	
}

public class Class002 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FishBun2 fishbun = new FishBun2();
		System.out.println(fishbun);
		
		fishbun.dough = "쌀가루";
		fishbun.cream = "슈크림";
		System.out.println(fishbun.dough);
		System.out.println(fishbun.cream);
		System.out.println(fishbun.price);
		
		System.out.println();
		FishBun2 fishbun2 = new FishBun2("빵가루","팥", 1500);
		
		System.out.println(fishbun2.dough);
		System.out.println(fishbun2.cream);
		System.out.println(fishbun2.price);
		
		System.out.println();
		
		fishbun2.remake("튀김가루", "들깨", 800);
		
		System.out.println(fishbun2.dough);
		System.out.println(fishbun2.cream);
		System.out.println(fishbun2.price);
		
		System.out.println();
		
		FishBun2 fishbun4 = new FishBun2();
		
		System.out.println(fishbun4.dough);
		System.out.println(fishbun4.cream);
		System.out.println(fishbun4.price);
		
		
		
//		FishBun3 fishbun3 = new FishBun3();
//		System.out.println(fishbun3.b);
//		System.out.println(fishbun3.s);
//		System.out.println(fishbun3.i);
//		System.out.println(fishbun3.l);
//		System.out.println(fishbun3.fl);
		
		// 1. 인스턴스화
		// 클래스 : 설계도 ---> 인스턴스화 ---> 객체(들) : 붕어빵, 인스턴스 : 각각의 붕어빵
		
		
		// 2. static
		
		
		
		
	}

}
