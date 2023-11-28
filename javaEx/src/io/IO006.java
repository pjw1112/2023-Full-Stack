package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IO006 {

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
								
				String question = "";
				String answer = "GOOD데이";
				char[] arr = answer.toCharArray();
				
				for(int i=0;i<arr.length;i++) {
					int random = (int)(Math.random()*answer.length());
					char temp = arr[i];
					arr[i] = arr[random];
					arr[random] = temp;
					
				}
				
				question = new String(arr);
				
				OutputStream os = new FileOutputStream(file1);
				byte[] info1 = "문제>".getBytes();
				byte[] question1 = question.getBytes();
				byte[] info2 = "답안>".getBytes();
				byte[] answer2 = answer.getBytes();
				
				os.write(info1);
				os.write(question1);
				os.write('\n');os.write('\n');
				os.write(info2);
				os.write(answer2);
				os.flush();
				os.close();
				
	}

}
