package com.company.day038_interface;



interface Order004{
	void ordered(String type, int num);
}

interface Bun004{
	void bun(fishShapedBun004 bread);
}

interface OrderProcess004 extends Order004,Bun004{
	
}

class fishShapedBun004{
	private String type;
	private int price;
}

class User41{}

class User42 extends User41 implements OrderProcess004{

	User42(){
		System.out.println("Order구현묶음머쩌구~");
	}
	@Override
	public void ordered(String type, int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bun(fishShapedBun004 bread) {
		// TODO Auto-generated method stub
		
	}
	
}




public class interface004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User42 myc = new User42();
	}

}
