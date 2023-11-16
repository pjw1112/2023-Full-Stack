package collection_Framework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class CurrentTimeMillis {
	public static void main(String[] args) {
				
		UserInfo008 aa = new UserInfo008(1,"하이");
		UserInfo008 bb = new UserInfo008(1,"하이");
		UserInfo008 aa2 = new UserInfo008();
		UserInfo008 bb2 = new UserInfo008();
		System.out.println(aa.hashCode());
		System.out.println(bb.hashCode());
		System.out.println(aa2.hashCode());
		System.out.println(bb2.hashCode());
		
	}

}
