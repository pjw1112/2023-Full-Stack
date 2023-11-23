package io;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Calendar;


public class IO003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate currentDate = LocalDate.now(); //현재 날짜 문자열
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.get(5));
		System.out.println(currentDate);
		
		String folder_url = "src/dbdbig/part003/using004/";
		String file_name = "file002_"+currentDate+".txt";
		
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
		
		System.out.println(file1.getAbsolutePath());
		
		
		
		
		
	}

}
