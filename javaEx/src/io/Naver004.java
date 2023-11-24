package io;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Naver004 {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub

		URL url = new URL("https://www.weather.go.kr/w/rss/dfs/hr1-forecast.do?zone=1165065200");
		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setUseCaches(false);
		connection.setReadTimeout(20000);

		System.out.println(connection.getResponseCode());

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		builder = factory.newDocumentBuilder();
		Document doc = builder.parse(connection.getInputStream());
//		Element root  = doc.getDocumentElement();
//		NodeList nodes = root.getChildNodes();
		NodeList title = doc.getElementsByTagName("title");
		for (int i = 0; i < title.getLength(); i++) {
			System.out.println(title.item(i).getTextContent());
		}

		NodeList datas = doc.getElementsByTagName("data");
		for (int i = 0; i < datas.getLength(); i++) {
			NodeList child = datas.item(i).getChildNodes();
			for (int j = 0; j < child.getLength(); j++) {
				Node data = child.item(j);
				if (data.getNodeType() == Node.ELEMENT_NODE) {
					String name = data.getNodeName();
					String value = data.getTextContent();
					if (name.equals("hour")) {
						System.out.println("hour : " + value);
					} else if (name.equals("temp")) {
						System.out.println("temp : " + value);
					} else if (name.equals("wfKor")) {
						System.out.println("wfKor : " + value);
					}

				}

			}
			System.out.println("================");

		}

//		for(int i=0; i<items.getLength(); i++) {
//			Node item = items.item(i);
//			NodeList datas = item.getChildNodes();
//			
//			for(int j=0; j<datas.getLength(); j++) {
//				Node myData = datas.item(j);
//				if(myData.getNodeType() == Node.ELEMENT_NODE) {
//					String name = myData.getNodeName();
//					String value = myData.getTextContent();
//					if(name.equals("milkid")) {
//						System.out.println("MILK-ID : " + value);
//					}else if(name.equals("milkname")) {
//						System.out.println("MILK-NAME : " + value);
//					}else if(name.equals("milkprice")) {
//						System.out.println("MILK-PRICE : " + value);
//					}else if(name.equals("milkbest")) {
//						System.out.println("MILK-BEST : " + value);
//					}
//				}
//			}
//		}

	}

}
