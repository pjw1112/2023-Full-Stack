package com.company.day033;

class Mother {
	int ma = 10;
	int mb = 20;

	public Mother() {
		super();
	}

	public Mother(int ma) {
		this.ma = ma;
	}

	public Mother(int ma, int mb) {
		super();
		this.ma = ma;
		this.mb = mb;
	}

	public void func() {
		System.out.println("==Mother");
	}
}
	class Daugther extends Mother {
		int mb = 30;
		int mc = 40;

		public Daugther() {
			super();
		}

		public Daugther(int ma, int mb) {
			super(ma, mb);
		}

		public Daugther(int ma, int mb, int mc) {
			super(ma);
			this.mb = mb;
			this.mc = mc;
		}
		
		@Override
		public void func() {
			System.out.println("ㅁ ㅁ Dauather");
		}
	}
		
	
	
	
public class Polymorphism008 {

	public static void main(String[] args) {
		
		
		System.out.println(":::::: 1) TEST");
		
		Mother mo = new Mother();
		System.out.println("mo.ma :" + mo.ma); //
		System.out.println("mo.mb : "+ mo.mb); //
		mo.func(); //
		
		System.out.println("::::::  2) TEST");
		Daugther da = new Daugther();
		System.out.println("da.ma :" + da.ma); //
		System.out.println("da.mb :" + da.mb); //
		System.out.println("da.mce :" + da.mc); //
		da.func();
		//da = (Daugther) mo; //부모 클래스 객체를 자식 클래스 객체로 형변환 불가
		System.out.println(da);
		
		
		System.out.println("::::::  3) TEST");
		
		Mother md = new Daugther();
		System.out.println("md.ma :" + md.ma); //
		
		System.out.println("md.mb =" + md.mb); //
		System.out.println("md.mc :" + ((Daugther)md).mc); //
		System.out.println("md.mc :" + ((Daugther)md).mc); //
		md.func();
		
		
		System.out.println("::::::  4) TEST");
		System.out.println( (float)10 );
		//Daugther dm = (Daugther) new Mother();//부모 클래스 객체를 자식 클래스 객체로 형변환 불가
		
		
		System.out.println("::::::  5) TEST");
		Mother md2 = da;
		System.out.println("mdZ.mb :" + md2.ma); //
		System.out.println("mdZ.mb :" + md2.mb); //
		System.out.println("mdZ.me :" + ((Daugther)md2).mc); //
		md2.func();
		
		
	}
}

