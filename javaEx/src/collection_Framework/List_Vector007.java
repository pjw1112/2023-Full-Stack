package collection_Framework;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class ColorInfo6 {

	private int no, total;
	private int price;
	private String name;

	public ColorInfo6() {
		super();
	}

	public ColorInfo6(String name, int price) {
		super();
		this.price = price;
		this.name = name;
	}

	public ColorInfo6(String name, int price, int no) {
		super();
		this.no = no;
		this.price = price;
		this.name = name;
		this.total = price * no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "ColorInfo6 [no=" + no + ", price=" + price + ", name=" + name + "]";
	}

}

public class List_Vector007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ColorInfo6> mycolors = new Vector<ColorInfo6>();

		ColorInfo6[] colors = { new ColorInfo6("까페라떼", 1800, 2), new ColorInfo6("아메리카노", 1500, 3),
				new ColorInfo6("에스프레소", 2000, 1) };

		for (int i = 0; i < colors.length; i++) {
			mycolors.add(colors[i]);
		}
		System.out.println("========================================");
		System.out.println("NAME\tPRICE\tNUM\tTOTAL");
		System.out.println("========================================");
		for (int i = 0; i < mycolors.size(); i++) {

			System.out.print(mycolors.get(i).getName() + "\t");
			System.out.print(mycolors.get(i).getPrice() + "\t");
			System.out.print(mycolors.get(i).getNo() + "\t");
			System.out.println(mycolors.get(i).getTotal0() + "\t");
		}
			System.out.println();
			
			System.out.println("주문 이름을 적어주세요 >");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			
			for(int i=0;i<mycolors.size();i++) {
			if(mycolors.get(i).getName().equals(name) ) {
			
			System.out.println("========================================");
			System.out.println("NAME\tPRICE\tNUM\tTOTAL");
			System.out.println("========================================");
			break;
			}
			}
			for(int i=0;i<mycolors.size();i++) {
				if(mycolors.get(i).getName().equals(name) ) {
					System.out.print(mycolors.get(i).getName() + "\t");
					System.out.print(mycolors.get(i).getPrice() + "\t");
					System.out.print(mycolors.get(i).getNo() + "\t");
					System.out.println(mycolors.get(i).getTotal() + "\t");
				
				}
				}
			
		

	}

}
