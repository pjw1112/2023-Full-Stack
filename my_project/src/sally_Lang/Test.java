package sally_Lang;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hi");
		try {
			
			Class.forName("java.lang.Floa");
			System.out.println("있음");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
