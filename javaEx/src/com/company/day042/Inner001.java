package com.company.day042;

class Out001{
	//1. 멤버변수 ( 클래스 변수, 인스턴스 변수 )
	static int oc = 10;
		   int oi = 2;
	
	
	//2. 멤버함수 ( 클래스 메서드, 인스턴스 메서드 )
	void show() {
		System.out.println(oc +  oi);
	}
	//3. 중첩클래스
	class in001{
		int x= 1;
		String y = "hello";
		
	}
	
}


public class Inner001{
	public static void main(String[] args) throws Exception{
		Out001 o1 = new Out001();
		
		Out001.in001 in1 = o1.new in001();
		
		Out001.in001 in2 = new Out001().new in001();
		
		System.out.println(10/0);
		
		
		
		
	}
}
