package collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class List2_ArrayList011 {

	static List<String> list = new Vector<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메인 스타트==========");

		Thread thread = new Thread(() -> {

			list.add("111");
			list.add("222");
			list.add("333");
			list.add("444");
			list.add("555");
			list.add("666");

			String[] arr = list.toArray(new String[0]);

			list.forEach((data) -> {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("DATA : " + data);
			});

		});

		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		list.add("555");

		System.out.println("메인 엔드===========");

	}

}
