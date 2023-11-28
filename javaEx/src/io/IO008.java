package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class IO008 {

	public static void main(String[] args) throws IOException {
		
		// # 1. 폴더 + 파일 준비 완료!
		String folder_path = "src/io/";
		String file_path = "mytext.txt";

		File folder1 = new File(folder_path);
		File file1 = new File(folder_path + file_path);

		// # 2. 폴더, 파일 준비
		if (!folder1.exists()) {
			folder1.mkdirs();
		}

		if (!file1.exists()) {
			try {
				file1.createNewFile();
				System.out.println("파일 준비완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("파일 준비완료");
		}

		
		
		
		// # 3. 파일 읽어들이기
		InputStream is = new FileInputStream(file1);
		
		int cnt = 0;
		while((cnt=is.read()) != -1) {
			System.out.println((char)cnt + "-byte"+ is.available());
		}
		
		is.close();
		
		InputStream is2 = new FileInputStream(file1);
		byte[] arr2 = is2.readAllBytes();
				
		String str2 = new String(arr2, 0, arr2.length , Charset.forName("UTF-8"));
		is2.close();
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
