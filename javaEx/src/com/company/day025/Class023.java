package com.company.day025;

public class Class023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile023 mobile3 = new Mobile023("Samsung", 10000, "NOTE20");
		mobile3.show();
		
		Mobile023 mobile2 = new Mobile023();
		mobile2.show();
		Mobile023 mobile1 = new Mobile023();
		mobile1.company = "Samsung";
		mobile1.price = 1000000;
		mobile1.product = "NOTE2.0";
		mobile1.sale();
		mobile1.show();
		
		
		
	}
}

class Mobile023{
	
	String company;
	float price;
	String product;
	
	{company="samsung"; price=1200000.0f; product="NOTE9";  }
	
	
	public Mobile023() {}
	
	
	public Mobile023(String product) {
		
		this.product = product;
	}
	
	public Mobile023(float price, String product) {
		
		this(product);
		this.price = price;
		
	}
	
	public Mobile023(String company, float price, String product) {
		
		this(price,product);
		this.company = company;
		
	}

	void show() {
		System.out.println("=== MOBILE _ ver3 ===");
		System.out.println(this.company);
		System.out.println(this.price);
		System.out.println(this.product);
		
	}
		
	void sale() {
		this.price*=0.9;
		
	}
	
	
	
	
}