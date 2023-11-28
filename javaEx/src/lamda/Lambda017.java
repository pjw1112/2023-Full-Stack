package lamda;

import java.util.Arrays;

interface InterA17{
	int[] methodA(int len);
}

public class Lambda017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterA17 test;
		int[] arr;
		
		test= len -> {return new int[len];}; //이거랑
		
		arr = test.methodA(5);
		System.out.println(Arrays.toString(arr));
		
		test = int[]::new;
		
		arr = test.methodA(5);				//이거랑 두개 같음
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
