package com.company.day035;

abstract class Parent017{
	public String name;
	
	Parent017(){}
	
	public void method1() {
		System.out.println("Parent017-method1()");
	}
	public void method2() {
		System.out.println("Parent017-method2()");
	}
	@Override
	public String toString() {
		return "Parent14 [name=" + name + "]";
	}	
	
}
class Child017 extends Parent017{
	public String email;
	public void method2() {
		System.out.println("Child017-method2()");
	}
	public void method3() {
		System.out.println("Child017-method3()");
	}
	@Override
	public String toString() {
		return "Child14 [email=" + email + ", name=" + name + "]";
	}
	
	
}

public class Polymorphism017 {
	public static void main(String[] args) {
		Parent017 dd = new Parent017() {};
		Child017 child017 = new Child017();
		Parent017 parent017 =  child017;
		parent017.method1(); // Parent017-method1()
		parent017.method2(); // Child017-method2()
		((Child017)parent017).method3(); // Child017-method3()
	}

}
