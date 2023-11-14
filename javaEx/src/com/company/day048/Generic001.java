package com.company.day048;

class G1_1{
	private int g;

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}
	
}



class G1_2{
	private String g;

	public String getG() {
		return g;
	}

	public void setG(String g) {
		this.g = g;
	}
	
}



class G1<G>{
	private G g;

	public G getG() {
		return g;
	}

	public void setG(G g) {
		this.g = g;
	}
	
}




public class Generic001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// #1. 각각의 클래스 작성시
		G1_1 test1 = new G1_1();
		test1.setG(10);
		System.out.println(test1.getG());
		
		// #2. generic 작성시
		G1<Integer> test3 = new G1<Integer>();
		test3.setG(10);
		System.out.println(test3.getG());
		
		G1<String> test4 = new G1<String>();
		test4.setG("하이");
		System.out.println(test4.getG());
		// #3. generic 작성이유
		
		
		
	}

}
