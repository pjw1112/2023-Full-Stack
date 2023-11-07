package com.company.day025;

public class Class019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car019 car019_1 = new Car019();
		System.out.println("car019_1.company : " + car019_1.company);
		System.out.println();
		
		Car019 car019_2 = new Car019("자가용");
		System.out.println("car019_2.company : " + car019_2.company);
		System.out.println("car019_2.model : " + car019_2.model);
		System.out.println();
		
		Car019 car019_3 = new Car019("자가용", "빨강");
		System.out.println("car019_3.company : " + car019_3.company);
		System.out.println("car019_3.model : " + car019_3.model);
		System.out.println("car019_3.color : " + car019_3.color);
		System.out.println();
		
		Car019 car019_4 = new Car019("버스", "노란색", 60);
		System.out.println("car019_4.company : " + car019_4.company);
		System.out.println("car019_4.model : " + car019_4.model);
		System.out.println("car019_4.color : " + car019_4.color);
		System.out.println("car019_4.speed : " + car019_4.speed);
		
		
		
	}

}

class Car019{
	static String company = "현대자동차";
	String model, color;
	int speed;
	
	public Car019(){}
	
	public Car019( String model) {
		this();
		this.model = model;
			}
	
	public Car019(String model, String color) {
		this(model);
		this.color = color;
			}
	
	public Car019( String model, String color, int speed) {
		this(model,color);
		this.speed = speed;
			}
	
	
	
	
}