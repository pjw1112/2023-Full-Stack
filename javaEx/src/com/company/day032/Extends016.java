package com.company.day032;

class Calc01b extends Object {
	
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
}

class Circle0lb extends Calc01b {

	double areaCircle(double r) {

		return 3.141592653589793 * r * r;
	}

}

public class Extends016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 10;

		Calc01b calculator = new Calc01b();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();

		Circle0lb computer = new Circle0lb();
		System.out.println("원면적 : " + computer.areaCircle(r));

	}

}
