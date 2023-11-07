package com.company.day031;

class Fruit{
	Fruit(){
		System.out.println("::Fruit 생성자");
		System.out.println();
	}
	
	static void line() {
		System.out.println("========================================");
		System.out.println();
	}
}

class Apple extends Fruit{
	Apple(){
		System.out.println("::::Apple 생성자");
		System.out.println();
	}
	
}

class AppleJam extends Apple{
	AppleJam(){
		System.out.println("::::::AppleJam 생성자");
		System.out.println();
	}
	
}



public class Extends005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Fruit.line();
		Fruit fruit = new Fruit();
		Fruit.line();
		Apple apple = new Apple();
		apple.line();
		AppleJam applejam = new AppleJam();
		
		
		
	}

}
