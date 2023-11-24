package com.company.day058_using5_io3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Xml004 {
	public static void main(String[] args) {
		String folder_path = "src\\com\\company\\day058_using5_io3\\";
		String file_path = "xml4.xml";
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
			bw.write("<userinfo>");
			bw.write("<item>");
			bw.write("<id>01</id>");
			bw.write("<name>aaa</name>");
			bw.write("<age>10</age>");
			bw.write("</item>");
			bw.write("<item>");
			bw.write("<id>02</id>");
			bw.write("<name>bbb</name>");
			bw.write("<age>12</age>");
			bw.write("</item>");
			bw.write("<item>");
			bw.write("<id>03</id>");
			bw.write("<name>ccc</name>");
			bw.write("<age>13</age>");
			bw.write("</item>");
			bw.write("</userinfo>");
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일읽기

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		
		try {
			builder = factory.newDocumentBuilder();
			//#1. xml 파싱
			Document doc = builder.parse(file);
			
			//#2. 최상단 - root - getDocumentElement
//			Element root = doc.getDocumentElement();
			
			//#3. 원하는 nodes  - getChildNodes
//			NodeList nodes = root.getChildNodes();
			
			NodeList items = doc.getElementsByTagName("item");
			//items -> [item, item, item]
			for(int i=0; i<items.getLength(); i++) {
				Node i1 = items.item(i);	//item[0]{<id><name><age>}
				NodeList datas = i1.getChildNodes();	//공백<id>,공백<name>,공백<age>
				
				for(int j=0; j<datas.getLength(); j++) {
					Node myData = datas.item(j);
					if(myData.getNodeType() == Node.ELEMENT_NODE) {
						String name = myData.getNodeName();
						String value = myData.getTextContent();
						if(name.equals("id")) {
							System.out.println("ID : " + value);
						}else if(name.equals("name")) {
							System.out.println("NAME : " + value);
						}else if(name.equals("age")) {
							System.out.println("AGE : " + value);
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
