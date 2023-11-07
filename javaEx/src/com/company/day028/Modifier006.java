package com.company.day028;

import com.company.day028.etc.Car006;

public class Modifier006 extends Car006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car006 c1 = new Car006();
		c1.color = "white";
		c1.gear = "auto";
		c1.door = 4;

		Car006 c2 = new Car006("white", "auto", 4);
		System.out.println(c1);
		System.out.println(c2);

	}

}
