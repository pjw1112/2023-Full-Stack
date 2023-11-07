package com.company.day037_abstract;

abstract class Shape002 {
	abstract void showArea(int w, int h);

	abstract void showArea(int r);

}

class Rectangle002 extends Shape002 {

	Rectangle002() {
		yell();
	}

	@Override
	void showArea(int w, int h) {
		// TODO Auto-generated method stub
		System.out.println("사각형의 넓이 : " + (w * h));
	}

	@Override
	void showArea(int r) {
		// TODO Auto-generated method stub

	}

	void yell() {
		System.out.println("사각형은 네모다");
	}

}

class Triangle002 extends Shape002 {

	Triangle002() {
		yell();
	}

	@Override
	void showArea(int w, int h) {
		// TODO Auto-generated method stub
		System.out.println("삼각형의 넓이 : " + (w * h / 2));
	}

	@Override
	void showArea(int r) {
		// TODO Auto-generated method stub

	}

	void yell() {
		System.out.println("삼각형은 세모다");
	}
}

class Circle002 extends Shape002 {
	Circle002() {
		yell();
	}

	@Override
	void showArea(int w, int h) {
		// TODO Auto-generated method stub

	}

	@Override
	void showArea(int r) {
		// TODO Auto-generated method stub
		System.out.println("원의 넓이 : " + (Math.PI * r * r));
	}

	void yell() {
		System.out.println("원은 동그랗다");
	}
}

public class Abstract002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle002 rec = new Rectangle002();
		rec.showArea(10, 10);
		Triangle002 tri = new Triangle002();
		tri.showArea(10, 10);
		Circle002 cir = new Circle002();
		cir.showArea(10);

	}

}
