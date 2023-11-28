package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.net.ssl.HttpsURLConnection;

public class Xml006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Network

		try {
			// # 1. URL ( uniform resource locator ) 객체 생성 - https://www.naver.com
			URL url = new URL("https://www.google.com");

			// # 2. HttpURLConnection
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

			// # 3. 요청 메서드 설정
			// # 4. 요청 헤더
			conn.setRequestMethod("GET"); // GET, POST
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setUseCaches(false);
			conn.setReadTimeout(20000);

			// # 5. 데이터 처리
			String result = "";
			System.out.println(conn.getResponseCode());
			if (conn.getResponseCode() == 200) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
				String line ="";
				StringBuffer sb = new StringBuffer();
				while ((line=br.readLine())!= null) {
					sb.append(line+"\n");
				}
				br.close();
				result = sb.toString();
				
				
			}
			conn.disconnect();
			System.out.println(result);
			
			
			// # 6. DB 처리 / XML 파일로 저장

			File file = new File("src/io/google.html");
			file.createNewFile();
			Path path = Paths.get("src/io/google.html");
			
			BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
			bw.write(result);
			bw.flush();
			bw.close();
			
			
			
			
			
			
			
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
