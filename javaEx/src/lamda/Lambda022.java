package lamda;

import java.util.Arrays;
import java.util.stream.Stream;

interface Test22 {
	Stream<String> methodA(String[] arr);
}

public class Lambda022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test22 test1 = arr -> Arrays.stream(arr);

		Stream<String> stream1 = test1.methodA(new String[] { "A", "B", "C" });
		stream1.forEach(data -> System.out.print(data + "\t"));
		System.out.println();

		//
		Test22 test2 = Arrays::stream;

		Stream<String> stream2 = test2.methodA(new String[] { "A", "B", "C" });
		stream2.forEach(data -> System.out.print(data + "\t"));
		System.out.println();

		
		
		
		
		
		
	}

}
