package io;

import java.io.*;

// STEP 3 byte[kan0, kan1]
class trainA implements Serializable {

	private static final long serialVersionUID = 1L;
	// 시리얼 넘버만 있으면 클래스에 다른 인스턴스 변수가 일치하지 않아도 같은 클래스로 취급
	// 시리얼 넘버가 다르면 클래스 내용이 같더라도 다른 클래스로 취급해서 역직렬화 실패
	// 결론 : 조건 implements Serializable
	//		 해결 long serialVersionUID 
	
	String kan0;
	int kan1; // # 뺀 버전과, 주석 달아서 kan1

}

//STEP 4
public class JavaIOex {
	public static void main(String[] args) throws Exception{
		// 0. 파일준비
		String folder_path = "src/io/";
		String file_path = "mytext.txt";

		File folder = new File(folder_path);
		File file = new File(folder_path + file_path);
		
		InputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		trainA train = (trainA)ois.readObject();
		System.out.println("kan0 : "+train.kan0);
//		System.out.println("kan1 : "+train.kan1);
		
		
		
		
		
		

	}
}
