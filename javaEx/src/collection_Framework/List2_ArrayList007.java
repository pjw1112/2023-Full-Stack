package collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class BeerInfo {

	private int no;
	private String name;
	private int price;

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

	public BeerInfo() {
		super();
	}

	public BeerInfo(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + price;
	}

}

public class List2_ArrayList007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<BeerInfo> blist = new ArrayList<>();

		BeerInfo av2 = new BeerInfo(2, "호가든", 3500);
		blist.add(new BeerInfo(1, "카스", 2500));
		blist.add(av2);
		blist.add(new BeerInfo(3, "맥스", 2700));
		
		List<BeerInfo> blist2 = new ArrayList<>();

		blist.add(new BeerInfo(4, "카스", 2500));
		blist.add(new BeerInfo(5, "호가든", 3500));
		blist.add(new BeerInfo(6, "맥스", 2700));
		
		blist.addAll(blist2);
		BeerInfo[] arr = (BeerInfo[])blist.toArray();

		Iterator<BeerInfo> beerlist = blist.iterator();

		System.out.println("========================");
		System.out.println("NO\tNAME\tPRICE");
		System.out.println("========================");
		while (beerlist.hasNext()) {

			BeerInfo item = beerlist.next();

			if (item.getName().equals("호가든")) {
				item.setName("호가든(★)");
			}
			System.out.println(item);

		}

	}

}
