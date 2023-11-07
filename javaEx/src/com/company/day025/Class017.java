package com.company.day025;

public class Class017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student001 s1 = new Student001();
		System.out.println(s1);
	}

}

class Student001{
	String name;
	int kor, eng, math, no;
	@Override
	public String toString() {
		return "[name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", no=" + no + "]";
	}
	
}