package com.company.day025;

public class Class018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student002 s2 = new Student002();
		System.out.println(s2);
		s2.name = "first";
		s2.no = 11;
		s2.kor = 100;
		s2.eng = 100;
		s2.math = 99;
		s2.info();
		
		
		
	}

}

class Student002{
	String name;
	int kor, eng, math, no;
	@Override
	public String toString() {
		return "[name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", no=" + no + "]";
	}
	
	void info() {
		System.out.println("이름 : "+ name);
		System.out.println("총점 : "+ (kor+eng+math));
		System.out.println("평균 : "+ String.format("%.2f", (kor+eng+math)/3.0 ));
	}
	
	
	
}