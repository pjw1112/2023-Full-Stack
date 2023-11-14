package com.company.day048;

class GbEquals{
	
	<T> boolean method(T t1, T t2){
	
		return t1.equals(t2);
	}
	
}



public class Generics006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GbEquals test = new GbEquals();
		System.out.println(test.method(10,"d"));
		System.out.println(test.<Double>method(1.2,1.23));
		System.out.println(test.<String>method("ABC","ABC"));
		System.out.println(test.method("ABC","abc"));
		
		
		
	}

}
