package pjw;

import java.io.FileWriter;
import java.io.IOException;


public class Json_test {
    public static void main(String[] args) {
        String csvFileName = "data.csv";

        try (FileWriter writer = new FileWriter(csvFileName)) {
            // CSV 헤더 작성
            writer.append("이름,나이,이메일\n");

            // CSV 데이터 작성
            writer.append("John,30,john@example.com\n");
            writer.append("Alice,25,alice@example.com\n");
            writer.append("Bob,35,bob@example.com\n");

            System.out.println("CSV 파일이 생성되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
