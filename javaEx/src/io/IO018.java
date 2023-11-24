package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class IO018 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String folder_path = "src/dbdbig/part3/using4_io_etc";
		String file_path = "file014.txt";
		String network = folder_path + file_path;

		// #1. 폴더 + 파일 만들기
		new File(folder_path).mkdirs();
		File file = new File(folder_path + file_path);
		file.createNewFile();
		File outfile = new File(folder_path + "file018.txt");
		outfile.createNewFile();
		
		// #2. 보조스트림 이용
		// BufferedWriter (속도향상) - OutputStreamWriter (단어) - FileOutputStream
		// file014.txt 읽어와서 >> file018.txt 에 적기

		Writer wr = new FileWriter(file);
		String contents ="안녕하세요 반갑습니다 박진우 입니다 \nHi nice to meet you Im jin";
		wr.write(contents);
		wr.flush();
		wr.close();

		InputStream is = new FileInputStream(file);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outfile)));
		
		int cnt;
		while ((cnt = is.read()) != -1) {
			bw.write((char) cnt);
			
		}

		bw.flush();
		bw.close();

		// #3. 보조스트림 이용 - InputStream
		long start = 0, end = 0;
		start = System.nanoTime();
		InputStream istest = new FileInputStream("src/io/chewon.jpg");
		int test1;
		while ((test1 = istest.read()) != -1) {
			bw.write((char) test1);
		}
		istest.close();
		end = System.nanoTime();
		System.out.println("BufferedReader 사용 안했을 때 : " + (end - start));

		// #4. 보조스트림 이용 - BuStream
		start = System.nanoTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		StringBuffer sb = new StringBuffer();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line + "\n");
		}

		end = System.nanoTime();
		System.out.println("BufferedReader 사용 했을 때 : " + (end - start));

	}

}
