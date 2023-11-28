package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class IO014 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String folder_path = "src/dbdbig/part3/using4_io_etc";
		String file_path = "file014.txt";

		new File(folder_path).mkdirs();
		new File(folder_path + file_path).createNewFile();

		System.out.println("001. FOLDER + FILE 준비 완료\n\n");

		System.out.println("002. 파일 쓰기");

		Writer writer = new FileWriter(folder_path + file_path);
		Scanner scanner = new Scanner(System.in);

		String yesOrNo = "";
		while (!yesOrNo.equals("y")) {
			System.out.print("이메일을 적으세요 > ");
			writer.write(scanner.next() + "\n");
			System.out.print("입력을 마무리 하시겠습니까? (y/n) > ");
			yesOrNo = scanner.next().trim().toLowerCase();

		}
		System.out.println("명단 작성이 완료되었습니다.");
		writer.flush();
		writer.close();

		System.out.println("\n003. 파일 읽기");

		Reader reader = new FileReader(folder_path + file_path);
		int cnt;
		while ((cnt = reader.read()) != -1) {
			System.out.print((char) cnt);
		}
		reader.close();

	}

}
