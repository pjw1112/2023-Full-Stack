package stream;

import java.util.Arrays;
import java.util.List;

public class Stream009 {

	public static void main(String[] args) {
		
				/* 1. Consumer<T> 받는 용도 - accept 
				 * 2. Supplier<T> 제공 용도 - get 
				 * 3. Predicate<T> 판단 용도 - test ( true / false ) 
				 * 4. Function<T,R> 처리 용도 - apply # 
				 * 5. Operator<T> 연산
				 * 용도 - apply
				*/
				List<Integer> list = Arrays.asList(1,2,3,4,5,2,4);
				int[] arr = {1,2,3,4,5,2,4};
		
				
				// 2. count
				System.out.println(Arrays.stream(arr).count());
				System.out.println(list.stream().count());
		
				// 3. sum
				System.out.println(Arrays.stream(arr).distinct().sum());
				System.out.println(list.stream().distinct().mapToInt(value -> value).sum());
				
				// 4. average
				System.out.println(Arrays.stream(arr).average().getAsDouble());
				System.out.println(list.stream().distinct().mapToInt(value -> value).average().getAsDouble());
		
				// 5. max
				System.out.println(Arrays.stream(arr).max().getAsInt());
				System.out.println(list.stream().distinct().mapToInt(value -> value).max().getAsInt());
		
				// 6. min
				System.out.println(Arrays.stream(arr).min().getAsInt());
				System.out.println(list.stream().distinct().mapToInt(value -> value).min().getAsInt());
		
				// 7. reduce
				System.out.println(Arrays.stream(arr).distinct().filter(value ->value%2==0).reduce(5, (left, right) ->left+right ));
				System.out.println(list.stream().distinct().filter(value ->value%2==0).reduce(0, (left, right) ->left+right ));		
				System.out.println(Arrays.stream(arr).reduce(0, (left, right) -> left+right));
		
				System.err.println(Arrays.stream(arr).average().getAsDouble());
				
				
		
	}

}
