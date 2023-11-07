package com.company.day025;

public class Class020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		son myson = new son();
		Car019.company="현대해상";
		myson.wow();
	}

}

class father{
	int age;
	String sex;
	
	public father() {
		super();
		// TODO Auto-generated constructor stub
	}

	father(int age,String sex){
		this.age=age;
		this.sex = sex;
	}
	
	void wow() {
		
		System.out.println(age);
		System.out.println("wow!");
	}
}

class son extends father{
	
	son(){
		
	}
	void wow() {
		System.out.println("h-------wow!");
	}
	
}