package com.company.day031;

class User {
	private String name;
	private String id;

	public User() {
		super();
	}

	public User(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	void show() {
		System.out.println(name + "\t" + id + "\t");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	};

}

class Score_v1 extends User {

	private int java, jsp, mysql;

	void input(String name, String id, int java, int jsp, int mysql) {
		setName(name);
		setId(id);
		setJava(java);
		setJsp(jsp);
		setMysql(mysql);
	}

	void show() {
		System.out.println(getName() + "\n" + getId() + "\n" + getJava() + "\n" + getJsp() + "\n" + getMysql());

	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getMysql() {
		return mysql;
	}

	public void setMysql(int mysql) {
		this.mysql = mysql;
	}

}

//이하 단순 노가다 생략






public class Extends008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
