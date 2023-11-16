package collection_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("first", "하나");
		myMap.put("second", "둘");
		myMap.put("third", "셋");
		myMap.put("four", "넷");
		myMap.put("five", "다섯");

		System.out.println("=================================");
		System.out.println("KEY\tVALUE");
		System.out.println("=================================");
		Iterator<String> str = myMap.keySet().iterator();
		while (str.hasNext()) {
			String string = (String) str.next();

			System.out.println(string + "\t" + myMap.get(string));
		}
		System.out.println("=================================");
		System.out.println("KEY\tVALUE");
		System.out.println("=================================");

		Iterator<Entry<String, String>> it = myMap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}

	}

}
