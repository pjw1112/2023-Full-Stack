package com.company.day042;


class KimBob{
	String name="hi";
	int price;
	
	public KimBob(){
		KimBob.DanMugi muji = new DanMugi();
		muji.show();
		final int field2;
	}
	
	void meme() {
		class navi{
			public void show() {
				System.out.println("길안내해라이");
			}
		}
	}
	
	
	class DanMugi{
		String name="my";
		void show() {
			System.out.println( KimBob.this.name );
			System.out.println("단무지 추가");
		}
	}
	class Rice{
		public void show() {
			System.out.println("밥 추가");
		}
	}
	class Kim{
		public void show() {
			System.out.println("김 추가");
		}
	}
	
	
	
}


public class inner002 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KimBob kimbob = new KimBob();
		
		
		
		
		
	}

}
