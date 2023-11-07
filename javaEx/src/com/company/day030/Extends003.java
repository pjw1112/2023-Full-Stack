package com.company.day030;

class MobileNote7{
	
	private String iris;
	
	public void newshow() {
		System.out.println("::::NOTE7새로운 기능(Overriding)");
		System.out.println("= iris 홍채인식 ㄱㅣ능!");
		System.out.println("= myiris : "+ this.iris);
		
	}

	public String getIris() {
		return iris;
	}

	public void setIris(String iris) {
		this.iris = iris;
	}
	
	
}

class MobileNote8 extends MobileNote7{
	
	private String face;

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}
	
	public void newshow() {
		super.newshow();
		System.out.println("::::NOTE8새로운 기능(Overriding)");
		System.out.println("= face 안면 인식 기능!");
		System.out.println("= face : "+ this.face);
	}
	
	
}

class MobileNote9 extends MobileNote8{
	
	private String battery;

	public String getBattery() {
		return battery;
	}

	public void Battery(String battery) {
		this.battery = battery;
	}
	
	public void newshow() {
		super.newshow();
		System.out.println("::::NOTE9새로운 기능(Overriding) 추가");
		System.out.println("= battery : 하루 종일 사용 가능!");
		System.out.println("= battery : 24");
	}
	
	
}






public class Extends003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newshow();
		
	}

}
