package com.company.day030;


class Color{
	private String name;

	public Color() {
		super();
	}

	public Color(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

class Green extends Color{
	int num;

	public Green() {
		super();
	}

	public Green(int num) {
		super();
		this.num = num;
	}
	
	public void show() {
		
		System.out.println(":::::: GREEN");
		System.out.println("= NAME : "+this.getName());
		System.out.println("= NUM : "+this.num);
	}
}




public class Extends002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN") ;
		mygreen.num = 5;
		mygreen.show();
		
		
	}

}
