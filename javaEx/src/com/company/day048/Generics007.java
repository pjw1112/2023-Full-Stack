package com.company.day048;

class Test8<T extends Number>{
	T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
	
}



public class Generics007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	     
	       Test8<Number>     test1    = new Test8();   //#1.
//	       Test8<Object>  test2    = new Test8<>(); //#2.   
	       Test8<Number>  test3    = new Test8<>(); //#3.   
	       Test8<Float>   test4    = new Test8<>(); //#4.   
	       Test8<Integer> test5    = new Test8<>(); //#5.   
	       
	      
	       test1.setT(new Number() {
			
			@Override
			public long longValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int intValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public float floatValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double doubleValue() {
				// TODO Auto-generated method stub
				return 0;
			}
		});  //#6.
	       test1.setT(new Integer(100));  //#7.   
	       test1.setT(100);  //#8.   
	       test3.setT(100);  //#9.
	       test3.setT(3.14);  //#10.   
	     
		
		
	}

}
