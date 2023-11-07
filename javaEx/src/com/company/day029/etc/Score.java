package com.company.day029.etc;

public class Score {//DTO

	private String[] users;
	private String name;
	private String pass;
	private int kor;
	private int math;
	private int eng;
	private String avg;
	
	
	public Score() {
		super();
	}


	public Score( String name, int kor, int math, int eng) {
		super();
		this.users = new String[9];
		this.name = name;
		
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		
		
	}


	public String[] getUsers() {
		return users;
	}


	public void setUsers(String[] users) {
		this.users = users;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public String getAvg() {
		return avg;
	}


	public void setAvg(String avg) {
		this.avg = avg;
	}
	
	
	
	
	
	
}
