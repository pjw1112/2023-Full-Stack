package practice;

class MyException extends RuntimeException{
	
	public MyException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "myException [toString()=" + super.toString() + "]";
	};
	
	
}



public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			MyException mimi = new MyException();
			
			throw mimi;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
