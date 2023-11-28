package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class IO005 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// # 1. 폴더 + 파일 준비 완료!
		String folder_path = "src/io/";
		String file_path = "mytext.txt";
		
		File folder1 = new File(folder_path);
		File file1 = new File(folder_path+file_path);
		
		if(!folder1.exists()) { folder1.mkdirs(); }
		
		if(!file1.exists()) {
			try {
				file1.createNewFile();
				System.out.println("파일 준비완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("파일 준비완료");
		}
		
		// # 2. byte 단위로 파일 쓰기 - Stream
		// 파일 >> inputStream >>  [프로그램]  >> outputStream >> 파일
		OutputStream output1 = new FileOutputStream(file1);
		output1.write('1');
		output1.write('G');
		output1.write('O');
		output1.write('O');
		output1.write('D');
		output1.write('데');
		output1.write('이');
		output1.write('\n');
		output1.flush();
		output1.close();
		
		OutputStream output2 = new FileOutputStream(file1, true);
		byte[] arr = "Good 데이! 하핫\n".getBytes();
		output2.write(arr);
		output2.flush();
		output2.close();
		
		OutputStream output3 = new FileOutputStream(file1, true);
		byte[] arr2 = "하나 둘 셋 넷 다섯 여섯 일곱 여덟\n".getBytes();
		output3.write(arr2, 3, 8);
		
		output3.flush();
		output3.close();
		
		OutputStream output4 = new FileOutputStream(file1, true);
		byte[] arr3 = "\n하나 둘 셋 넷 다섯 여섯 일곱 여덟".getBytes(Charset.forName("UTF-8"));
		output4.write(arr3);
		
		output4.flush();
		output4.close();
		
		
		
		
		
		
	}

}
