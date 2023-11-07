package com.company.day024;

public class Class011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyPrice002.show("노트",10505050);
		
		
	}

}

class MyPrice002 {
	String name;
	int price;
	
	public MyPrice002() {
		// TODO Auto-generated constructor stub
		name="갤럭시노트12";
		price=10000;
	}
	
	static void show(String name, int price) {
		System.out.println("상품 이름 : "+name);
		System.out.println("상품 가격 : "+price);
	}
}