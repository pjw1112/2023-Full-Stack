package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File db_folder = new File("db");

		if (!db_folder.exists()) {

			if (db_folder.mkdirs()) {
				System.out.println("db폴더 생성 성공");
			} else {
				System.out.println("db폴더 생성 실패");
			};
		}

		File newFile = new File("db/myTestText.txt");

		if (!newFile.exists()) {

			if (newFile.createNewFile()) {
				System.out.println("txt파일 생성 성공");
			} else {
				System.out.println("txt파일 생성 실패");
			};
		}

		InputStream is = new FileInputStream(newFile);

		int data;
		
		while( (data=is.read())!= -1 ) {
			System.out.println("읽은 데이터 : "+ (char)data + "남은 바이트 수 : "+ is.available());
		}
		is = new FileInputStream(newFile);
		while( (data=is.read())!= -1 ) {
			System.out.print((char)data);
		}
		
		is.close();
		
	}

}
