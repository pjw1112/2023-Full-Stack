package com.company.day026;

public class Class028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car028 aa = new Car028();
		aa.color="red";
		aa.gear = "3단";
		aa.door = 4;
		aa.num[0] = 1;
		
		Car028 bb = new Car028(aa);
		aa.color = "blue";
		aa.num[0] = 7;
		System.out.println(aa.color);
		System.out.println(bb.color);
		System.out.println(aa.num[0]);
		System.out.println(bb.num[0]);
				
		
	}

}

class Car028{
	String color;
	String gear;
	int door;
	int[] num;
	
	Car028(){
		num=new int[5];
	}
	
	Car028(Car028 obj){
		this.color=obj.color;
		this.gear=obj.gear;
		this.door=obj.door;
		this.num = new int[obj.num.length];
	        System.arraycopy(obj.num, 0, this.num, 0, obj.num.length);
		
	}
	
}