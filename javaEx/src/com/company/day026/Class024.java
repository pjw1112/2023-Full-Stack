package com.company.day026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Class024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Coffee024 a1 = new Coffee024();
		boolean bool = true;
		while(bool) {
			
			System.out.println("진우커피집에 오신것을 환영합니다.");
			a1.menuShow();
			System.out.println("1. 주문		2.메뉴 추가		3.나가기");
			System.out.println("입력 >>");
			int num=sc.nextInt();
			
			switch(num) {
			
			case 1: a1.order(); break;
			case 2:  break;
			case 3:  break;
			
			}
			
		}
			
		
	}
}

class Coffee024 {
	Scanner sc = new Scanner(System.in);
	int num;
	Map<String, Integer> CoffeeList = new HashMap<>();
   
	Coffee024() {
		 CoffeeList.put("아메리카노", 1500);
		 CoffeeList.put("카페라떼", 2500);
		 CoffeeList.put("카푸치노", 3500);
		 num=0;
		}
	
	Coffee024(String name, int num) {
		this();
		if(CoffeeList.containsKey(name)) {
			this.num=num;
		}else {
			
			System.out.println("기존에 없는 커피종류 입니다. 추가하기 위해 가격을 입력해주세요 >");
			int price = sc.nextInt();
			CoffeeList.put(name, price);
		}
		
		
		
	}
	
	
	
	void menuShow() {
		for(Map.Entry<String, Integer> entry : CoffeeList.entrySet()) {
			String key = entry.getKey();
            int val = entry.getValue();
            System.out.println("키: " + key + ", 값: " + val);
		}
		
	}
	
	void order() {
		System.out.println("주문하실 커피 종류는 무엇입니까? >");
		String orderName = sc.next();
		if(CoffeeList.containsKey(orderName)) {
			System.out.println("몇 잔 주문하시겠습니까");
			num=sc.nextInt();
			System.out.println();
			System.out.println("주문하신 커피 나왔습니다.");
			System.out.println("커피 : "+orderName+"\t잔 수 : "+num+"총 가격 : "+CoffeeList.get(orderName)*num );
			System.out.println("감사합니다.");
			System.out.println();
		}else {
			System.out.println("해당 메뉴가 없습니다. 다시 확인해주세요.");
		}
		
	}
	
	void input() {
		
		System.out.println("::추가할 커피 이름 입력 >");
		String addname = sc.next();
		System.out.println("::가격 입력 >");
		int addprice = sc.nextInt();
		if(CoffeeList.containsKey(addname)) {
		CoffeeList.put(addname, addprice);
		
	}
	}
//	void show() {
//		System.out.println("===== 커피");
//		System.out.println("커피 이름 : " + name);
//		System.out.println("커피 잔수 : " + num);
//		System.out.println("커피 가격 : " + price * num);
//		System.out.println();
//	}

}