package com.company.day035;

class Parent14{
	public String name;
	public void method1() {
		System.out.println("Parent14-method1()"+this.toString());
	}
	public void method2() {
		System.out.println("Parent14-method2()"+this.toString());
	}
	@Override
	public String toString() {
		return "Parent14 [name=" + name + "]";
	}	
	
}
class Child14 extends Parent14{
	public String email;
	public void method3() {
		System.out.println("Child14-method3()"+this.toString());
	}
	public void method2() {
		System.out.println("Child14-method4()"+this.toString());
	}
	@Override
	public String toString() {
		return "Child14 [email=" + email + ", name=" + name + "]";
	}
	
	
}



public class Polymorphism014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent14 parent14 = new Child14();
		parent14.name = "data1";
		parent14.method1();
		parent14.method2();
		((Child14)parent14).email = "data2";  // (1) 가능?? >> 명시적 다운캐스팅 붙여야 함
		((Child14)parent14).method3();		  // (2) 가능?? >> 명시적 다운캐스팅 붙여야 함
		Child14 child14 = (Child14)parent14;
		child14.email = "yyy";				  // (3) 가능?? >> 가능
		child14.method3(); 					  // (3) 가능?? >> 가능
		
		
		
		
		
	}

}
