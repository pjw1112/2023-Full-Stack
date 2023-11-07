package com.company.day035;

class Person010{}
class Father010 extends Person010{}
class Uncle010 extends Person010{}
class Cousin010 extends Uncle010{}
class Me010 extends Father010{}

public class Polymorphism010 {
 public static void main(String[] args) {
	 Person010 person = new Uncle010();
	 Cousin010 cousin = new Cousin010();
	 Me010 me = new Me010();
	 
//	 person = (Person010)me; 
//	 person = me;
	 Uncle010 uncle = (Uncle010)person; // 위의 두 줄을 주석 처리하면 이상 없음, 주석 처리 안하면 클래스 캐스트 익센션
	 Father010 father = me;
	 //cousin = (Cousin010)person; 클래스 캐스트 익셉션
	 Uncle010 uncle2 = cousin;
	 System.out.println("완료");
 }
}
//