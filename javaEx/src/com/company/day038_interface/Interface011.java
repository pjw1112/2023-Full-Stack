package com.company.day038_interface;

interface Vehicle011{
	int MAX_SPEED = 400;
	int MIN_SPEED = 0;
	void start();
	void turnoff();
	void setSpeed(int speed);
	
	
	default void setDrive(boolean driving){
		if(driving) {
			System.out.println("운전 중 입니다.");
		}else {
			System.out.println("정지 중 입니다.");
		}
	}
	
	static void police() {
		System.out.println("위급시 경찰 연락!");
	}
		
}
class a{
	static void my() {
		System.out.println("응 내가 짱이야");
	}
}
class b extends a{
	
}

public class Interface011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle011 mycar =new Vehicle011() {
			
			@Override
			public void turnoff() {
				// TODO Auto-generated method stub
				System.out.println("POWER OFF");
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("POWER ON");
				
			}
			
			@Override
			public void setSpeed(int speed) {
				// TODO Auto-generated method stub
				System.out.println("스피드 : "+ speed+"km");
				
			}
			
		};
		
		mycar.start();
		mycar.setDrive(true);
		mycar.setSpeed(150);
		mycar.setSpeed(60);
		mycar.turnoff();
		Vehicle011.police();
		
		
		
	}

}
