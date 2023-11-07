package com.company.day037_abstract;

abstract class Animal{
	
	String name;
	final int age=4;
	public abstract void eat();
	public abstract void sleep();
	public abstract void poo(int i, String j); //추상 메서드 1개라도 있으면 추상 클래스여야 함
	//abstract (추상화, 일반화, 설계) 클래스
}
class Cat001 extends Animal{
	String rrn;
	public void eat(){};
	public void sleep(){};
	public void poo(int i, String j){};
}





public class Abstract001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat001 dd = new Cat001();
		System.out.println(dd.age);  
		
		Animal cc = new Animal() {
			
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void poo(int i, String j) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}
