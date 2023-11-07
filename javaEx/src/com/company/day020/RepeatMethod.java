package com.company.day020;

import java.util.Scanner;

public class RepeatMethod {  
	
	public static void main(String[] args) {
		/////////////////////(1)  변수
		String name  = ""; 
		int kor, eng, math, total ;
		float avg = 0.0f; 
		String pass = "";
		String jang = "";
		String star= ""; 
		String level_kor="" , level_eng="" , level_math="";
		String re = ""; 
		
		/////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
		/*
		System.out.println("이름입력 > ");  name = scanner.next();
		System.out.println("국어입력 > ");   kor = scanner.nextInt();
		System.out.println("영어입력 > ");   eng = scanner.nextInt();
		System.out.println("수학입력 > ");  math = scanner.nextInt();
		*/
		System.out.println("이름입력 > ");  name = inputName();
		System.out.println("국어입력 > ");   kor = inputNum();
		System.out.println("영어입력 > ");   eng = inputNum();
		System.out.println("수학입력 > ");  math = inputNum();
		
		/////////////////////(3) 처리 : 
		total = process_total(kor , eng, math); 
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		
		avg = process_avg(total); 
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		//////// 합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
		
		pass = process_pass(avg , kor, eng, math);  
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		
		//////// 평균이 95점이상이면 장학생
		jang = process_scholar(  avg  );
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		
		
		//////// 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
		star = process_star(avg);
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		  
		level_kor     = process_level( kor );    
		level_eng     = process_level( eng );
		level_math    = process_level( math );
		 //public static 리턴값 메서드명(파라미터){ 해야할일 } 
		
		re = process_re( kor ,  eng , math );  
		//public static 리턴값 메서드명(파라미터){ 해야할일 } 
		 
		/////////////////////(4) 출력 : 
		/*
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
		이름		국어	영어	수학	총점  평균	 합격여부	장학생	랭킹
		--------------------------------------------------------------------------------------------
		아이언맨	100	100	100	300    100.0	 합격		장학생	**********
		--------------------------------------------------------------------------------------------
				수	수	수
		--------------------------------------------------------------------------------------------
		재시험	-	-	-
		--------------------------------------------------------------------------------------------		
		 */
		line1();   
		process_show(name, kor, eng, math, total, avg, pass, jang, star);
		line2();     
		process_show2(level_kor ,level_eng , level_math );   
		line2();    
		process_show3(re );    
		line2();    
		
	}// end main
	
	public static int inputNum(){ 
		Scanner scanner = new Scanner(System.in); 
		return scanner.nextInt();
	}  
	public static String inputName(){ 
		Scanner scanner = new Scanner(System.in); 
		return scanner.next();
	} 
	
	static int process_total(int kor,int eng,int math){
		return kor+eng+math;
	}
	
	static float process_avg(int total) {
		 
		return Float.parseFloat(String.format("%.2f", total/3.0));
	}
	
	static String process_pass(float avg , int kor, int eng, int math) {
		
		String str="";
		if(avg>=60 && kor>=40 && eng>=40 && math >=40) {
			str="합격";
		}else {
			str="불합격";
		}
		
		return str;
		
	}
	
	static String process_scholar(float  avg  ) {
		String str="";
	 if(avg>95) {
			str="장학생";
		}else {
			str=" ";
		}
	 return str;
	}
	
	static String process_star(float avg) {
		String str=" ";
		
		for(int i=0; i<avg/10;i++) {
			str+="★";
		}
		return str;
		
	}
	
	static String process_level( int num ) {
		String str="";
		
		if(num>=90) {
			str="수";
		}else if(90 > num && num>=80) {
			str="우";
		}else if(80 > num && num>=70) {
			str="미";
		}
		else if(70 > num && num>=60) {
			str="양";
		}else if(60 > num ) {
			str="가";
		}
		
		
		return str;
	}
	
	static String process_re( int kor , int eng , int math ) {
		String str="\t";
		if(kor<=40 ) {
			str+="O\t";
		}else {
			str+="-\t";
		}
		
		if(eng<=40 ) {
			str+="O\t";
		}else {
			str+="-\t";
		}
		
		if(math<=40 ) {
			str+="O\t";
		}else {
			str+="-\t";
		}
		
		
		return str;
	}
	
	
	
	static void line1() {
		System.out.println("=====================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("---------------------------------------------------------------------");
	}
	
	static void line2() {
		System.out.println("---------------------------------------------------------------------");
	}
	
	static void process_show(String name,int kor,int eng,int math,int total,float avg, String pass,String  jang,String  star){
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+pass+"\t"+jang+"\t"+star);
	}
	
	static void process_show2(String level_kor ,String level_eng ,String level_math ) {
		System.out.println("\t"+level_kor+"\t"+level_eng+"\t"+level_math);
		
	}
	static void process_show3(String re ) {
		System.out.println(re);
	}
}// end class


