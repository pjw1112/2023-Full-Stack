package com.company.day038_interface;



interface GPS012{ void search(String destination); }

public class Interface012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GPS012 mygps = desti -> {System.out.println(desti);}; 
		mygps.search("서울");
		Motocycle010 motorcycle = new Motocycle010();
		
		Vehicle011 mymotor = motorcycle;
		GPS012 gps = motorcycle;
		
		mymotor.start();
		((Motocycle010)mymotor).search("강남역");
		
		System.out.println();
		System.out.println();
		
		((Motocycle010)gps).start();
	}

}
