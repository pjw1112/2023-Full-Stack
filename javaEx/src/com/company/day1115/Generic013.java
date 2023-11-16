package com.company.day1115;

import java.util.Vector;

class UserInfo {
	private String name;
	private int age;

	public UserInfo() {
		super();
	}

	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public UserInfo(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Generic013 {
	public static void main(String[] args) {
		UserInfo[] arr = new UserInfo[] { new UserInfo("아이언맨", 50), new UserInfo("헐크", 40), new UserInfo("캡틴", 120), };

		Vector<UserInfo> user = new Vector<>();
		
		for(UserInfo item : arr) {
			 user.add(item);
		}
		
		for (int i = 0; i < user.size(); i++) {
			System.out.println("USER"+i+" : "+ user.get(i).getName()+"/"+user.get(i).getAge());
		}
		
		
		
		
		
	}
}
