package com.company.day035;

class Animal012 {
	String name;

	public Animal012() {

	}

	public Animal012(String name) {
		super();
		this.name = name;
	}
}

class Dog012 extends Animal012 {

	public Dog012() {
			
	}

	public Dog012(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Dog012 [name=" + name + "]";
	}
	
}	
class Cat012 extends Animal012 {
	public Cat012() {
			
	}

	public Cat012(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Cat012 [name=" + name + "]";
	}

}

class Pig012 extends Animal012 {
	public Pig012() {
		
	}

	public Pig012(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Pig012 [name=" + name + "]";
	}

}

class ObjectTest2{
	static Animal012 ani;
	static public Object disp(int i) {
		
		switch(i) {
		
		case 1: ani = new Dog012("SarangE"); break;
		
		case 2: ani = new Cat012("Nya-Ong"); break;
		
		case 3: ani = new Pig012("Doni Doni"); break;
		
		}
		
		return ani;
	}
	
}

public class Polymorphism012 {
	public static void main(String[] args) {
		Dog012 dog012 = (Dog012)ObjectTest2.disp(1);
		System.out.println(dog012);
		Cat012 cat012 = (Cat012)ObjectTest2.disp(2);
		System.out.println(cat012);
		Pig012 pig012 = (Pig012)ObjectTest2.disp(3);
		System.out.println(pig012);
	}
	
	
}
