package Json_Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Json005_Naver_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clinetID = "9vGnJWj0aCnn1_zIkvLQ";
		String ClientSecret = "iagU143APj";
		String urlPath = "https://openapi.naver.com/v1/search/book.json";
		String result = "";
		// #1. URL
		try {
			urlPath += "?query=" + URLEncoder.encode("자바", "UTF-8");
			URL url = new URL(urlPath);

			// #2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			// #3. 옵션 사항
			conn.setRequestMethod("GET");
			conn.addRequestProperty("X-Naver-Client-Id", clinetID);
			conn.addRequestProperty("X-Naver-Client-Secret", ClientSecret);
			// #4. 데이터 접속 성공시
			if (conn.getResponseCode() == 200) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				StringBuffer sb = new StringBuffer();
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");

				}
				br.close();
				result = sb.toString();

			}
			conn.disconnect();
//		System.out.println(result);

			// #5. 파싱
			JsonParser jparser = new JsonParser();
			JsonObject jobj = (JsonObject) jparser.parse(result);

			JsonArray arr = (JsonArray) jobj.get("items");

			for (int i = 0; i < arr.size(); i++) {
				JsonObject data = (JsonObject)arr.get(i);

				String title = data.get("title").getAsString();
				String description = data.get("description").getAsString();
				System.out.println("=======================");
				System.out.println("Title : " + title);
				System.out.println("Desc : " + description);

			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*
 * 9vGnJWj0aCnn1_zIkvLQ iagU143APj
 * 
 * https://openapi.naver.com/v1/search/book.json
 * 
 * GET
 * 
 * 필수파라미터 쿼리 확인할 것
 */