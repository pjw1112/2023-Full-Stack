package practice;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

public class EUCKRvsMS949 {

	public static void main(String[] args) throws UnsupportedEncodingException{
		// TODO Auto-generated method stub

		String test="가나다";
		
		byte[] b1 =test.getBytes("UTF-16");
		byte[] b2 =test.getBytes("UTF-8");
		System.out.println(b1.length);
		System.out.println(b2.length);
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b2, "UTF-8"));
		System.out.println();
		
		System.out.println(  Charset.defaultCharset());
		System.out.println( Charset.availableCharsets() );
				
	}

}
