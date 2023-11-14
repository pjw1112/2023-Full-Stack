package com.company.day048;


class Animal3{
	
}

class Dog3 extends Animal3{
	
}

class Cat3 extends Animal3{
	
}




class G3_1{ 
	private Animal3 ani;
	public Animal3 getAni() { return ani; }
	public void setAni(Animal3 ani) { this.ani = ani; }
}// end class
 
class G3_2{ 
	private Dog3 ani;
	public Dog3 getAni() { return ani; }
    public void setAni(Dog3 ani) { this.ani = ani; } 
}// end class

class G3_3{ 
	private Cat3 ani;
    public Cat3 getAni() { return ani; }
    public void setAni(Cat3 ani) { this.ani = ani; } 
}// end class




class G3<G>{
	private G ani;

	public G getAni() {
		return ani;
	}

	public void setAni(G ani) {
		this.ani = ani;
	}

	@Override
	public String toString() {
		return "G3 [ani=" + ani + "]";
	}
	
}



public class Generic003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G3<Animal3> g1 = new G3<>();
		g1.setAni(new Animal3());
		Animal3 test = g1.getAni();
		
		
		
		
		
	}

}
