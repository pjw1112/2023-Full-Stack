package Json_Ex;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

class UserInfo{
	
	private String name;
	private int age;
	private String loc;
	public UserInfo() {
		super();
	}
	public UserInfo(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	
	
}


public class Json001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Json 이란? { "name" : "sally", "age" : "3", "loc" : "경기" } 키 - 값 쌍으로 이루어진 데이터
		// https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.7 여기에서 GSON JAR 파일을 라이브러리에 추가
		
		
		// 1. Json 객체를 만들어서 객체안에 키-값 추가하기
		JsonObject job = new JsonObject(); 
		job.addProperty("name", "sally"); 
		job.addProperty("age", 3);
		job.addProperty("loc", "경기");
		System.out.println(job);
		
		
		// 2. Json 객체를  String 으로 변환
		Gson gson = new Gson();
		String str = gson.toJson(job);
		System.out.println(str);
		
		// 3. class 객체를 String으 으로 변환
		Gson gson2 = new Gson();
		String str2 = gson2.toJson(new UserInfo("sally",3 ,"경기"));
		System.out.println(str2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
