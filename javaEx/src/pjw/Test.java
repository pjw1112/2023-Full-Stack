package pjw;

import java.awt.Toolkit;

class me implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			System.out.println("꿀꿀");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class me2 implements Runnable {

	// 비프음
	Toolkit toolkit = Toolkit.getDefaultToolkit();

	@Override
	public void run() {

		try {
			System.out.println("멍멍");
			// TODO Auto-generated method stub
			while (true) {
				toolkit.beep();
				System.out.print("(삡-!)");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


class me3 implements Runnable {

	// 비프음
	Toolkit toolkit = Toolkit.getDefaultToolkit();

	@Override
	public void run() {

		try {
			System.out.println("야옹");
			// TODO Auto-generated method stub
			while (true) {
				toolkit.beep();
				System.out.print("(삡-!)");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}


class me4 implements Runnable {

	// 비프음
	Toolkit toolkit = Toolkit.getDefaultToolkit();

	@Override
	public void run() {

		try {
			Thread.sleep(30);
			// TODO Auto-generated method stub
			while (true) {
				toolkit.beep();
				System.out.print("(삡-!)");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class Test {
	public static void main(String[] args) {

		Thread[] mythread = { new Thread(new me()), new Thread(new me2()), new Thread(new me3()),
				new Thread(new me4()) };

		for (Thread item : mythread) {
			item.start();
		}

	}

}
