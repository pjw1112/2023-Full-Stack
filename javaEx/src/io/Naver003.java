package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Naver003 {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub

		String pathStr = "src/io/weather.html";
		Path path = Paths.get(pathStr);
		File file = new File(pathStr);
		file.createNewFile();

		URL url = new URL("https://www.weather.go.kr/w/rss/dfs/hr1-forecast.do?zone=1165065200");
		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

		connection.setRequestMethod("GET");
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setUseCaches(false);
		connection.setReadTimeout(20000);

		// # 5. 데이터 처리
		String result = "";
		System.out.println(connection.getResponseCode());
		if (connection.getResponseCode() == 200) {
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line = "";
			StringBuffer sb = new StringBuffer();
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			br.close();
			result = sb.toString();

		}
		connection.disconnect();
		System.out.println(result);

		// # 6. DB 처리 / XML 파일로 저장
		BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
		bw.write(result);
		bw.flush();
		bw.close();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
