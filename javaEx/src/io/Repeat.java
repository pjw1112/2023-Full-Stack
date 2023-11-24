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
import java.time.LocalDate;
import java.util.Date;

public class Repeat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("src/io/text3");
		file.createNewFile();
		if (file.exists()) {
			Writer wr = new FileWriter(file);
			wr.write("Apple\nBanana\nCoconut\nWatermelon");
			wr.flush();
			wr.close();
			System.out.println("파일쓰기완료");
		}

		LocalDate date = LocalDate.now();
		File file2 = new File("src/io/text_" + date + ".txt");
		new File("src/io/").mkdir();
		file2.createNewFile();

		InputStream is = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));

		int cnt;
		
		while ((cnt = is.read()) != -1) {
			bw.write(cnt);
		}
		bw.flush();
		bw.close();
		is.close();
		
		
		
//		while ((cnt = br.read()) != -1) {
//			bw.write(cnt);
//		}
//		bw.flush();
//		bw.close();
//		br.close();
		
		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
		StringBuffer sb = new StringBuffer();
		String line;
		while ((line = br2.readLine()) != null) {
			sb.append(line+"\n");

		}
		br2.close();
		System.out.println(sb);
	}

}
