package com.company.day007;

public class A015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double year = 365.2422;
		int day, time, minute, second;
		int day_s
		, time_s, minute_s;
		second = (int)(year*24*60*60);
		System.out.println("공전 주기를 초단위로 : "+ second+"초");
		
		day = second/(24*60*60);
		day_s = second%(24*60*60);
		time = day_s /(60*60);
		time_s = day_s %(60*60);
		minute= time_s/60;
		second= time_s%60;
		System.out.println(day+"일 "+time+"시간 "+minute+"분 "+second+"초");
		
		
	}

}
