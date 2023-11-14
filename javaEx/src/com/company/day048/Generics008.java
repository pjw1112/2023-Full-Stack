package com.company.day048;

class My<A>{
	A a;
	<T> T mm(T t) {
		
		return t;
	}
}

class Child<A,T> extends My<A>{
	
	T b;
	
}


public class Generics008 {

	public static void main(String[] args) {
	
	My<String> my = new My<>();
	
	System.out.println(my.<String>mm("하이"));
	System.out.println(my.mm(123));
	
	
	
	
	}
}
