package collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

public class List2_ArrayList008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<ScoreDto8> list = new ArrayList<>();
		
		list.add(new ScoreDto8("아이언맨",30,40,50));
		list.add(new ScoreDto8("헐크",40,60,70));
		list.add(new ScoreDto8("캡틴",80,90,100));
		
		System.out.println("이름\t국어\t영어\t수학\t평균");
		System.out.println("====================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		Iterator<ScoreDto8> it = list.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());
		
		}
		
		System.out.println();
		ListIterator<ScoreDto8> it2 = list.listIterator();
		
		System.out.println();
		for(ScoreDto8 item : list) {
			System.out.println(item);
		}
		
		
		
		
		
		
		
		
	}

}
