package com.company.day033;

class TestA {
	int a = 1;

	void aa() {
		System.out.println("TestA 부모 aa 메서드");
	}

	@Override
	public String toString() {
		return "TestA [a=" + a + "]";
	}

}

class TestB extends TestA {
	int a = 2;
	int b;

	void aa() {
		System.out.println("TestB 자식 aa 메서드");
	}

	void bb() {
		System.out.println("bbbbb");
	}

	@Override
	public String toString() {
		return "TestB [a=" + a + ", b=" + b + "]";
	}

}

class TestC extends TestA {
	int a = 3;
	int c;

	void aa() {
		System.out.println("TestC 자식 aa 메서드");
	}

	void cc() {
		System.out.println("ccccc");
	}

}

public class Polymorphism001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestA ta = new TestA();
		TestB tb = new TestB();
		((TestA)tb).aa(); 
	}

}
