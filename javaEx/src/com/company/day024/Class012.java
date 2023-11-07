package com.company.day024;

public class Class012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee012 a1 = new Coffee012("까페라떼", 4000, 2);
		Coffee012 a2 = new Coffee012();

		a1.show();
		a2.show();
	}

}

class Coffee012 {
	String name;
	int price;
	int num;

	Coffee012(String name, int price, int num) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.num = num;
	}

	Coffee012() {
		this("아메리카노", 3500, 1);
	}

	void show() {
		System.out.println("===== 커피");
		System.out.println("커피 이름 : " + name);
		System.out.println("커피 가격 : " + price);
		System.out.println("커피 잔수 : " + num);
		System.out.println();
	}

}