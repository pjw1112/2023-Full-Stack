package com.company.day027;

class User002{
	final String nation = "korea";
	final String jumin;
		  String name;
	public User002() {this.jumin="";}
	public User002(String jumin, String name) {
		this.jumin=jumin;
		this.name=name;
	}
	@Override
	public String toString() {
		return "User002 [nation=" + nation + ", jumin=" + jumin + ", name=" + name + "]";
	}
	
	
}





public class Final002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User002 user1 = new User002("123456-1234567","아이유");
		System.out.println(user1);
		//user1.nation = "USA";  				//상수변경불가	
		//user1.jumin = "123123-1234321";		//상수변경불가
		user1.name = "IU";
		System.out.println(user1);
		
		
	}

}
