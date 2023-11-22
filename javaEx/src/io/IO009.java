package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

public class IO009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path_name = "src/io/";
		String file_name = "text2";

		File folder = new File(path_name);
		File file = new File(path_name + file_name);

		folder.mkdirs();
		file.createNewFile();

		OutputStream os = new FileOutputStream(file);
		byte[] contents_w = "안녕하세요 반갑습니다 제 이름은 박진우 입니다.".getBytes(Charset.forName("UTF-8"));
		os.write(contents_w);
		os.flush();
		os.close();
		
		InputStream is = new FileInputStream(file);
		byte[] contents_r = is.readAllBytes();
		System.out.println(new String(contents_r) );
		
		
		
		
		
	}

}
