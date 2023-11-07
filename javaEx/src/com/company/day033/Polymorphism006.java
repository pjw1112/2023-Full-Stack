package com.company.day033;

class Mama{
	int money = 10;
	@Override
	public String toString() {
		return "Mama [money=" + money + "]";
	}
}

class Son extends Mama{
	int money = 150;
	int car = 2;
	@Override
	public String toString() {
		return "Son [money=" + money + ", car=" + car + "]";
	}		
}





public class Polymorphism006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mama mom = new Mama();
		Son son = new Son();
		System.out.println(mom.money); //10
		
		Mama mom2 = new Son();
		Son son2 = new Son();
		son2 = (Son)mom2; //가능
		
		System.out.println(son2.money);//150
		System.out.println(son2.car);//2
		

	}

}
