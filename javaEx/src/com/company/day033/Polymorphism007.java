package com.company.day033;

class Papa{
	int money = 10000;
	public void sing() {System.out.println("GOD-거짓말");}
	@Override
	public String toString() {
		return "Mama [money=" + money + "]";
	}
}

class Son2 extends Papa{
	int money = 1500;
	public void sing() {super.sing();  System.out.println("빅뱅-거짓말");}
	@Override
	public String toString() {
		return "Son [money=" + money + ", car=" + "]";
	}		
}


public class Polymorphism007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Papa mypapa = new Son2();
		System.out.println(mypapa.money); //10000
		mypapa.sing(); //god
		
		System.out.println(((Son2)mypapa).money); //1500출력되게
		
		
		
	}

}
