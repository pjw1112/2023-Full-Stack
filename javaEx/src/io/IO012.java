package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class IO012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path_name = "src/";
		String file_name = "text2";

		File folder = new File(path_name);
		File file = new File(path_name + file_name);

		folder.mkdirs();
		file.createNewFile();

		Writer writer = new FileWriter(path_name + file_name);
		writer.write("안녕하세요 반갑습니다 \n제 이름은 박진우 입니다.");
		writer.flush();
		writer.close();

		// 파일 읽기
		Reader reader = new FileReader(path_name + file_name);

		int cnt;
		while ((cnt = reader.read()) != -1) {

			System.out.print((char) cnt);

		}
		reader.close();

		System.out.println();
		// 파일 읽기2
		Reader reader2 = new FileReader(path_name + file_name);

		char[] arr = new char[1000];
		int cnt2 = reader2.read(arr);
		String str = new String(arr,0,cnt2);
		System.out.println(str);
		reader2.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
