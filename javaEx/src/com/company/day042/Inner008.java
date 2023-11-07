package com.company.day042;

class Outer008 { 
    int z=10;
   //(1)    가. (static class)정적멤버클래스 , 인스턴스클래스  여부/ 
   //       나. method area에서 사용여부  
   //       다.  new 몇번호출 ?  / 라. 사용법 답변4   
   class In008{ //내부 클래스
       int z = 30; 
       public void print() { System.out.println(z); }  //(2) z값은?30
   }
}

public class Inner008 {
  public static void main(String[] args) {
      //(3) 사용법은?
	  Outer008 myout = new Outer008();
	  System.out.println(myout.z);
	  Outer008.In008 myin = myout.new In008();
	  System.out.println(myin.z);
	  myin.print();
	  
	  
  }
}