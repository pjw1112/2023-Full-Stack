package com.company.day035;

class Parent15 {}
class Child15 extends Parent15{}



public class Polymorphism015 {
	
	public static void method1(Parent15 parent15) {
		if(parent15 instanceof Child15) {
			Child15 child15 = (Child15)parent15;
			System.out.println("method1 - Child15로 변환 성공");
		}
		
	}
	
	public static void method2(Parent15 parent15) {
	
			Child15 child15 = (Child15)parent15;
			System.out.println("method2 - Child15로 변환 성공");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent15 parent15A = new Child15();
		method1(parent15A);
		method2(parent15A); // 둘 다 가능
	
		Parent15 parent15B = new Parent15();
		method1(parent15B); //instanceof Child15 False
//		method2(parent15B); class cast Exception
		System.out.println("이상없음");
		System.out.println(parent15A instanceof Child15);
		System.out.println(parent15A instanceof Parent15);
		System.out.println();
		System.out.println(parent15B instanceof Child15);
		System.out.println(parent15B instanceof Parent15);
	}

}
