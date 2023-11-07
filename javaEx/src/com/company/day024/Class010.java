package com.company.day024;

//1. 부품객체(클래스), 상태(속성-멤버변수)와 행위(기능-멤버함수)를 갖는다.
class Car010{
	String color;
	int    price;
	
	
	Car010(String color, int price){
		this.color = color;
		this.price = price;
	}
	
	Car010(String color){
		this(color,0);
	}
	Car010(int price){
		this("none",price);
	}
	Car010(){
		this("none",0);
	}
	
	
}


public class Class010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car010 mycar = new Car010();
		
		System.out.println(mycar);
		System.out.println(mycar.color);
		
		Car010 mycar2 = new Car010(1000);
		
		System.out.println(mycar2.price);
		
		
		
		
	}

}

//2. 설계도(Car010 / class010)
// 	 객체(들) - car
//   인스턴스 - car
