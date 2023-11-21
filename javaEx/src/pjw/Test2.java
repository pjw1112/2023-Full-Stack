package pjw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class UserInfo4 {
	private String name;
	private int age;

	public UserInfo4() {
		super();
	}

	public UserInfo4(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserInfo4 [name=" + name + ", age=" + age + "]";
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
}

public class Test2 {
	public static void main(String[] args) {
		UserInfo4[] userDatas = { 
				new UserInfo4("아이언맨", 50), 
				new UserInfo4("헐크", 40), 
				new UserInfo4("캡틴", 120) 
				};
	
		System.out.println(":::::::::::::::");
		System.out.println("NAME\tAGE");
		
		List<UserInfo4> list = Arrays.asList(userDatas);
		for(UserInfo4 item : list) {
			System.out.println("----------------");
			System.out.println(item.getName()+"\t"+item.getAge());
		}
	
		System.err.println("################");
		Set<UserInfo4> list2 = new HashSet<UserInfo4>();
		for(UserInfo4 item : userDatas) {
			list2.add(item);
		}
		
		for(UserInfo4 item : list2) {
			System.out.println("----------------");
			System.out.println(item.getName()+"\t"+item.getAge());
		}
		 
		System.err.println("################");
		Map<String, Integer> list3 = new HashMap<String, Integer>();
		for(UserInfo4 item : userDatas) {
			list3.put(item.getName(),item.getAge());
		}
		
		for(Entry<String, Integer> item : list3.entrySet()) {
			System.out.println("----------------");
			System.out.println(item.getKey()+"\t"+item.getValue());
		}
		
		
		
		
	
	
	}
}