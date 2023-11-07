package com.company.day032;
//1. 합성 : 생성자에서 필드에 대한 객체를 생성
class Engine{
	
}

class Wheel{

	
}

class Car{
	private Engine engine;
	private Wheel wheel;
	
	public Car() {
		this.engine = new Engine();
		this.wheel = new Wheel();
		
		
	}
	
}








public class Uml_Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
