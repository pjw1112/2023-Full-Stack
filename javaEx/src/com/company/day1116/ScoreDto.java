package com.company.day1116;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

class ScoreDto8 {
	private String name;
	private int kor, eng, mat, aver;

	public ScoreDto8() {
		super();
	}

	public ScoreDto8(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		aver = (kor + eng + mat) / 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getAver() {
		return aver;
	}

	public void setAver(int aver) {
		this.aver = aver;
	}

	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + aver;
	}

}

public class ScoreDto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ScoreDto8> list = new ArrayList<>();

		list.add(new ScoreDto8("아이언맨", 30, 40, 50));
		list.add(new ScoreDto8("헐크", 40, 60, 70));
		list.add(new ScoreDto8("캡틴", 80, 90, 100));

		System.out.println("이름\t국어\t영어\t수학\t평균");
		System.out.println("====================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println();

		Iterator<ScoreDto8> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

		ListIterator<ScoreDto8> it2 = list.listIterator();

		System.out.println();
		for (ScoreDto8 item : list) {
			System.out.println(item);
		}

		System.out.println();
		System.out.println("해쉬셋을 이용한 출력");
		Set<ScoreDto8> list2 = new HashSet<>();
		list2.addAll(list);

		for (ScoreDto8 item : list2) {
			System.err.println(item);
		}

		int i = 0;
		Map<String, Integer> mymap = new HashMap<>();
		for (ScoreDto8 item : list) {
			mymap.put(item.getName(), i);
			i++;
		}

		Iterator<String> strlist = mymap.keySet().iterator();

		System.out.println();
		System.out.println("해쉬맵을 이용한 출력");
		while (strlist.hasNext()) {
			String string = (String) strlist.next();

			System.out.println(string + "\t" + list.get(mymap.get(string)).getKor() + "\t"
					+ list.get(mymap.get(string)).getEng() + "\t" + list.get(mymap.get(string)).getMat() + "\t"
					+ list.get(mymap.get(string)).getAver());

		}

	}

}
