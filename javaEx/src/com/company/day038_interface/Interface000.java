package com.company.day038_interface;

class Button {

	OnClickListener ocl;
	

	interface OnClickListener {
		void onClick();
	}

	void setOnClickListener(OnClickListener ocl) {
		this.ocl = ocl;
	}
	
	void click() {
		ocl.onClick();
	}
	
	
}

public class Interface000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Button button1 = new Button();
		
		button1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("버튼이 눌렀셧습니다!");
			}
		});
		
		button1.click();
		
		
	}

}
