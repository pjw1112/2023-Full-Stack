package com.company.day058_using5_io3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xml005 {
	public static void main(String[] args) {
		String folder_path = "src\\com\\company\\day058_using5_io3\\";
		String file_path = "xml5.xml";
		File folder = new File(folder_path);
		File file = new File(folder_path + file_path);
		
		try {
			if(!folder.exists()) {
				folder.mkdir();
			}
			if(!file.exists()) {
				file.createNewFile();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		Path path = Paths.get(folder_path + file_path);
		BufferedWriter bw;
		
		try {
			bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
			bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			bw.write("<milk>");
			bw.write("<item>");
			bw.write("<milkid>milk01</milkid>");
			bw.write("<milkname>WHITE</milkname>");
			bw.write("<milkprice>1200</milkprice>");
			bw.write("<milkbest>★★★★★</milkbest>");
			bw.write("</item>");
			bw.write("<item>");
			bw.write("<milkid>milk02</milkid>");
			bw.write("<milkname>CHOCO</milkname>");
			bw.write("<milkprice>1300</milkprice>");
			bw.write("<milkbest>★★★★</milkbest>");
			bw.write("</item>");
			bw.write("<item>");
			bw.write("<milkid>milk03</milkid>");
			bw.write("<milkname>BANANA</milkname>");
			bw.write("<milkprice>1500</milkprice>");
			bw.write("<milkbest>★★★</milkbest>");
			bw.write("</item>");
			bw.write("</milk>");
			bw.close();
			JOptionPane.showConfirmDialog(null, "파일 쓰기 성공!");
			
		} catch (IOException e) {
			JOptionPane.showConfirmDialog(null, "파일 쓰기 실패!");
		}
		
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
//			Element root  = doc.getDocumentElement();
//			NodeList nodes = root.getChildNodes();
			NodeList items = doc.getElementsByTagName("item");
			
			for(int i=0; i<items.getLength(); i++) {
				Node item = items.item(i);
				NodeList datas = item.getChildNodes();
				
				for(int j=0; j<datas.getLength(); j++) {
					Node myData = datas.item(j);
					if(myData.getNodeType() == Node.ELEMENT_NODE) {
						String name = myData.getNodeName();
						String value = myData.getTextContent();
						if(name.equals("milkid")) {
							System.out.println("MILK-ID : " + value);
						}else if(name.equals("milkname")) {
							System.out.println("MILK-NAME : " + value);
						}else if(name.equals("milkprice")) {
							System.out.println("MILK-PRICE : " + value);
						}else if(name.equals("milkbest")) {
							System.out.println("MILK-BEST : " + value);
						}
					}
				}
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
