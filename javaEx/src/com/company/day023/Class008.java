package com.company.day023;

import java.util.Scanner;

class Animal001{
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	
	void input() {
		System.out.println("::이름입력 > ");
		name = sc.next();
		System.out.println("::나이입력 > ");
		age = sc.nextInt();
		System.out.println();
		
	}
	
	void show() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
	}
	
	
	
}

public class Class008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Animal001 a1 = new Animal001();
			a1.input();
			a1.show();
		
		
	}

}
