package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Repeat {

	public static void main(String[] args) {
	      // Q1.  매개변수의 유무와 리턴값의 유무를 적으시오.
	      // Consumer(accect)  매개변수 o  /  리턴 x - void
	      // Supplier(get   )  매개변수 x  /  리턴 o
	      // Function(apply )  매개변수 o  /  리턴 o - 받아서 처리
	      // Operator(apply )  매개변수 o  /  리턴 o
	      // Predicate(test )  매개변수 o  /  리턴 o - boolean
	      
	       //#1. 1,2,3,4,5,2,4  list 준비
	      List<Integer> list = Arrays.asList(1,2,3,4,5,2,4);
	      int [] arr = {1,2,3,4,5,2,4};
	      String [] arr2 = {"안녕","반갑","하이","헬로","빡싱","안녕"};
	      System.out.println( Arrays.stream(arr2).count() );
	      // Q2. array를  스트림으로 변환한다음  
	      //     중복제거, 정렬, 2개 sip 하고 리스트로변환하여 출력하시오. 
	       System.out.println(  Arrays.stream(arr).distinct().sorted().skip(2).boxed().collect(Collectors.toList()) );
	      // Q3. list를   스트림으로 변환한다음  
	      //      중복제거, 정렬, 2개 sip 하고 리스트로변환하여 출력하시오. 
	       System.out.println( list.stream().distinct().sorted().skip(2).collect(Collectors.toList()) );
	      // Q4. array를  스트림으로 변환한다음  
	      //      중복제거 , 짝수만찾아서, 다음과 같이 중간결과물이 보이게 합(sum)을 구하시오.
	       System.out.println(  Arrays.stream(arr).distinct().filter(value -> value%2==0 ).sum() );
	       
	      int sum=0;
	      //### 코드작성
	      System.out.println("="+sum);  //결과물
	      
	      
	      // Q5. array를  스트림으로 변환한다음  
	      // 중복제거 , 짝수만찾아서, 다음과 같이 중간결과물이 보이게 합(sum)을 구하시오.
	      //### 코드작성
	      System.out.println("="+sum); // 결과물
	      

		
	}

}
