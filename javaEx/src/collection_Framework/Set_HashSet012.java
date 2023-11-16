package collection_Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Dog12 {

	private String name;
	private int age;

	public Dog12() {
		super();
	}

	public Dog12(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " / " + age + "살";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog12 other = (Dog12) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}

public class Set_HashSet012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Dog12> doglist = new HashSet<Dog12>();
		doglist.add(new Dog12("white", 3));
		doglist.add(new Dog12("black", 7));
		doglist.add(new Dog12("brown", 2));
		doglist.add(new Dog12("white", 3));

		
		Iterator<Dog12> it = doglist.iterator();

		int i = 1;
		while (it.hasNext()) {
			System.out.println((i++) + "번 : " + it.next());
		}

		System.out.print("원하는 강아지 이름 입력 >>");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		it = doglist.iterator();
		while (it.hasNext()) {
			Dog12 item = it.next();
			
			if(item.getName().equals(name)) {
			
			System.out.println(item.getAge()+"살");
			break;
			}
		}
		
		
		
		
		
		

	}

}
