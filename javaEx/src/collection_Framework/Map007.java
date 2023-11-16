package collection_Framework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = { "A", "D", "B", "D", "B", "D", "B", "C", "E", "C", "B" };

		Map<String, Integer> map = new HashMap<>();

		for (String str : data) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {

				map.put(str, 1);
			}

		}

		int MaxValue = Collections.max(map.values());
		String king = "";

		for (Entry<String, Integer> et : map.entrySet()) {

			String shaps = "";
			for (int i = 0; i < et.getValue(); i++) {
				shaps += "#";
			}
			System.out.println(et.getKey() + " : " + et.getValue() + shaps);

			if (MaxValue == et.getValue()) {
				king = et.getKey();
			}
		}

		System.out.println("보험왕 > [" + king+"]");

	}

}
