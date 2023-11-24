package io;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xml002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// # 1. 폴더 + 파일 준비 완료!
		String folder_path = "src/io/";
		String file_path = "Xml1.xml";

		File folder1 = new File(folder_path);
		File file1 = new File(folder_path + file_path);

		// # 2. 폴더, 파일 준비
		if (!folder1.exists()) {
			folder1.mkdirs();
		}

		if (!file1.exists()) {
			try {
				file1.createNewFile();
				System.out.println("파일 준비완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("파일 준비완료");
		}
		// #1 . Xml - Dom 개체 구조 - 노드 트리 - 나무 뿌리 부터 가지까지
		// 싱글톤 : 싱글톤으로 구현한 인스턴스는 전역으로 사용 가능
		// -> 다른 클래스의 인스턴스들이 데이터를 공유하는 것이 가능
		// -> 제일 큰 목적 : [ 데이터 공유 ]
		// 기존 방식 [프로그램] -> [new 객체],[new 객체],[new 객체]
		// 싱글톤 방식 [프로그램] <- [new 객체],[new 객체],[new 객체]
		// 팩토리 패턴 - ㅋㅡㄹ래스의 인스턴스를 만드는 것을 서브클래스에게 맡기기
		// 디자인 패턴 - 이런식으로 써 봤더니 제일 편하더라~

//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder docBuilder = null;

		try {
			DocumentBuilder docBuilder =
					DocumentBuilderFactory.newInstance().newDocumentBuilder();
			
			// 1. XML 파싱
			// 2. XML ROOT 최상단 가져오기 yourinfo
			// 테스트1 : 자식 몇명
			// 테스트2 : ELEMENT_NODE / 값

			Document doc = docBuilder.parse(file1);
			Element root = doc.getDocumentElement();
			System.out.println("1-1 : " + root.getNodeName());
			NodeList nodes = root.getChildNodes();
			System.out.println("1-2 : " + nodes.getLength());
			
			for (int i = 0; i < nodes.getLength(); i++) {
			Node child = nodes.item(i);
			System.out.print(child.getTextContent());
			
			
//			if (child.getNodeType()==Node.ELEMENT_NODE) {
//				System.out.print(child.getTextContent()+"\t");
//			}
			
			
			}
			
			
			

		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
