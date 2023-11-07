package com.company.day035;


class FishShapedBun01b{
	int price;
	public FishShapedBun01b() {}
	public FishShapedBun01b(int price) { this.price = price;}
	
}

class RedBean01b extends FishShapedBun01b{
	public RedBean01b() {super(1500);}

	@Override
	public String toString() {
		return "팥 붕어빵";
	}
	
}

class CustardCream01b extends FishShapedBun01b{
	public CustardCream01b() {super(1800);}
	@Override
	public String toString() {
		return "슈크림 붕어빵";
	}
	
}

class Pizza01b extends FishShapedBun01b{
	public Pizza01b() {super(2000);}
	@Override
	public String toString() {
		return "피자 붕어빵";
	}
	
}

class User01b{
	static int cnt = 0;
	int money;
	FishShapedBun01b[] cart;
	boolean mymoneyok = true;
	public User01b() {
		money = 10000;
		cart = new FishShapedBun01b[5];
	}
	void buy(FishShapedBun01b obj) {
		cart[cnt]=obj;
		cnt++;
		
	}
	
	void summary() {
		String buy_items="";
		int total_price=0;
		for (FishShapedBun01b obj : cart) {
			buy_items += ", "+ obj.toString();
			total_price += obj.price;
		}
		buy_items = buy_items.substring(2);
		System.out.println("구입 물품 : "+ buy_items);
		System.out.println("사용 금액 : "+ total_price);
		System.out.println("남은 금액 : "+ (money-total_price));
		
	}
	
	
}




public class Polymorphism016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User01b b = new User01b();
		b.buy(new RedBean01b());
		b.buy(new CustardCream01b());
		b.buy(new RedBean01b());
		b.buy(new Pizza01b());
		b.buy(new CustardCream01b());
		b.summary();
		
		
	}

}
