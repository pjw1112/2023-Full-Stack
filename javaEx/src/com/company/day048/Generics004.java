package com.company.day048;

class Color {

	@Override
	public String toString() {
		return "color :D";
	}

}

class Red extends Color {
	@Override
	public String toString() {
		return "Red O_O";
	}
}

class Green extends Color {
	@Override
	public String toString() {
		return "Green ^_^";
	}
}

class G<data> {
	private data dt;

	public G() {

	}

	public G(data dt) {
		super();
		this.dt = dt;
	}

	public data getDt() {
		return dt;
	}

	public void setDt(data dt) {
		this.dt = dt;
	}

}

public class Generics004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("제너릭 작성시 1");
		G<Color> col = new G<>();
		col.setDt(new Color());
		Color test = col.getDt();
		System.out.println(test);

		col.setDt(new Red());
		test = col.getDt();
		System.out.println(test);

		col.setDt(new Green());
		test = col.getDt();
		System.out.println(test);

		System.out.println();
		System.out.println("오류 수정");

		G<?> gg = new G<Color>(new Color());
		System.out.println(gg.getDt());

		gg = new G<Color>(new Red());
		System.out.println(gg.getDt());

		gg = new G<Color>(new Green());
		System.out.println(gg.getDt());

		
		
		
	}

}
