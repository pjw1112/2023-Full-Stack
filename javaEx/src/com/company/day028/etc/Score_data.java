package com.company.day028.etc;

public class Score_data {

	private String user = "";
	private int kor = 0;
	private int eng = 0;
	private int mat = 0;

	public Score_data() {
		super();
	}

	public Score_data(String user) {
		super();
		this.user = user;
	}

	public Score_data(String user, int kor) {
		super();
		this.user = user;
		this.kor = kor;
	}

	public Score_data(String user, int kor, int eng) {
		super();
		this.user = user;
		this.kor = kor;
		this.eng = eng;
	}

	public Score_data(String user, int kor, int eng, int mat) {
		super();
		this.user = user;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "Score_data [user=" + user + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}

	
	
}
