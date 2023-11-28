package lamda;

interface Test21 {
	int[] methodA(int len);
}

public class Lambda021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test21 test1 = new Test21() {

			@Override
			public int[] methodA(int len) {
				// TODO Auto-generated method stub
				return new int[len];
			}
		};
		int[] array1 = test1.methodA(3);
		System.out.println(array1.length);

		Test21 test2 = len -> new int[len];
		int[] array2 = test2.methodA(3);
		System.out.println(array2.length);

		Test21 test3 = int[]::new;
		int[] array3 = test3.methodA(3);
		System.out.println(array3.length);

	}

}
