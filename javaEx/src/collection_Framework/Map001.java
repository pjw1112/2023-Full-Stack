package collection_Framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// put, get, size, remove, containsKey, containsValue, KeySet, entySet
		
		Map<String,String> map = new HashMap<>();
		map.put("유저1", "하나");
		map.put("유저1", "둘");
		map.put("유저2", "셋");
		map.put("유저3", "넷");
		System.out.println(map);
		System.out.println(map.get("유저2"));
		System.out.println(map.size());
		System.out.println(map.remove("유저3"));
		System.out.println(map);
		
		System.err.println(map.keySet());
		System.err.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.containsKey("유저2"));
		System.out.println(map.containsKey("유저3"));
		
		System.out.println();
		Iterator<String> mapKey = map.keySet().iterator();
		
		
		Iterator<Entry<String, String>> it3 = map.entrySet().iterator();
		
		while (it3.hasNext()) {
			Map.Entry<String, String> entry = it3.next();
			
		}
		
		
		
		
		
		
		
		
		
	}

}
