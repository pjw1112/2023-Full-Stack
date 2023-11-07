package com.company.day032;

class People015{
	public String name;
	public String ssn;
	
	public People015() {};
	
	public People015(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}

class Student015 extends People015{
	public int studentNo;
	
	public Student015(){super();  System.out.println(this.toString()); } 
	
	public Student015(String name, String ssn, int studentNo){
		super(name,ssn);
		this.studentNo = studentNo;
	}

	@Override
	public String toString() {
		return "Student015 [studentNo=" + studentNo + "]";
	}
	
	
	
}




public class Extends015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student015 student = new Student015("아이언맨", "123456-1234567", 1);
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : "+student.studentNo);
		Student015 student2 = new Student015();
		
		
	}

}
