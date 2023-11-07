package com.company.day027;

class Const003{
	static String FIRE = "119";
	static String POLICE = "112";
	static String PHONE_BOOK;
	static {
		PHONE_BOOK = "\nFIRE STATION >"+ Const003.FIRE + 
					"\nPOLICE OFFICE >"+ Const003.POLICE; 
	}
	
	
}

public class Final003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Const003.PHONE_BOOK);
		
	}

}
