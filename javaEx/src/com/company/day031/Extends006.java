package com.company.day031;

 class Fruit2 {
	String[] str = {"WORST","BBBBAD","NOT BAD","SOSO","GOOD","BEST"};
	
	Fruit2() {
		System.out.println("::Fruit 생성자");
		System.out.println();

	}

	void star(int num) {

		System.out.println("::::FRUIT"+num);
	}

	static void line() {
		System.out.println("========================================");
		System.out.println();
	}
}


class Apple2 extends Fruit2 {
	Apple2() {
		super();
		System.out.println("::::Apple 생성자");
		System.out.println();
	}
	void star(int num) {

		System.out.println("::::APPLE");
		System.out.println("="+str[num]);
	}

}


class AppleJam2 extends Apple2 {
	AppleJam2() {
		super();
		System.out.println("::::::AppleJam 생성자");
		System.out.println();
	}

	void star(int num) {

		System.out.println("::::APPLEJAM");
		System.out.println("="+str[num]);
		for(int i=0;i<num;i++) {
			System.out.print("★");
		}
		System.out.println();
	}
}


public class Extends006 {

	static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit2.line();
		Fruit2 fruit = new Fruit2();
		fruit.star(0);
		Fruit2.line();
		Apple2 apple = new Apple2();
		apple.star(4);
		apple.line();
		AppleJam2 applejam = new AppleJam2();
		applejam.star(5);

	}

}