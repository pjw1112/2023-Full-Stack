package com.company.day035;

class FishShapedBun{
	public void run() {
		System.out.println("붕어빵을 만듭니다.");
	}
}

class RedBean extends FishShapedBun{
	public void run() {
		System.out.println("팥붕어빵을 만듭니다.");
	}
	
}

class CustardCream extends FishShapedBun{
	public void run() {
		System.out.println("슈크림붕어빵을 만듭니다.");
	}
	
}


class Baker{
	
	static void drive(FishShapedBun obj) {
		obj.run();
	}
	
}

public class Polymorphism013 {
	public static void main(String[] args) {
		
		
		RedBean redbean = new RedBean();
		CustardCream custardcream = new CustardCream();
		Baker.drive(redbean);
		Baker.drive(custardcream);
		
		
		
		
		
	}
	
	
}
