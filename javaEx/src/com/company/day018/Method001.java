package com.company.day018;

public class Method001 {

	
	void washer(int d) {
		System.out.println(d+"스푼으로 세탁을 합니다.");
	}
	void washer(int d, String target) {
		System.out.println(target+"을 세탁합니다\n"+d+"스푼으로 세탁을 합니다.");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method001 me = new Method001();
		me.washer(5);
		me.washer(6,"청바지");
		
	
	}
	
}	
		