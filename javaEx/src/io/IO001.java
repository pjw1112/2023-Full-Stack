package io;

import java.io.File;
import java.io.IOException;

public class IO001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #1. 절대경로, 상대경로
		System.out.println("001. 절대경로, 상대경로");
		
		File src1 = new File("c:/myfolder/mytxt.txt");
		File src2 = new File("mytxt2.txt");
		System.out.println("File exists? : "+src1.exists());
		System.out.println("File exists? : "+src2.exists());
		
		
		
		// #2. 폴더 - 절대경로
		// 폴더 만들기 - mkdir , 파일 만들기 - createNewFile
		String folderSTR ="c:/myfolder/";
		String fileSTR = "mytxt.txt";
		
		File folder =new File(folderSTR);
		File file = new File( folderSTR+fileSTR);
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("파일생성완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("파일 못 만듬");
			}
		}
		
		
		// #3. 폴더 - 상대경로
		File myfile = new File("src/io/abs");
		File myfile2 = new File("src/io/abs/mytxt.txt");
			myfile.mkdirs();
			try {
				myfile2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		
	}

}
