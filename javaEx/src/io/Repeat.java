package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.naming.spi.DirStateFactory.Result;

public class Repeat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String url_path = "https://www.google.com";
		URL url = new URL(url_path);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setUseCaches(false);
		conn.setReadTimeout(20000);
		conn.setRequestMethod("GET");

		// 데이터 처리
		if (conn.getResponseCode() == 200) {
			StringBuffer sb = new StringBuffer();
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = "";
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
				br.close();
				String Result = sb.toString();
			}
		}
		conn.disconnect();

		Path path = Paths.get("src/io/mytext.txt");
		BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);

	}

}
