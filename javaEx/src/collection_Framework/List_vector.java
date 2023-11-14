package collection_Framework;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class List_vector {
	public static void main(String[] args) {
		// 1. 배열과 비교 - 문자열 3개 
		String[] color = {"red","green","blue"};
		System.out.println(Arrays.toString(color));
		// 2. 데이터를 더 늘리고자함 -orange, black 추가
		
		String[] color2 =  {"yellow","green","blue","orange","black"};
		System.arraycopy(color2, 0, color, 0, 3);
//		color = color2;
		System.out.println(Arrays.toString(color));
		
		// 배열은 매번 배열의 사이즈를 고려해야 함 (정적 관리)
		// 콜렉션 프레임웤 > 사이즈 고려 안해도 됨 (동적 관리)
		
		
		List vector = new Vector();
		vector.add(3.14);
		vector.add(100); // vector.add(new Integer(100));
		vector.add(3.14); // 오브젝트를 받기 때문에 자동 오토박싱
		vector.add("ABC");
		vector.add(3.14);
		
		System.out.println(vector.toString());
		
		System.out.println("1. <> 설정 안했을때 요술 주머니 : 어떤 객체든 집어 넣을 수 있음");
		System.out.println("2. 데이터 삽입은 add ");
		System.out.println("3. 데이터 꺼내오기 get " + vector.get(0));
		System.out.println("4. size 갯수 : "+ vector.size());
		System.out.println("5. remove : "+vector.remove(3.14));
		System.out.println(vector.toString());
		System.out.println("6. 이거있어? : " + vector.contains("ABC"));
		
		System.out.println("generics");
		
		List<Integer> vector2 = new Vector<Integer>();
		vector2.add(100);
		vector2.add((int)3.14);
//		vector2.add((int)"abc");
		
		
		
		
		
		
		
		
	}
}

/* 배열의 단점 개선 - 동적으로 크기 조절 가능
 * 순서(index) 있음
 * 데이터 중복 허용
 * Vector, ArrayList, LinkedList
 * 
 * 
 * 
 * 
 * 
 * 
 */