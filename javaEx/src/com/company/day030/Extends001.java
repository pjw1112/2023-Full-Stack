package com.company.day030;

class A1 extends Object{ 
	
	int a;
	
	public A1(int a){
		this.a = a;
	}
	
	 }
class B1 extends A1{ 
	
	
	
	public B1(int a) {
		super(a);
		
	}

	int b; }
class C1 extends B1{ 
	int c; 
	
public C1(int a) {
		super(a);
		this.c = c;
	}

public void show() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}




}


public class Extends001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
