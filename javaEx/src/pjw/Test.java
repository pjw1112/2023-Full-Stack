package pjw;

import java.io.*;



public class Test {
	public static void main(String[] args) throws IOException{
		
		InputStream is = new FileInputStream ("c:/ServiceTest.txt");
		
		File file = new File("ServiceTest2.txt");
		file.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(file,false));
		
		int count=0;
		byte[] bytearray = new byte[9];
		int cnt;
		while( ( cnt= is.read() )!=-1) {
			if(is.available()%2==1) {
				bw.write(cnt); 
			}
			 
			
			
			
		}
		
		is.close();
		
		
		
		
		
		
		bw.flush();
		bw.close();
		
		
		
		
	}

}
