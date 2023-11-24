package io;

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

public class Xml003moon {
	public static void main(String[] args) {
		String folder_path = "src\\com\\company\\day058_using5_io3\\";
		String file_path = "xml3.xml";
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
			bw.write("<milkid>milk01</milkid>");
			bw.write("<milkname>WHITE</milkname>");
			bw.write("<milkprice>1200</milkprice>");
			bw.write("<milkbest>★★★★★</milkbest>");
			bw.write("</milk>");
			bw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//파싱
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = null;
		
		try {
			docBuilder = factory.newDocumentBuilder();
			Document doc = docBuilder.parse(file);
			Element root = doc.getDocumentElement();
			System.out.println("1 : " + root.getNodeName());
			NodeList nodes = root.getChildNodes();
			System.out.println("2 : " + nodes.getLength());
			
			System.out.println("=========================");
			System.out.println("ID\tNAME\tPRICE\tBEST");
			System.out.println("=========================");
			
			for(int i=0; i<nodes.getLength(); i++) {
				Node child = nodes.item(i);
				if(child.getNodeType()==Node.ELEMENT_NODE) {
					System.out.print(child.getTextContent() + "\t");
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
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
