package io;

import java.io.*;
import java.util.Iterator;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Xml003 {

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub

//		File xml1 = new File("src/io/Xml1.xml");
//
//		if (xml1.exists()) {
//
//			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(xml1)));
//			String line;
//			new File("src/io/Xml2.xml").createNewFile();
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/io/Xml2.xml")));
//
//			while ((line = br.readLine()) != null) {
//
//				bw.write(line);
//				
//			}
//			bw.flush();
//			bw.close();
//			br.close();
//		}
		// # 1. xml 파싱 - documnet - parse
		// # 2. 최상단 - root -getDocumnetElement
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = builder.parse("src/io/xml5.xml");
				
		NodeList datas = doc.getElementsByTagName("item");
		
		for (int i = 0; i < datas.getLength(); i++) {
			Node item = datas.item(i);
			System.out.println("Tagname : "+item.getNodeName()+" / hasChildNode ? : "+item.hasChildNodes()+" / length : "+item.getChildNodes().getLength());
			
			NodeList item2 =  item.getChildNodes();
			for (int j = 0; j < item2.getLength(); j++) {
				if(!item2.item(j).getNodeName().trim().equals("#text")) {
			 System.out.println("	TagName : "+item2.item(j).getNodeName()+"\tTagValue : "+item2.item(j).getTextContent());
				}
				}
			
			
			
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
