package practice;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTMLExtractor {
    public static void main(String[] args) {
        try {
            // 웹 페이지 URL을 지정합니다.
            String url = "https://www.fmkorea.com/hotdeal";

            // URL 객체 생성
            URL webpage = new URL(url);

            // HttpURLConnection을 사용하여 웹 페이지에 GET 요청을 보냅니다.
            HttpURLConnection connection = (HttpURLConnection) webpage.openConnection();
            connection.setRequestMethod("GET");

            // 응답을 읽을 BufferedReader 생성
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            StringBuilder htmlContent = new StringBuilder();

            // 응답을 한 줄씩 읽어서 StringBuilder에 추가
            while ((line = reader.readLine()) != null) {
                htmlContent.append(line);
            }

            // HTML 내용을 텍스트 파일로 저장
            String fileName = "webpage.html";
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write(htmlContent.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("HTML 내용이 " + fileName + " 파일로 저장되었습니다.");

            // 연결 및 리더 닫기
            reader.close();
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}