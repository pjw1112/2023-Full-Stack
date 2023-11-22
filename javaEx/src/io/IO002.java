package io;

import java.io.File;
import java.io.IOException;

public class IO002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String folder_url = "src/io/";
		String file_name = "mytext.txt";
		
		File folder1 = new File(folder_url);
		File file1 = new File(folder_url+file_name);
		
		if(!folder1.exists()) {
			folder1.mkdirs();
		}
		
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
