package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class MilkDto026 {
	public static int count = 0;
	private int mno;
	private String mname;
	private int mprice;

	public MilkDto026() {
		super();
	}

	public MilkDto026(int mno, String mname, int mprice) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mprice = mprice;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MilkDto026.count = count;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMprice() {
		return mprice;
	}

	public void setMprice(int mprice) {
		this.mprice = mprice;
	}

	@Override
	public String toString() {
		return "MilkDto026 [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}

}

public class IO026 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String folder_path = "src/dbdbig/part3/using4_io_etc";
		String file_path = "file014.txt";
		String file = folder_path + file_path;
		new File(folder_path).mkdirs();
		new File(folder_path + file_path).createNewFile();

		System.out.println("001. FOLDER + FILE 준비 완료\n\n");

		// 2. 파일 읽기
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

		StringBuffer sb = new StringBuffer();
		
		String line = "";
		while ((line = br.readLine()) != null) {
			sb.append(line + "\n");
		}
		System.out.println(sb.toString());
		br.close();

		// 3. 파일 검색
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n원하는 우유의 이름을 입력하시오.");
		String answer = scanner.next();
		String[] datas = sb.toString().split("\n");

		MilkDto026 result = null;
		boolean find = false;
		int cnt = 0;
		for (String d : datas) {
			if (++cnt > 3) {
				String[] milk = d.split(",");
				if (milk[1].equals(answer)) {
					result = new MilkDto026(Integer.parseInt(milk[0]), milk[1], Integer.parseInt(milk[2]));
					find = true;
					break;

				}// end if
			}// end if
		}// end for

		System.out.println(find?result:"다시 검색해주세요");
		
		// 3. 파일 검색

	}

}
