package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class IO011 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println();

		String path_name = "src/"; //폴더 경로
		String file_name = "text2"; //파일 이름

		new File(path_name).mkdir(); //폴더 생성
		new File(path_name + file_name).createNewFile(); // 해당 폴더 경로에 파일 생성

		//Writer - Outputstream 과는 다르게 문자열 출력에 특화
		//stream 이 들어가면 byte 단위, Reader/Writer는 char 단위
		Writer writer = new FileWriter(path_name + file_name); 
		char[] data = "GOOD day~ man\n".toCharArray();
		System.out.println(Arrays.toString(data));
		writer.write(data);
		writer.flush();
		writer.close();

		Writer writer2 = new FileWriter(path_name + file_name);
		char[] data2 = "굳데이코만도~\n".toCharArray();
		System.out.println(Arrays.toString(data2));
		writer2.write(data2, 0, 2);
		writer2.flush();
		writer2.close();

	}

}
