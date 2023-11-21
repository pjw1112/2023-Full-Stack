package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. Consumer<T> 받는 용도 - accept 
		 * 2. Supplier<T> 제공 용도 - get 
		 * 3. Predicate<T> 판단 용도 - test ( true / false ) 
		 * 4. Function<T,R> 처리 용도 - apply # 
		 * 5. Operator<T> 연산
		 * 용도 - apply
		*/
		
		//1. list 준비
		List<Integer> list = Arrays.asList(1,2,3,4,5,2,4);
				
		//2. filter (특정값 걸러내기)
		list.stream().filter(t -> t>3).forEach(t -> System.out.print(t+"\t"));
		System.out.println();
		System.out.println( list.stream().filter(t -> t%2==0).collect(Collectors.toList()));
		System.out.println( Arrays.stream(new int[]{1,2,3,4,5,2,4}).boxed().filter(t -> t%2==0).collect(Collectors.toList()));
		
		
		System.out.println();
		
		//3. distinct(중복 생략)
		list.stream().distinct().forEach(t -> System.out.print(t+"\t"));
		System.out.println();
	
		//4. skip(갯수)
		list.stream().skip(1).forEach(t -> System.out.print(t+"\t")); // .skip(num) 앞에서부터 num 개 제외하고 
		System.out.println();
		//5. findFirst
		
		
		//6. limit 갯수 제한
		
		
		//7. map(원하는 대로 가공)
		System.err.println( Arrays.stream(new int[]{1,2,3,4,5,2,4}).boxed().map(t ->t*2 ).collect(Collectors.toList()));
		Arrays.stream(new int[]{1,2,3,4,5,2,4}).boxed().map(t ->t*2 ).forEach(t -> System.out.print(t+"\t"));
		System.out.println();
		System.out.println( Arrays.stream(new int[]{1,2,3,4,5,2,4}).sum() );
		
		IntStream st = "안 녕 하세 요 . 반 갑 습 니 다. 제 이 름 은 박 진 우 입 니 다.".chars();
		
		st.filter(value ->value!=32).forEach(value -> System.out.print((char)value));
		
		
		
		
		
		
	}

}
