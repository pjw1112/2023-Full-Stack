package com.company.day038_interface;

interface Vehicle010{
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




public class Interface010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle010 rc;
		rc = new Motocycle010();
		rc.start();
		rc.turnoff();
		System.out.println();
		rc = new Vehicle010() {
			
			@Override
			public void turnoff() {
				// TODO Auto-generated method stub
				System.out.println("자동차에 시동 꺼라");
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSpeed(int speed) {
				// TODO Auto-generated method stub
				
			}
		};
		
		rc.turnoff();
		Vehicle010.police();
		
		
	}

}
