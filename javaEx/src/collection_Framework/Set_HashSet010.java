package collection_Framework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Member10 {
	public String name;
	public int age;

	public Member10() {
		super();
	}

	public Member10(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		Member10 other = (Member10) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}

public class Set_HashSet010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Member10> set = new HashSet<>();

		set.add(new Member10("Sally", 10)); // 1. new {}, 초기화, 지번 리턴
		set.add(new Member10("Sally", 10));
		set.add(new Member10("Sally", 10));

		System.out.println("총 객체수 : " + set.size());

	}

}
