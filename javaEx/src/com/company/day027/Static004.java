package com.company.day027;


class StaticMobile004{
	
	static String company = "삼*";
	static String model = "Z플립";
	static String model_info;
	static {model_info = company+model; }
	
}



public class Static004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticMobile004.model_info);
	}

}
