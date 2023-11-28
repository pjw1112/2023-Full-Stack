package io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class IO004 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		// # 1. Byte
		byte[] b1 = "Java".getBytes();
		byte[] b2 = "Java".getBytes(Charset.defaultCharset());
		byte[] b3 = "Java".getBytes(Charset.forName("EUC-KR"));
		byte[] b4 = "Java".getBytes(Charset.forName("MS949"));
		byte[] b5 = "Java".getBytes("UTF-8");
		
		System.out.println(b1+"\t"+b1.length+"\t"+Arrays.toString(b1));
		System.out.println(b2+"\t"+b2.length+"\t"+Arrays.toString(b2));
		System.out.println(b3+"\t"+b3.length+"\t"+Arrays.toString(b3));
		System.out.println(b4+"\t"+b4.length+"\t"+Arrays.toString(b4));
		System.out.println(b5+"\t"+b5.length+"\t"+Arrays.toString(b5));
		
		System.out.println();
		// # 2. Char
		byte[] b6 = "자바".getBytes();
		byte[] b7 = "자바".getBytes(Charset.defaultCharset());
		byte[] b8 = "자바".getBytes(Charset.forName("EUC-KR"));
		byte[] b9 = "자바".getBytes(Charset.forName("MS949"));
		byte[] b10 = "자바".getBytes("UTF-8");
		
		System.out.println(b6+"\t"+b6.length+"\t"+Arrays.toString(b6));
		System.out.println(b7+"\t"+b7.length+"\t"+Arrays.toString(b7));
		System.out.println(b8+"\t"+b8.length+"\t"+Arrays.toString(b8));
		System.out.println(b9+"\t"+b9.length+"\t"+Arrays.toString(b9));
		System.out.println(b10+"\t"+b10.length+"\t"+Arrays.toString(b10));
		System.out.println();
		
		System.out.println(new String(b1));
		System.out.println(new String(b2 , Charset.defaultCharset()));
		System.out.println(new String(b3 , Charset.forName("EUC-KR")));
		System.out.println(new String(b4 , Charset.forName("UTF-8")));
		System.out.println(new String(b5 , "UTF-8"));
		System.out.println();
		
		System.out.println(new String(b6));
		System.out.println(new String(b7 , Charset.defaultCharset()));
		System.out.println(new String(b8 , Charset.forName("EUC-KR")));
		System.out.println(new String(b9 , Charset.forName("UTF-8")));
		System.out.println(new String(b10 , "UTF-8"));
		
		
	}

}
