package collection_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class UserInfo008 {
	
	public int no;
	public String name;

	public UserInfo008() {
		super();
	}

	public UserInfo008(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo008 other = (UserInfo008) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}
	 public int hashCode() {
		 
	 };

}

public class Map008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<UserInfo008, Integer> map = new HashMap<UserInfo008, Integer>();
		map.put(new UserInfo008(1, "sally"), 100);
		map.put(new UserInfo008(1, "sally"), 100);
		map.put(new UserInfo008(1, "sally"), 100);
		map.put(new UserInfo008(1, "sally"), 100);
		System.out.println("TOTAL : " + map.size());
		
	}

}
