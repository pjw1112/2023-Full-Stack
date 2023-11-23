package io;

import java.io.*;

// 1. 자바 프로그램 내부의 [객체]를  [네트워크]에서 입출력 할 수 있는 포맷으로 변경
// 2. 직렬화 = [객체]를 [바이트 기반] 스트림으로 데이터를 변경
// 3. Serializable 직렬화 ( 일렬로 늘어선 바이트 데이터 )

// step 1
//class trainA implements Serializable {// Serializable 직렬화
//	
//	private static final long serialVersionUID = 1L;
//	String kan0;
//	int kan1;
//
//}

// step 2
public class IO032 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 0. 파일준비
		// # 1. 폴더 + 파일 준비 완료!
		String folder_path = "src/io/";
		String file_path = "mytext.txt";

		File folder = new File(folder_path);
		File file = new File(folder_path + file_path);

		// # 2. 폴더, 파일 준비
		if (!folder.exists()) {
			folder.mkdirs();
		}

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("파일 준비완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("파일 준비완료");
		}

		// 1. 직렬화해서 파일에 저장
		OutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		trainA train = new trainA();
		train.kan0="ABC";
		train.kan1=1010;
		
		oos.writeObject(train);
		oos.flush();
		oos.close();
		fos.close();
		
		
		
		
		
		
		
		
		
		
	}

}
