package pjw;

public class Q010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//출력값 예측
		int a = 3;
		int b = 7;
		int c = 5;
		System.out.println( (a>b) ?   
				 					(a>c) ? a : c//5
				 									  :
				 										  (b>c)?b:c/*7*/   );//7
											
		
	}

}
