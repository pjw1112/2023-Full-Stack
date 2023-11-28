package Json_Ex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;




public class Json003_jsonParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gson myGson = new Gson();
		
		JsonObject jo = new JsonObject();
		jo.addProperty("name", "alpha");
		jo.addProperty("age", 17);
		jo.addProperty("loc", "양재동");
		String result = myGson.toJson(jo) ;
		System.out.println( result);
				
		JsonParser jparser = new JsonParser();
		
		// jparser 를 이용해서 문자열을 JsonObject 객체로 변환
		JsonObject jo2 = (JsonObject) jparser.parse(result);
		
		String name = jo2.get("name").getAsString();
		String age = jo2.get("age").getAsString();
		String loc = jo2.get("loc").getAsString();
		
		System.out.println(name+"\t"+age+"\t"+loc);
				
		JsonArray jsonarray = new JsonArray();
		
//		Gson gs = new Gson();
//		gs.toJson(new user("sally", 17));
//		jsonarray.add(gs.toJsonTree(new user("jinwoo", 37)) );
//		jsonarray.add(gs.toJsonTree(new user("new", 27)) );
//		System.out.println(jsonarray);
//		
//		user myuser = gs.fromJson(gs.toJson(jsonarray.get(0)),user.class );
//		
//		System.out.println(myuser.toString());
//		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
