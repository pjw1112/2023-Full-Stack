package com.company.day035;

class ObjectTest{
	
	public static void line() { System.out.println("============================");}
	public void show(String str) {System.out.println(str.toString());}
	public void show(Integer str) {System.out.println(str.toString());}
	public void show(Double str) {System.out.println(str.toString());}
	public void showTotal(Object obj) {
		System.out.println(obj.toString());
	}
//	public void showTotal
	
}



public class Polymorphism011 {

	public static void main(String[] args) {
		
		ObjectTest test = new ObjectTest();
		test.show("Happy");
		test.show(10);
		test.show(3.14);
		ObjectTest.line();
		test.showTotal("Happy");
		test.showTotal(10);
		test.showTotal(3.14);
	}
	
}
