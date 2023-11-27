package Json_Ex;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Json002_jsonArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[{},{}]배열안에 JsonObject 객체 여러개 넣기
		JsonObject job = new JsonObject();
		job.addProperty("name", "sally"); 
		job.addProperty("age", 3);
		job.addProperty("loc", "경기");
		
		JsonObject job2 = new JsonObject();
		job2.addProperty("name", "jin"); 
		job2.addProperty("age", 4);
		job2.addProperty("loc", "시흥");
		
		JsonObject job3 = new JsonObject();
		job3.addProperty("name", "hue"); 
		job3.addProperty("age", 5);
		job3.addProperty("loc", "군산");
		
		JsonArray arr = new JsonArray();
		arr.add(job);
		arr.add(job2);
		arr.add(job3);
		
		System.out.println(arr);
		
		
		
		
		
	}//end main

}//end class
