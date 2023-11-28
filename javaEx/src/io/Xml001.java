package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class Xml001 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		// java xml 파일 만들고 읽어 들이기

		// # 1. 폴더 + 파일 준비 완료!
		String folder_path = "src/io/";
		String file_path = "Xml1.xml";
		
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

		// # 1. 파일 쓰기
		Path path = Paths.get(folder_path + file_path );
		BufferedWriter bw; 
		try {
			bw = Files.newBufferedWriter( path , StandardCharsets.UTF_8);
			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			bw.write("\n<yourinfo>");
			bw.write("\n<name>박진우</name>");
			bw.write("\n<age>37old</age>");
			bw.write("\n</yourinfo>");
			bw.flush();
			bw.close();
			JOptionPane.showMessageDialog(null, "파일쓰기 성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "파일쓰기 실패");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end main

}// end class
