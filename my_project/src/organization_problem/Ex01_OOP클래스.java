package organization_problem;

public class Ex01_OOP클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee a1 = new Coffee("까페라떼", 4000, 2);
		Coffee a2 = new Coffee();

		a1.show();
		a2.show();
	}

}

class Coffee {
	String name;
	int price;
	int num;

	Coffee(String name, int price, int num) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
		this.num = num;
	}

	Coffee() {
		this("아메리카노", 3500, 1);
	}

	void show() {
		System.out.println("===== 커피");
		System.out.println("커피 이름 : " + name);
		System.out.println("커피 가격 : " + price);
		System.out.println("커피 잔수 : " + num);
		System.out.println();
	}

}