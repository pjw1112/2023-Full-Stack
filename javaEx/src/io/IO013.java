package io;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


public class IO013 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String origin = "src/io/chewon.jpg";
		String target1 = "src/io/chewon2.jpg";
		String target2 = "src/io/chewon3.jpg";

		// #1. STEP 1 byte (모든 데이터)
		InputStream fis = new FileInputStream(origin);
		OutputStream fos = new FileOutputStream(target1);
		
		int cnt;
		while ((cnt=fis.read())!=-1) {
			fos.write((byte)cnt);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("이미지 복사 완료!");
		
		// #2. STEP 2 char (문자 전용)
		Reader fr = new FileReader(origin);
		Writer fw = new FileWriter(target2);
		
		int cnt2;
		while ((cnt2=fr.read())!=-1) {
			fw.write((byte)cnt);
		}
		
		
		
	}

}
