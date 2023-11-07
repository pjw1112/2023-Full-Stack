package com.company.day030;

class Grand {

	public void one() {
		System.out.println("grand : one");
	}

	public void two() {
		System.out.println("grand : two");
	}

}

class Father extends Grand {

	public void Three() {
		System.out.println("father : three");

	}

}

class Uncle extends Grand {

	public void four() {
		System.out.println("uncle : four");
	}

	public void one() {
		super.one();
		System.out.println("uncle : one");
	}

	public void two() {
		super.two();
		System.out.println("uncle : two");
	}

}

class Aunt{
	String name ="MiMi";

	@Override
	public String toString() {
		return name+ "옆집 이모 클래스";
	}
	
	
}


public class Extends004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Father father = new Father();
		father.Three();
		father.two();
		father.one();
		Aunt aunt = new Aunt();
		System.out.println(aunt.toString());
		System.out.println(aunt);
		
		
		
		
	}

}
